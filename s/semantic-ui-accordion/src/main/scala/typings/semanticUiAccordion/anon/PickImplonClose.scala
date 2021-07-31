package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'onClose'> */
trait PickImplonClose extends StObject {
  
  def onClose(): Unit
  @JSName("onClose")
  var onClose_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonClose {
  
  @scala.inline
  def apply(onClose: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonClose = {
    val __obj = js.Dynamic.literal(onClose = onClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonClose]
  }
  
  @scala.inline
  implicit class PickImplonCloseMutableBuilder[Self <: PickImplonClose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
  }
}
