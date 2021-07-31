package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'cache'> */
trait PickImplcache extends StObject {
  
  var cache: Boolean
}
object PickImplcache {
  
  @scala.inline
  def apply(cache: Boolean): PickImplcache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcache]
  }
  
  @scala.inline
  implicit class PickImplcacheMutableBuilder[Self <: PickImplcache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
