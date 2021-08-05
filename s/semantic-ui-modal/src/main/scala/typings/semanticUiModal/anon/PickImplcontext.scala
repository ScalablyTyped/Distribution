package typings.semanticUiModal.anon

import typings.semanticUiModal.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'context'> */
trait PickImplcontext extends StObject {
  
  var context: String | JQuery
}
object PickImplcontext {
  
  inline def apply(context: String | JQuery): PickImplcontext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontext]
  }
  
  extension [Self <: PickImplcontext](x: Self) {
    
    inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
