package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplAction extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplAction {
  
  inline def apply(): PartialPickImplkeyofImplAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAction]
  }
  
  extension [Self <: PartialPickImplkeyofImplAction](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
