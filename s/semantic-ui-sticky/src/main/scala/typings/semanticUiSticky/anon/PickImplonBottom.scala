package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'onBottom'> */
trait PickImplonBottom extends StObject {
  
  def onBottom(): Unit
  @JSName("onBottom")
  var onBottom_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonBottom {
  
  inline def apply(onBottom: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonBottom = {
    val __obj = js.Dynamic.literal(onBottom = onBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonBottom]
  }
  
  extension [Self <: PickImplonBottom](x: Self) {
    
    inline def setOnBottom(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottom", value.asInstanceOf[js.Any])
  }
}
