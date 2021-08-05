package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'onClosing'> */
trait PickImplonClosing extends StObject {
  
  def onClosing(): Unit
  @JSName("onClosing")
  var onClosing_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonClosing {
  
  inline def apply(onClosing: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonClosing = {
    val __obj = js.Dynamic.literal(onClosing = onClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonClosing]
  }
  
  extension [Self <: PickImplonClosing](x: Self) {
    
    inline def setOnClosing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onClosing", value.asInstanceOf[js.Any])
  }
}
