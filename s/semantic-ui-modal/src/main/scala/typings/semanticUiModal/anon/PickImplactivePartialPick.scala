package typings.semanticUiModal.anon

import typings.semanticUiModal.SemanticUI.Modal.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, 'active'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl>> */
trait PickImplactivePartialPick
  extends StObject
     with Param {
  
  var active: String
  
  var scrolling: js.UndefOr[String] = js.undefined
}
object PickImplactivePartialPick {
  
  inline def apply(active: String): PickImplactivePartialPick = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactivePartialPick]
  }
  
  extension [Self <: PickImplactivePartialPick](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
  }
}
