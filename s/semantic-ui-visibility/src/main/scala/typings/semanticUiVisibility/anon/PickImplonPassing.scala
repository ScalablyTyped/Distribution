package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onPassing'> */
trait PickImplonPassing extends StObject {
  
  def onPassing(): Unit
  @JSName("onPassing")
  var onPassing_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonPassing {
  
  @scala.inline
  def apply(onPassing: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonPassing = {
    val __obj = js.Dynamic.literal(onPassing = onPassing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonPassing]
  }
  
  @scala.inline
  implicit class PickImplonPassingMutableBuilder[Self <: PickImplonPassing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPassing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPassing", value.asInstanceOf[js.Any])
  }
}
