package typings.semanticUiModal.anon

import typings.semanticUiModal.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'onVisible'> */
trait PickImplonVisible extends StObject {
  
  def onVisible(): Unit
  @JSName("onVisible")
  var onVisible_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonVisible {
  
  inline def apply(onVisible: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonVisible = {
    val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonVisible]
  }
  
  extension [Self <: PickImplonVisible](x: Self) {
    
    inline def setOnVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onVisible", value.asInstanceOf[js.Any])
  }
}
