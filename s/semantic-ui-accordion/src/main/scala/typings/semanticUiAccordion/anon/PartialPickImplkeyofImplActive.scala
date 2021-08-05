package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var animating: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplActive {
  
  inline def apply(): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
  
  extension [Self <: PartialPickImplkeyofImplActive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
  }
}
