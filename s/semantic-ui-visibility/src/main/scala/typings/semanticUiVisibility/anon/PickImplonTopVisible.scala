package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onTopVisible'> */
trait PickImplonTopVisible extends StObject {
  
  def onTopVisible(): Unit
  @JSName("onTopVisible")
  var onTopVisible_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonTopVisible {
  
  inline def apply(onTopVisible: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonTopVisible = {
    val __obj = js.Dynamic.literal(onTopVisible = onTopVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonTopVisible]
  }
  
  extension [Self <: PickImplonTopVisible](x: Self) {
    
    inline def setOnTopVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopVisible", value.asInstanceOf[js.Any])
  }
}
