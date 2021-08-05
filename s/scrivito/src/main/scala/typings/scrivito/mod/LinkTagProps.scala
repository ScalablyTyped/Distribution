package typings.scrivito.mod

import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkTagProps
  extends StObject
     with HTMLAttributes[HTMLAnchorElement] {
  
  @JSName("onClick")
  var onClick_LinkTagProps: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  
  var params: js.UndefOr[js.Object] = js.undefined
  
  var to: Obj | Link
}
object LinkTagProps {
  
  inline def apply(to: Obj | Link): LinkTagProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkTagProps]
  }
  
  extension [Self <: LinkTagProps](x: Self) {
    
    inline def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setTo(value: Obj | Link): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
