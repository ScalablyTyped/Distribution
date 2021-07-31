package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'trigger'> */
trait PickImpltrigger extends StObject {
  
  var trigger: String
}
object PickImpltrigger {
  
  @scala.inline
  def apply(trigger: String): PickImpltrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltrigger]
  }
  
  @scala.inline
  implicit class PickImpltriggerMutableBuilder[Self <: PickImpltrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
