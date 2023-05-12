package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pathname, search, and hash values of a URL.
  */
trait Path extends StObject {
  
  /**
    * A URL fragment identifier, beginning with a #.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.hash
    */
  var hash: Hash
  
  /**
    * A URL pathname, beginning with a /.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.pathname
    */
  var pathname: Pathname
  
  /**
    * A URL search string, beginning with a ?.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.search
    */
  var search: Search
}
object Path {
  
  inline def apply(hash: Hash, pathname: Pathname, search: Search): Path = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
