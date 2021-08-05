package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'onTop'> */
trait PickImplonTop extends StObject {
  
  def onTop(): Unit
  @JSName("onTop")
  var onTop_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonTop {
  
  inline def apply(onTop: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonTop = {
    val __obj = js.Dynamic.literal(onTop = onTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonTop]
  }
  
  extension [Self <: PickImplonTop](x: Self) {
    
    inline def setOnTop(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTop", value.asInstanceOf[js.Any])
  }
}
