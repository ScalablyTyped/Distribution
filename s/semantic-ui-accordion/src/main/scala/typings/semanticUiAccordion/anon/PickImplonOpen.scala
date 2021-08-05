package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'onOpen'> */
trait PickImplonOpen extends StObject {
  
  def onOpen(): Unit
  @JSName("onOpen")
  var onOpen_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonOpen {
  
  inline def apply(onOpen: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonOpen = {
    val __obj = js.Dynamic.literal(onOpen = onOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonOpen]
  }
  
  extension [Self <: PickImplonOpen](x: Self) {
    
    inline def setOnOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
  }
}
