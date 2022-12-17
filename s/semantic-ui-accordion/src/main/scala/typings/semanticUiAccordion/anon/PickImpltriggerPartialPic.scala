package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'trigger'> & std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl>> */
trait PickImpltriggerPartialPic
  extends StObject
     with Param {
  
  var accordion: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var trigger: String
}
object PickImpltriggerPartialPic {
  
  inline def apply(trigger: String): PickImpltriggerPartialPic = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltriggerPartialPic]
  }
  
  extension [Self <: PickImpltriggerPartialPic](x: Self) {
    
    inline def setAccordion(value: String): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
