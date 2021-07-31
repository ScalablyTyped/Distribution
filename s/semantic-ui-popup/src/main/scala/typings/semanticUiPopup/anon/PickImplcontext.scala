package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'context'> */
trait PickImplcontext extends StObject {
  
  var context: String | JQuery
}
object PickImplcontext {
  
  @scala.inline
  def apply(context: String | JQuery): PickImplcontext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontext]
  }
  
  @scala.inline
  implicit class PickImplcontextMutableBuilder[Self <: PickImplcontext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
