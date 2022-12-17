package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'noTransition'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl>> */
trait PickImplnoTransitionParti
  extends StObject
     with Param {
  
  var action: js.UndefOr[String] = js.undefined
  
  var alreadySetup: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var noTransition: String
}
object PickImplnoTransitionParti {
  
  inline def apply(noTransition: String): PickImplnoTransitionParti = {
    val __obj = js.Dynamic.literal(noTransition = noTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoTransitionParti]
  }
  
  extension [Self <: PickImplnoTransitionParti](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAlreadySetup(value: String): Self = StObject.set(x, "alreadySetup", value.asInstanceOf[js.Any])
    
    inline def setAlreadySetupUndefined: Self = StObject.set(x, "alreadySetup", js.undefined)
    
    inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
  }
}
