package typings.remixRunRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@remix-run/router.@remix-run/router/dist/history.Location> */
trait ReadonlyLocation extends StObject {
  
  val hash: String
  
  val key: String
  
  val pathname: String
  
  val search: String
  
  val state: Any
}
object ReadonlyLocation {
  
  inline def apply(hash: String, key: String, pathname: String, search: String, state: Any): ReadonlyLocation = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyLocation] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
