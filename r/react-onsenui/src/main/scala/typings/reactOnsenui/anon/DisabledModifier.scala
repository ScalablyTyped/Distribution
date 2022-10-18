package typings.reactOnsenui.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledModifier extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
  ] = js.undefined
}
object DisabledModifier {
  
  inline def apply(): DisabledModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledModifier]
  }
  
  extension [Self <: DisabledModifier](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnClick(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
