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
  
  inline def apply(onOnScreen: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonOnScreen = {
    val __obj = js.Dynamic.literal(onOnScreen = onOnScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonOnScreen]
  }
  
  extension [Self <: PickImplonOnScreen](x: Self) {
    
    inline def setOnOnScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOnScreen", value.asInstanceOf[js.Any])
  }
}
