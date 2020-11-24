package typings.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTriggerPropsArg
  extends /* key */ StringDictionary[js.Any] {
  
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onContextMenu: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onMouseMove: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
}
object GetTriggerPropsArg {
  
  @scala.inline
  def apply(): GetTriggerPropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggerPropsArg]
  }
  
  @scala.inline
  implicit class GetTriggerPropsArgOps[Self <: GetTriggerPropsArg] (val x: Self) extends AnyVal {
    
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
    def setOnBlur(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
  }
}
