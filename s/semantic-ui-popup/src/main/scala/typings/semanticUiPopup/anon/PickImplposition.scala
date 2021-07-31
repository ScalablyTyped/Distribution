package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'position'> */
trait PickImplposition extends StObject {
  
  var position: String
}
object PickImplposition {
  
  @scala.inline
  def apply(position: String): PickImplposition = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplposition]
  }
  
  @scala.inline
  implicit class PickImplpositionMutableBuilder[Self <: PickImplposition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
