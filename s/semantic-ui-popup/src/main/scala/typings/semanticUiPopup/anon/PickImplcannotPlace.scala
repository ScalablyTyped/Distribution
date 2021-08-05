package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'cannotPlace'> */
trait PickImplcannotPlace extends StObject {
  
  var cannotPlace: String
}
object PickImplcannotPlace {
  
  inline def apply(cannotPlace: String): PickImplcannotPlace = {
    val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcannotPlace]
  }
  
  extension [Self <: PickImplcannotPlace](x: Self) {
    
    inline def setCannotPlace(value: String): Self = StObject.set(x, "cannotPlace", value.asInstanceOf[js.Any])
  }
}
