package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionRoute extends js.Object {
  var destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  var source: js.UndefOr[Input[String]] = js.native
  var state: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionRoute {
  @scala.inline
  def apply(): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionRoute]
  }
  @scala.inline
  implicit class VpnConnectionRouteOps[Self <: VpnConnectionRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationCidrBlock(value: Input[String]): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("destinationCidrBlock", js.undefined)
    @scala.inline
    def setSource(value: Input[String]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

