package typings.reactMdMenu.anon

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<@react-md/menu.@react-md/menu/types/types.MenuProps, 'id' | 'style' | 'visible' | 'onClick' | 'onKeyDown'>> */
trait RequiredPickMenuPropsidst extends StObject {
  
  var id: String
  
  var onClick: MouseEventHandler[HTMLDivElement]
  
  var onKeyDown: KeyboardEventHandler[HTMLDivElement]
  
  var style: CSSProperties
  
  var visible: Boolean
}
object RequiredPickMenuPropsidst {
  
  inline def apply(
    id: String,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
    onKeyDown: KeyboardEvent[HTMLDivElement] => Unit,
    style: CSSProperties,
    visible: Boolean
  ): RequiredPickMenuPropsidst = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), style = style.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMenuPropsidst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredPickMenuPropsidst] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
