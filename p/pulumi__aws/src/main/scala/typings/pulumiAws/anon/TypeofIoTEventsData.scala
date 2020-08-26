package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIoTEventsData extends js.Object {
  val Types: this.type = js.native
}

object TypeofIoTEventsData {
  @scala.inline
  def apply(Types: TypeofIoTEventsData): TypeofIoTEventsData = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIoTEventsData]
  }
  @scala.inline
  implicit class TypeofIoTEventsDataOps[Self <: TypeofIoTEventsData] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofIoTEventsData): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

