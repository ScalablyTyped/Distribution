package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl, 'active'> & std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl>> */
trait PickImplactivePartialPick
  extends StObject
     with Param {
  
  var active: String
  
  var animating: js.UndefOr[String] = js.undefined
}
object PickImplactivePartialPick {
  
  inline def apply(active: String): PickImplactivePartialPick = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactivePartialPick]
  }
  
  extension [Self <: PickImplactivePartialPick](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
  }
}
