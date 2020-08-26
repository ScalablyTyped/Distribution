package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterSpec extends js.Object {
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from.
    * Currently only one listener is supported per virtual router.
    */
  var listener: VirtualRouterSpecListener = js.native
}

object VirtualRouterSpec {
  @scala.inline
  def apply(listener: VirtualRouterSpecListener): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpec]
  }
  @scala.inline
  implicit class VirtualRouterSpecOps[Self <: VirtualRouterSpec] (val x: Self) extends AnyVal {
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
    def setListener(value: VirtualRouterSpecListener): Self = this.set("listener", value.asInstanceOf[js.Any])
  }
  
}

