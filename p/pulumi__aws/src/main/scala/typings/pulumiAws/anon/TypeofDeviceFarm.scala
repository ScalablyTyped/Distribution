package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDeviceFarm extends js.Object {
  val Types: this.type = js.native
}

object TypeofDeviceFarm {
  @scala.inline
  def apply(Types: TypeofDeviceFarm): TypeofDeviceFarm = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDeviceFarm]
  }
  @scala.inline
  implicit class TypeofDeviceFarmOps[Self <: TypeofDeviceFarm] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofDeviceFarm): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

