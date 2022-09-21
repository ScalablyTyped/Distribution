package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'noTransition'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl>> */
trait PickImplnoTransitionParti
  extends StObject
     with Param {
  
  var cannotPlace: js.UndefOr[String] = js.undefined
  
  var invalidPosition: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var noTransition: String & js.UndefOr[String]
  
  var notFound: js.UndefOr[String] = js.undefined
}
object PickImplnoTransitionParti {
  
  inline def apply(noTransition: String & js.UndefOr[String]): PickImplnoTransitionParti = {
    val __obj = js.Dynamic.literal(noTransition = noTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoTransitionParti]
  }
  
  extension [Self <: PickImplnoTransitionParti](x: Self) {
    
    inline def setCannotPlace(value: String): Self = StObject.set(x, "cannotPlace", value.asInstanceOf[js.Any])
    
    inline def setCannotPlaceUndefined: Self = StObject.set(x, "cannotPlace", js.undefined)
    
    inline def setInvalidPosition(value: String): Self = StObject.set(x, "invalidPosition", value.asInstanceOf[js.Any])
    
    inline def setInvalidPositionUndefined: Self = StObject.set(x, "invalidPosition", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoTransition(value: String & js.UndefOr[String]): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
    
    inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
  }
}
