package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'loading'> */
trait PickImplloading extends StObject {
  
  var loading: String
}
object PickImplloading {
  
  inline def apply(loading: String): PickImplloading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloading]
  }
  
  extension [Self <: PickImplloading](x: Self) {
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
