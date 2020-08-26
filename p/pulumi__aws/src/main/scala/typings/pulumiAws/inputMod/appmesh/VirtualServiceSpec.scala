package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpec extends js.Object {
  /**
    * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
    */
  var provider: js.UndefOr[Input[VirtualServiceSpecProvider]] = js.native
}

object VirtualServiceSpec {
  @scala.inline
  def apply(): VirtualServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceSpec]
  }
  @scala.inline
  implicit class VirtualServiceSpecOps[Self <: VirtualServiceSpec] (val x: Self) extends AnyVal {
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
    def setProvider(value: Input[VirtualServiceSpecProvider]): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

