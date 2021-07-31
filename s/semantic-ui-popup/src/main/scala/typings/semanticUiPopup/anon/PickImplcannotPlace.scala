package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'cannotPlace'> */
trait PickImplcannotPlace extends StObject {
  
  var cannotPlace: String
}
object PickImplcannotPlace {
  
  @scala.inline
  def apply(cannotPlace: String): PickImplcannotPlace = {
    val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcannotPlace]
  }
  
  @scala.inline
  implicit class PickImplcannotPlaceMutableBuilder[Self <: PickImplcannotPlace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCannotPlace(value: String): Self = StObject.set(x, "cannotPlace", value.asInstanceOf[js.Any])
  }
}
