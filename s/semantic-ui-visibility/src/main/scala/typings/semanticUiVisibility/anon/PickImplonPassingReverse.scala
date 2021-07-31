package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onPassingReverse'> */
trait PickImplonPassingReverse extends StObject {
  
  def onPassingReverse(): Unit
  @JSName("onPassingReverse")
  var onPassingReverse_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonPassingReverse {
  
  @scala.inline
  def apply(onPassingReverse: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonPassingReverse = {
    val __obj = js.Dynamic.literal(onPassingReverse = onPassingReverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonPassingReverse]
  }
  
  @scala.inline
  implicit class PickImplonPassingReverseMutableBuilder[Self <: PickImplonPassingReverse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPassingReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPassingReverse", value.asInstanceOf[js.Any])
  }
}
