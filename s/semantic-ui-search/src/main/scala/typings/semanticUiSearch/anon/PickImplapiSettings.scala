package typings.semanticUiSearch.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'apiSettings'> */
trait PickImplapiSettings extends StObject {
  
  var apiSettings: ApiSettings
}
object PickImplapiSettings {
  
  inline def apply(apiSettings: ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapiSettings]
  }
  
  extension [Self <: PickImplapiSettings](x: Self) {
    
    inline def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
  }
}
