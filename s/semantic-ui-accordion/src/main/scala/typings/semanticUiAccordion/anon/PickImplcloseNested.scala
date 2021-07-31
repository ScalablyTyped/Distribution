package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'closeNested'> */
trait PickImplcloseNested extends StObject {
  
  var closeNested: Boolean
}
object PickImplcloseNested {
  
  @scala.inline
  def apply(closeNested: Boolean): PickImplcloseNested = {
    val __obj = js.Dynamic.literal(closeNested = closeNested.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcloseNested]
  }
  
  @scala.inline
  implicit class PickImplcloseNestedMutableBuilder[Self <: PickImplcloseNested] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseNested(value: Boolean): Self = StObject.set(x, "closeNested", value.asInstanceOf[js.Any])
  }
}
