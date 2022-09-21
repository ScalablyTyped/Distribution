package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.Api.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, 'action'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl>> */
trait PickImplactionPartialPickAction
  extends StObject
     with Param {
  
  var action: String & js.UndefOr[String]
  
  var url: js.UndefOr[String] = js.undefined
}
object PickImplactionPartialPickAction {
  
  inline def apply(action: String & js.UndefOr[String]): PickImplactionPartialPickAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactionPartialPickAction]
  }
  
  extension [Self <: PickImplactionPartialPickAction](x: Self) {
    
    inline def setAction(value: String & js.UndefOr[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
