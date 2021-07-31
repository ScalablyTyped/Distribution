package typings.semanticUiTab.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'apiSettings'> */
trait PickImplapiSettings extends StObject {
  
  var apiSettings: ApiSettings
}
object PickImplapiSettings {
  
  @scala.inline
  def apply(apiSettings: ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapiSettings]
  }
  
  @scala.inline
  implicit class PickImplapiSettingsMutableBuilder[Self <: PickImplapiSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
  }
}
