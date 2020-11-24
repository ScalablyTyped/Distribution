package typings.reactBigCalendar.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactBigCalendar.anon.CSSPropertiesxOffsetnumbe
import typings.reactBigCalendar.anon.DayProp
import typings.reactBigCalendar.anon.Start
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventWrapperProps[TEvent /* <: js.Object */] extends js.Object {
  
  var accessors: Start[TEvent] = js.native
  
  var className: String = js.native
  
  var continuesEarlier: Boolean = js.native
  
  var continuesLater: Boolean = js.native
  
  var event: TEvent = js.native
  
  var getters: DayProp[TEvent] = js.native
  
  var isRtl: Boolean = js.native
  
  var label: String = js.native
  
  def onClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  
  def onDoubleClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  
  var selected: Boolean = js.native
  
  // https://github.com/intljusticemission/react-big-calendar/blob/27a2656b40ac8729634d24376dff8ea781a66d50/src/TimeGridEvent.js#L28
  var style: js.UndefOr[CSSPropertiesxOffsetnumbe] = js.native
}
object EventWrapperProps {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    accessors: Start[TEvent],
    className: String,
    continuesEarlier: Boolean,
    continuesLater: Boolean,
    event: TEvent,
    getters: DayProp[TEvent],
    isRtl: Boolean,
    label: String,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    onDoubleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    selected: Boolean
  ): EventWrapperProps[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], continuesEarlier = continuesEarlier.asInstanceOf[js.Any], continuesLater = continuesLater.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWrapperProps[TEvent]]
  }
  
  @scala.inline
  implicit class EventWrapperPropsOps[Self <: EventWrapperProps[_], TEvent /* <: js.Object */] (val x: Self with EventWrapperProps[TEvent]) extends AnyVal {
    
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
    def setAccessors(value: Start[TEvent]): Self = this.set("accessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuesEarlier(value: Boolean): Self = this.set("continuesEarlier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuesLater(value: Boolean): Self = this.set("continuesLater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: TEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetters(value: DayProp[TEvent]): Self = this.set("getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRtl(value: Boolean): Self = this.set("isRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSPropertiesxOffsetnumbe): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
