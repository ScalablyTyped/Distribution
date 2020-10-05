package typings.reactBigCalendar.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait components extends js.Object {
  var dateCellWrapper: ComponentType[js.Object] = js.native
  var eventWrapper: ComponentType[Event] = js.native
}

object components {
  @scala.inline
  def apply(dateCellWrapper: ComponentType[js.Object], eventWrapper: ComponentType[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[components]
  }
  @scala.inline
  implicit class componentsOps[Self <: components] (val x: Self) extends AnyVal {
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
    def setDateCellWrapper(value: ComponentType[js.Object]): Self = this.set("dateCellWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventWrapper(value: ComponentType[Event]): Self = this.set("eventWrapper", value.asInstanceOf[js.Any])
  }
  
}

