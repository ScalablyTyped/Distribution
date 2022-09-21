package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'labels'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl>> */
trait PickImpllabelsPartialPick
  extends StObject
     with Param {
  
  var action: js.UndefOr[String] = js.undefined
  
  var alreadySetup: js.UndefOr[String] = js.undefined
  
  var labels: String & js.UndefOr[String]
  
  var method: js.UndefOr[String] = js.undefined
  
  var noTransition: js.UndefOr[String] = js.undefined
}
object PickImpllabelsPartialPick {
  
  inline def apply(labels: String & js.UndefOr[String]): PickImpllabelsPartialPick = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabelsPartialPick]
  }
  
  extension [Self <: PickImpllabelsPartialPick](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAlreadySetup(value: String): Self = StObject.set(x, "alreadySetup", value.asInstanceOf[js.Any])
    
    inline def setAlreadySetupUndefined: Self = StObject.set(x, "alreadySetup", js.undefined)
    
    inline def setLabels(value: String & js.UndefOr[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
    
    inline def setNoTransitionUndefined: Self = StObject.set(x, "noTransition", js.undefined)
  }
}
