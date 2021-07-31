package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onTopPassedReverse'> */
trait PickImplonTopPassedRevers extends StObject {
  
  def onTopPassedReverse(): Unit
  @JSName("onTopPassedReverse")
  var onTopPassedReverse_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonTopPassedRevers {
  
  @scala.inline
  def apply(onTopPassedReverse: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonTopPassedRevers = {
    val __obj = js.Dynamic.literal(onTopPassedReverse = onTopPassedReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonTopPassedRevers]
  }
  
  @scala.inline
  implicit class PickImplonTopPassedReversMutableBuilder[Self <: PickImplonTopPassedRevers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnTopPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopPassedReverse", value.asInstanceOf[js.Any])
  }
}
