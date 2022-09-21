package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.Api.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl, 'loading'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl>> */
trait PickImplloadingPartialPic
  extends StObject
     with Param {
  
  var error: js.UndefOr[String] = js.undefined
  
  var loading: String & js.UndefOr[String]
}
object PickImplloadingPartialPic {
  
  inline def apply(loading: String & js.UndefOr[String]): PickImplloadingPartialPic = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadingPartialPic]
  }
  
  extension [Self <: PickImplloadingPartialPic](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLoading(value: String & js.UndefOr[String]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
