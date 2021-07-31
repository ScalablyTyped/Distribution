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
    
    @scala.inline
    def apply(): MaxAge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAge]
    }
    
    @scala.inline
    implicit class MaxAgeMutableBuilder[Self <: MaxAge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAge(value: Double | String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
}
