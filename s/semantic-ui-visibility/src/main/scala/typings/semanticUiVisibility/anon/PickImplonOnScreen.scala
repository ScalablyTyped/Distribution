package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onOnScreen'> */
trait PickImplonOnScreen extends StObject {
  
  def onOnScreen(): Unit
  @JSName("onOnScreen")
  var onOnScreen_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonOnScreen {
  
  @scala.inline
  def apply(onOnScreen: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonOnScreen = {
    val __obj = js.Dynamic.literal(onOnScreen = onOnScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonOnScreen]
  }
  
  @scala.inline
  implicit class PickImplonOnScreenMutableBuilder[Self <: PickImplonOnScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnOnScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOnScreen", value.asInstanceOf[js.Any])
  }
}
