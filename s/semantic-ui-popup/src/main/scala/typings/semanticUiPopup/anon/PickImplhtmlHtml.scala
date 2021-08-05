package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, 'html'> */
trait PickImplhtmlHtml extends StObject {
  
  var html: String
}
object PickImplhtmlHtml {
  
  inline def apply(html: String): PickImplhtmlHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhtmlHtml]
  }
  
  extension [Self <: PickImplhtmlHtml](x: Self) {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
