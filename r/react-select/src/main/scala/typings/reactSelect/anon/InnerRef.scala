package typings.reactSelect.anon

import typings.react.mod.Ref
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerRef extends StObject {
  
  val innerRef: Ref[HTMLInputElement]
}
object InnerRef {
  
  inline def apply(): InnerRef = {
    val __obj = js.Dynamic.literal(innerRef = null)
    __obj.asInstanceOf[InnerRef]
  }
  
  extension [Self <: InnerRef](x: Self) {
    
    inline def setInnerRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
  }
}
