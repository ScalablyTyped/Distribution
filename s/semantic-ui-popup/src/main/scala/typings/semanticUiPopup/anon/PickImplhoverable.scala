package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'hoverable'> */
trait PickImplhoverable extends StObject {
  
  var hoverable: Boolean
}
object PickImplhoverable {
  
  inline def apply(hoverable: Boolean): PickImplhoverable = {
    val __obj = js.Dynamic.literal(hoverable = hoverable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhoverable]
  }
  
  extension [Self <: PickImplhoverable](x: Self) {
    
    inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
  }
}
