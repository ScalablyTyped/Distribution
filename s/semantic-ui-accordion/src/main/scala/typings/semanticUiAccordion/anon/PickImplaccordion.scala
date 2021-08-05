package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'accordion'> */
trait PickImplaccordion extends StObject {
  
  var accordion: String
}
object PickImplaccordion {
  
  inline def apply(accordion: String): PickImplaccordion = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplaccordion]
  }
  
  extension [Self <: PickImplaccordion](x: Self) {
    
    inline def setAccordion(value: String): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
  }
}
