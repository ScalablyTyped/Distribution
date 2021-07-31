package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'onOpening'> */
trait PickImplonOpening extends StObject {
  
  def onOpening(): Unit
  @JSName("onOpening")
  var onOpening_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonOpening {
  
  @scala.inline
  def apply(onOpening: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonOpening = {
    val __obj = js.Dynamic.literal(onOpening = onOpening.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonOpening]
  }
  
  @scala.inline
  implicit class PickImplonOpeningMutableBuilder[Self <: PickImplonOpening] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnOpening(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOpening", value.asInstanceOf[js.Any])
  }
}
