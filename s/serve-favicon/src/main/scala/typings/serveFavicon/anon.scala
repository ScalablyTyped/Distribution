package typings.serveFavicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxAge extends StObject {
    
    /**
      * The cache-control max-age directive in ms, defaulting to 1 day.
      * This can also be a string accepted by the `ms` module.
      */
    var maxAge: js.UndefOr[Double | String] = js.undefined
  }
  object MaxAge {
    
    inline def apply(): MaxAge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAge]
    }
    
    extension [Self <: MaxAge](x: Self) {
      
      inline def setMaxAge(value: Double | String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
}
