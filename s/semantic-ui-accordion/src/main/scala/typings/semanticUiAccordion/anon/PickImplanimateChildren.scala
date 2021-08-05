package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'animateChildren'> */
trait PickImplanimateChildren extends StObject {
  
  var animateChildren: Boolean
}
object PickImplanimateChildren {
  
  inline def apply(animateChildren: Boolean): PickImplanimateChildren = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimateChildren]
  }
  
  extension [Self <: PickImplanimateChildren](x: Self) {
    
    inline def setAnimateChildren(value: Boolean): Self = StObject.set(x, "animateChildren", value.asInstanceOf[js.Any])
  }
}
