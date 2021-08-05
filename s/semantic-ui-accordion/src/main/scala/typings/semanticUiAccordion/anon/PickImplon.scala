package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'on'> */
trait PickImplon extends StObject {
  
  var on: String
}
object PickImplon {
  
  inline def apply(on: String): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplon]
  }
  
  extension [Self <: PickImplon](x: Self) {
    
    inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
