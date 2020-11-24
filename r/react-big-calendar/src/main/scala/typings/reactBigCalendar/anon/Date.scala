package typings.reactBigCalendar.anon

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.EventProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date[TEvent /* <: js.Object */] extends js.Object {
  
  var date: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.native
  
  var time: js.UndefOr[ComponentType[js.Object]] = js.native
}
object Date {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): Date[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date[TEvent]]
  }
  
  @scala.inline
  implicit class DateOps[Self <: Date[_], TEvent /* <: js.Object */] (val x: Self with Date[TEvent]) extends AnyVal {
    
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
    def setDate(value: ComponentType[js.Object]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEvent(value: ComponentType[EventProps[TEvent]]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setTime(value: ComponentType[js.Object]): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
