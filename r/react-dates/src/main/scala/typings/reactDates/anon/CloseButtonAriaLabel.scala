package typings.reactDates.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButtonAriaLabel extends StObject {
  
  var closeButtonAriaLabel: String
  
  var keyboardShortcuts: js.Array[Recordunicodelabelactions]
  
  var onCloseButtonClick: MouseEventHandler[Element]
  
  var onKeyDown: KeyboardEventHandler[Element]
  
  var title: String
}
object CloseButtonAriaLabel {
  
  inline def apply(
    closeButtonAriaLabel: String,
    keyboardShortcuts: js.Array[Recordunicodelabelactions],
    onCloseButtonClick: MouseEvent[Element, NativeMouseEvent] => Unit,
    onKeyDown: KeyboardEvent[Element] => Unit,
    title: String
  ): CloseButtonAriaLabel = {
    val __obj = js.Dynamic.literal(closeButtonAriaLabel = closeButtonAriaLabel.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], onCloseButtonClick = js.Any.fromFunction1(onCloseButtonClick), onKeyDown = js.Any.fromFunction1(onKeyDown), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseButtonAriaLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseButtonAriaLabel] (val x: Self) extends AnyVal {
    
    inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcuts(value: js.Array[Recordunicodelabelactions]): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcutsVarargs(value: Recordunicodelabelactions*): Self = StObject.set(x, "keyboardShortcuts", js.Array(value*))
    
    inline def setOnCloseButtonClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
