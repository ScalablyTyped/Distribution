package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'html'> */
@js.native
trait PickImplhtml extends StObject {
  
  var html: String | JQuery = js.native
}
object PickImplhtml {
  
  @scala.inline
  def apply(html: String | JQuery): PickImplhtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhtml]
  }
  
  @scala.inline
  implicit class PickImplhtmlMutableBuilder[Self <: PickImplhtml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String | JQuery): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
