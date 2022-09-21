package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl, 'animating'> & std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.ClassNameSettings._Impl>> */
trait PickImplanimatingPartialP
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var animating: String & js.UndefOr[String]
}
object PickImplanimatingPartialP {
  
  inline def apply(animating: String & js.UndefOr[String]): PickImplanimatingPartialP = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimatingPartialP]
  }
  
  extension [Self <: PickImplanimatingPartialP](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAnimating(value: String & js.UndefOr[String]): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
  }
}
