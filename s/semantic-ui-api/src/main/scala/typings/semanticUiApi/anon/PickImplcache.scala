package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'cache'> */
@js.native
trait PickImplcache extends StObject {
  
  var cache: local | Boolean = js.native
}
object PickImplcache {
  
  @scala.inline
  def apply(cache: local | Boolean): PickImplcache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcache]
  }
  
  @scala.inline
  implicit class PickImplcacheMutableBuilder[Self <: PickImplcache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: local | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
