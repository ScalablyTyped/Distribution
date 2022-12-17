package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'title'> & std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl>> */
trait PickImpltitlePartialPickI
  extends StObject
     with Param {
  
  var accordion: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var trigger: js.UndefOr[String] = js.undefined
}
object PickImpltitlePartialPickI {
  
  inline def apply(title: String): PickImpltitlePartialPickI = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltitlePartialPickI]
  }
  
  extension [Self <: PickImpltitlePartialPickI](x: Self) {
    
    inline def setAccordion(value: String): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
