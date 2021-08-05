package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'html'> */
trait PickImplhtml extends StObject {
  
  var html: String | JQuery
}
object PickImplhtml {
  
  inline def apply(html: String | JQuery): PickImplhtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhtml]
  }
  
  extension [Self <: PickImplhtml](x: Self) {
    
    inline def setHtml(value: String | JQuery): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
