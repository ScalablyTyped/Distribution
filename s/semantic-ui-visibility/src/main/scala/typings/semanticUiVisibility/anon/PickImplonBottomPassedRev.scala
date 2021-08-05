package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onBottomPassedReverse'> */
trait PickImplonBottomPassedRev extends StObject {
  
  def onBottomPassedReverse(): Unit
  @JSName("onBottomPassedReverse")
  var onBottomPassedReverse_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonBottomPassedRev {
  
  inline def apply(onBottomPassedReverse: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonBottomPassedRev = {
    val __obj = js.Dynamic.literal(onBottomPassedReverse = onBottomPassedReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonBottomPassedRev]
  }
  
  extension [Self <: PickImplonBottomPassedRev](x: Self) {
    
    inline def setOnBottomPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomPassedReverse", value.asInstanceOf[js.Any])
  }
}
