package typings.signalExit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlwaysLast extends StObject {
    
    var alwaysLast: js.UndefOr[Boolean] = js.undefined
  }
  object AlwaysLast {
    
    inline def apply(): AlwaysLast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlwaysLast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlwaysLast] (val x: Self) extends AnyVal {
      
      inline def setAlwaysLast(value: Boolean): Self = StObject.set(x, "alwaysLast", value.asInstanceOf[js.Any])
      
      inline def setAlwaysLastUndefined: Self = StObject.set(x, "alwaysLast", js.undefined)
    }
  }
}
