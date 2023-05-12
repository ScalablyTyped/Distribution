package typings.remixRunRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@remix-run/router.@remix-run/router/dist/history.Path> */
trait PartialPath extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var pathname: js.UndefOr[String] = js.undefined
  
  var search: js.UndefOr[String] = js.undefined
}
object PartialPath {
  
  inline def apply(): PartialPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPath] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
