package typings.reactAutosuggest.mod

import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderInputComponentProps
  extends StObject
     with InputHTMLAttributes[Any] {
  
  var ref: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  @JSName("value")
  var value_RenderInputComponentProps: String
}
object RenderInputComponentProps {
  
  inline def apply(value: String): RenderInputComponentProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInputComponentProps]
  }
  
  extension [Self <: RenderInputComponentProps](x: Self) {
    
    inline def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
