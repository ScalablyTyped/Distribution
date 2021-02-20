package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'exclusive'> */
@js.native
trait PickImplexclusive extends StObject {
  
  var exclusive: Boolean = js.native
}
object PickImplexclusive {
  
  @scala.inline
  def apply(exclusive: Boolean): PickImplexclusive = {
    val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexclusive]
  }
  
  @scala.inline
  implicit class PickImplexclusiveMutableBuilder[Self <: PickImplexclusive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
  }
}
