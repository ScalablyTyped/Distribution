package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIoT1ClickDevicesSer extends js.Object {
  val Types: this.type = js.native
}

object TypeofIoT1ClickDevicesSer {
  @scala.inline
  def apply(Types: TypeofIoT1ClickDevicesSer): TypeofIoT1ClickDevicesSer = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIoT1ClickDevicesSer]
  }
  @scala.inline
  implicit class TypeofIoT1ClickDevicesSerOps[Self <: TypeofIoT1ClickDevicesSer] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofIoT1ClickDevicesSer): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

