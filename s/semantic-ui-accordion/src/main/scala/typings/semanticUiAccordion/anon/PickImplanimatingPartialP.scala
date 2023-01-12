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
  
  var animating: String
}
object PickImplanimatingPartialP {
  
  inline def apply(animating: String): PickImplanimatingPartialP = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimatingPartialP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplanimatingPartialP] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
  }
}
