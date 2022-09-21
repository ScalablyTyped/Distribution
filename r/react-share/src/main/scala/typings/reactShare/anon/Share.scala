package typings.reactShare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Share extends StObject {
  
  var Share: js.UndefOr[Count] = js.undefined
  
  var callbacks: js.UndefOr[js.Array[js.Function1[/* count */ js.UndefOr[Double], Unit]]] = js.undefined
}
object Share {
  
  inline def apply(): Share = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Share]
  }
  
  extension [Self <: Share](x: Self) {
    
    inline def setCallbacks(value: js.Array[js.Function1[/* count */ js.UndefOr[Double], Unit]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setCallbacksVarargs(value: (js.Function1[/* count */ js.UndefOr[Double], Unit])*): Self = StObject.set(x, "callbacks", js.Array(value*))
    
    inline def setShare(value: Count): Self = StObject.set(x, "Share", value.asInstanceOf[js.Any])
    
    inline def setShareUndefined: Self = StObject.set(x, "Share", js.undefined)
  }
}
