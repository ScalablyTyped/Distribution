package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'boundary'> */
trait PickImplboundary extends StObject {
  
  var boundary: String | JQuery
}
object PickImplboundary {
  
  inline def apply(boundary: String | JQuery): PickImplboundary = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplboundary]
  }
  
  extension [Self <: PickImplboundary](x: Self) {
    
    inline def setBoundary(value: String | JQuery): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
  }
}
