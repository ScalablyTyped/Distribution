package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var scrolling: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplActive {
  
  inline def apply(): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
  
  extension [Self <: PartialPickImplkeyofImplActive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
  }
}
