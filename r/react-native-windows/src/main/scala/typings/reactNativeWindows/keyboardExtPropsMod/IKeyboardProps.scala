package typings.reactNativeWindows.keyboardExtPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyboardProps extends js.Object {
  
  var keyDownEvents: js.UndefOr[js.Array[IHandledKeyboardEvent]] = js.native
  
  var keyUpEvents: js.UndefOr[js.Array[IHandledKeyboardEvent]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.native
  
  var onKeyDownCapture: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.native
  
  var onKeyUp: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.native
  
  var onKeyUpCapture: js.UndefOr[js.Function1[/* args */ IKeyboardEvent, Unit]] = js.native
}
object IKeyboardProps {
  
  @scala.inline
  def apply(): IKeyboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyboardProps]
  }
  
  @scala.inline
  implicit class IKeyboardPropsOps[Self <: IKeyboardProps] (val x: Self) extends AnyVal {
    
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
    def setKeyDownEventsVarargs(value: IHandledKeyboardEvent*): Self = this.set("keyDownEvents", js.Array(value :_*))
    
    @scala.inline
    def setKeyDownEvents(value: js.Array[IHandledKeyboardEvent]): Self = this.set("keyDownEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyDownEvents: Self = this.set("keyDownEvents", js.undefined)
    
    @scala.inline
    def setKeyUpEventsVarargs(value: IHandledKeyboardEvent*): Self = this.set("keyUpEvents", js.Array(value :_*))
    
    @scala.inline
    def setKeyUpEvents(value: js.Array[IHandledKeyboardEvent]): Self = this.set("keyUpEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUpEvents: Self = this.set("keyUpEvents", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* args */ IKeyboardEvent => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownCapture(value: /* args */ IKeyboardEvent => Unit): Self = this.set("onKeyDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: /* args */ IKeyboardEvent => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnKeyUpCapture(value: /* args */ IKeyboardEvent => Unit): Self = this.set("onKeyUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
  }
}
