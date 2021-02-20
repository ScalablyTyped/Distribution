package typings.reactInlinesvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CacheRequests extends StObject {
    
    var cacheRequests: Boolean = js.native
    
    var uniquifyIDs: Boolean = js.native
  }
  object CacheRequests {
    
    @scala.inline
    def apply(cacheRequests: Boolean, uniquifyIDs: Boolean): CacheRequests = {
      val __obj = js.Dynamic.literal(cacheRequests = cacheRequests.asInstanceOf[js.Any], uniquifyIDs = uniquifyIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheRequests]
    }
    
    @scala.inline
    implicit class CacheRequestsMutableBuilder[Self <: CacheRequests] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheRequests(value: Boolean): Self = StObject.set(x, "cacheRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniquifyIDs(value: Boolean): Self = StObject.set(x, "uniquifyIDs", value.asInstanceOf[js.Any])
    }
  }
}
