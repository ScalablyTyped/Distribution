package typings.reactBigCalendar.anon

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.EventProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateHeader[TEvent /* <: js.Object */] extends js.Object {
  
  var dateHeader: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.native
  
  var header: js.UndefOr[ComponentType[js.Object]] = js.native
}
object DateHeader {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): DateHeader[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateHeader[TEvent]]
  }
  
  @scala.inline
  implicit class DateHeaderOps[Self <: DateHeader[_], TEvent /* <: js.Object */] (val x: Self with DateHeader[TEvent]) extends AnyVal {
    
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
    def setDateHeader(value: ComponentType[js.Object]): Self = this.set("dateHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateHeader: Self = this.set("dateHeader", js.undefined)
    
    @scala.inline
    def setEvent(value: ComponentType[EventProps[TEvent]]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setHeader(value: ComponentType[js.Object]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
