package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onOffScreen'> */
trait PickImplonOffScreen extends StObject {
  
  def onOffScreen(): Unit
  @JSName("onOffScreen")
  var onOffScreen_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonOffScreen {
  
  inline def apply(onOffScreen: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonOffScreen = {
    val __obj = js.Dynamic.literal(onOffScreen = onOffScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonOffScreen]
  }
  
  extension [Self <: PickImplonOffScreen](x: Self) {
    
    inline def setOnOffScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOffScreen", value.asInstanceOf[js.Any])
  }
}
