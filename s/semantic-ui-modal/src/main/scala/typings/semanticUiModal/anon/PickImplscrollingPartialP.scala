package typings.semanticUiModal.anon

import typings.semanticUiModal.SemanticUI.Modal.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, 'scrolling'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl>> */
trait PickImplscrollingPartialP
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var scrolling: String
}
object PickImplscrollingPartialP {
  
  inline def apply(scrolling: String): PickImplscrollingPartialP = {
    val __obj = js.Dynamic.literal(scrolling = scrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrollingPartialP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplscrollingPartialP] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
  }
}
