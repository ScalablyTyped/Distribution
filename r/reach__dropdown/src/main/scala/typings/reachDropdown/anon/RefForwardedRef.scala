package typings.reachDropdown.anon

import typings.react.mod.ForwardedRef
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefForwardedRef extends StObject {
  
  var ref: ForwardedRef[HTMLButtonElement]
}
object RefForwardedRef {
  
  inline def apply(): RefForwardedRef = {
    val __obj = js.Dynamic.literal(ref = null)
    __obj.asInstanceOf[RefForwardedRef]
  }
  
  extension [Self <: RefForwardedRef](x: Self) {
    
    inline def setRef(value: ForwardedRef[HTMLButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLButtonElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
