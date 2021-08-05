package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onBottomVisible'> */
trait PickImplonBottomVisible extends StObject {
  
  def onBottomVisible(): Unit
  @JSName("onBottomVisible")
  var onBottomVisible_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonBottomVisible {
  
  inline def apply(onBottomVisible: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonBottomVisible = {
    val __obj = js.Dynamic.literal(onBottomVisible = onBottomVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonBottomVisible]
  }
  
  extension [Self <: PickImplonBottomVisible](x: Self) {
    
    inline def setOnBottomVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomVisible", value.asInstanceOf[js.Any])
  }
}
