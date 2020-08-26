package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortMapping extends js.Object {
  var containerPort: js.UndefOr[Double] = js.native
  var hostPort: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[Protocol] = js.native
}

object PortMapping {
  @scala.inline
  def apply(): PortMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortMapping]
  }
  @scala.inline
  implicit class PortMappingOps[Self <: PortMapping] (val x: Self) extends AnyVal {
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
    def setContainerPort(value: Double): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPort: Self = this.set("containerPort", js.undefined)
    @scala.inline
    def setHostPort(value: Double): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostPort: Self = this.set("hostPort", js.undefined)
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

