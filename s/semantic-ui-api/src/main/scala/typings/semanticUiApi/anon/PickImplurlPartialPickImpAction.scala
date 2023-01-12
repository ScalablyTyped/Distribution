package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.Api.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, 'url'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl>> */
trait PickImplurlPartialPickImpAction
  extends StObject
     with Param {
  
  var action: js.UndefOr[String] = js.undefined
  
  var url: String
}
object PickImplurlPartialPickImpAction {
  
  inline def apply(url: String): PickImplurlPartialPickImpAction = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurlPartialPickImpAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplurlPartialPickImpAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
