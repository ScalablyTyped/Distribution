package typings.reactIntl.anon

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedRef extends StObject {
  
  var forwardedRef: js.UndefOr[Ref[js.Any]] = js.undefined
}
object ForwardedRef {
  
  inline def apply(): ForwardedRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef]
  }
  
  extension [Self <: ForwardedRef](x: Self) {
    
    inline def setForwardedRef(value: Ref[js.Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
