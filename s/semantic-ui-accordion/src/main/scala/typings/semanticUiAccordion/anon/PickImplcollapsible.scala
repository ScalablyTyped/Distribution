package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'collapsible'> */
@js.native
trait PickImplcollapsible extends StObject {
  
  var collapsible: Boolean = js.native
}
object PickImplcollapsible {
  
  @scala.inline
  def apply(collapsible: Boolean): PickImplcollapsible = {
    val __obj = js.Dynamic.literal(collapsible = collapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcollapsible]
  }
  
  @scala.inline
  implicit class PickImplcollapsibleMutableBuilder[Self <: PickImplcollapsible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
  }
}
