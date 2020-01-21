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
  def apply(
    destinationCidrBlock: Input[String] = null,
    source: Input[String] = null,
    state: Input[String] = null
  ): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal()
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionRoute]
  }
}

