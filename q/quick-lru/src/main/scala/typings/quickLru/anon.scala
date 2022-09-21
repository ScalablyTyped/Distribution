package typings.quickLru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxAge extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object MaxAge {
    
    inline def apply(): MaxAge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAge]
    }
    
    extension [Self <: MaxAge](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
}
