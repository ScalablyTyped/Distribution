package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onBottomVisibleReverse'> */
trait PickImplonBottomVisibleRe extends StObject {
  
  def onBottomVisibleReverse(): Unit
  @JSName("onBottomVisibleReverse")
  var onBottomVisibleReverse_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonBottomVisibleRe {
  
  inline def apply(onBottomVisibleReverse: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonBottomVisibleRe = {
    val __obj = js.Dynamic.literal(onBottomVisibleReverse = onBottomVisibleReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonBottomVisibleRe]
  }
  
  extension [Self <: PickImplonBottomVisibleRe](x: Self) {
    
    inline def setOnBottomVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomVisibleReverse", value.asInstanceOf[js.Any])
  }
}
