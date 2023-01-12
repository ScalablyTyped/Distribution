package typings.reactInlinesvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CacheRequests extends StObject {
    
    var cacheRequests: Boolean
    
    var uniquifyIDs: Boolean
  }
  object CacheRequests {
    
    inline def apply(cacheRequests: Boolean, uniquifyIDs: Boolean): CacheRequests = {
      val __obj = js.Dynamic.literal(cacheRequests = cacheRequests.asInstanceOf[js.Any], uniquifyIDs = uniquifyIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheRequests]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheRequests] (val x: Self) extends AnyVal {
      
      inline def setCacheRequests(value: Boolean): Self = StObject.set(x, "cacheRequests", value.asInstanceOf[js.Any])
      
      inline def setUniquifyIDs(value: Boolean): Self = StObject.set(x, "uniquifyIDs", value.asInstanceOf[js.Any])
    }
  }
}
