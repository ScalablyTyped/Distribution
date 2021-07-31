package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onTopVisibleReverse'> */
trait PickImplonTopVisibleRever extends StObject {
  
  def onTopVisibleReverse(): Unit
  @JSName("onTopVisibleReverse")
  var onTopVisibleReverse_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonTopVisibleRever {
  
  @scala.inline
  def apply(onTopVisibleReverse: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonTopVisibleRever = {
    val __obj = js.Dynamic.literal(onTopVisibleReverse = onTopVisibleReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonTopVisibleRever]
  }
  
  @scala.inline
  implicit class PickImplonTopVisibleReverMutableBuilder[Self <: PickImplonTopVisibleRever] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnTopVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopVisibleReverse", value.asInstanceOf[js.Any])
  }
}
