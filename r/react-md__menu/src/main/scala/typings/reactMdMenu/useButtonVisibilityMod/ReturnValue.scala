package typings.reactMdMenu.useButtonVisibilityMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactMdMenu.useVisibilityMod.FocusType
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<std.Pick<react.react.HTMLAttributes<std.HTMLButtonElement>, 'onClick' | 'onKeyDown'>> */
@js.native
trait ReturnValue extends js.Object {
  
  var defaultFocus: FocusType = js.native
  
  def hide(): Unit = js.native
  
  var onClick: MouseEventHandler[HTMLButtonElement] = js.native
  
  var onKeyDown: KeyboardEventHandler[HTMLButtonElement] = js.native
  
  var visible: Boolean = js.native
}
object ReturnValue {
  
  @scala.inline
  def apply(
    defaultFocus: FocusType,
    hide: () => Unit,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    onKeyDown: KeyboardEvent[HTMLButtonElement] => Unit,
    visible: Boolean
  ): ReturnValue = {
    val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
    
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
    def setDefaultFocus(value: FocusType): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
