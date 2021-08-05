package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, 'scrolling'> */
trait PickImplscrolling extends StObject {
  
  var scrolling: String
}
object PickImplscrolling {
  
  inline def apply(scrolling: String): PickImplscrolling = {
    val __obj = js.Dynamic.literal(scrolling = scrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrolling]
  }
  
  extension [Self <: PickImplscrolling](x: Self) {
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
  }
}
