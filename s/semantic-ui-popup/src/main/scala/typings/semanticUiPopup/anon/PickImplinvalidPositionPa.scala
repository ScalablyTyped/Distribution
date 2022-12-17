package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'invalidPosition'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl>> */
trait PickImplinvalidPositionPa
  extends StObject
     with Param {
  
  var cannotPlace: js.UndefOr[String] = js.undefined
  
  var invalidPosition: String
  
  var method: js.UndefOr[String] = js.undefined
  
  var noTransition: js.UndefOr[String] = js.undefined
  
  var notFound: js.UndefOr[String] = js.undefined
}
object PickImplinvalidPositionPa {
  
  inline def apply(invalidPosition: String): PickImplinvalidPositionPa = {
    val __obj = js.Dynamic.literal(invalidPosition = invalidPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidPositionPa]
  }
  
  extension [Self <: PickImplinvalidPositionPa](x: Self) {
    
    inline def setCannotPlace(value: String): Self = StObject.set(x, "cannotPlace", value.asInstanceOf[js.Any])
    
    inline def setCannotPlaceUndefined: Self = StObject.set(x, "cannotPlace", js.undefined)
    
    inline def setInvalidPosition(value: String): Self = StObject.set(x, "invalidPosition", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
    
    inline def setNoTransitionUndefined: Self = StObject.set(x, "noTransition", js.undefined)
    
    inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
  }
}
