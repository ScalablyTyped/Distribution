package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.Api.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, 'action'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl>> */
trait PickImplactionPartialPickAction
  extends StObject
     with Param {
  
  var action: String
  
  var url: js.UndefOr[String] = js.undefined
}
object PickImplactionPartialPickAction {
  
  inline def apply(action: String): PickImplactionPartialPickAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactionPartialPickAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplactionPartialPickAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
