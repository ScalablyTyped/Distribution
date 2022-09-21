package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLocation[S] extends StObject {
  
  var hash: String
  
  var key: js.UndefOr[String] = js.undefined
  
  var pathname: String
  
  var search: String
  
  var state: S
}
object HLocation {
  
  inline def apply[S](hash: String, pathname: String, search: String, state: S): HLocation[S] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[HLocation[S]]
  }
  
  extension [Self <: HLocation[?], S](x: Self & HLocation[S]) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
