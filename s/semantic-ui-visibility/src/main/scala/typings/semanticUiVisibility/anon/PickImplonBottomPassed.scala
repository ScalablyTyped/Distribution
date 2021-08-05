package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onBottomPassed'> */
trait PickImplonBottomPassed extends StObject {
  
  def onBottomPassed(): Unit
  @JSName("onBottomPassed")
  var onBottomPassed_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonBottomPassed {
  
  inline def apply(onBottomPassed: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonBottomPassed = {
    val __obj = js.Dynamic.literal(onBottomPassed = onBottomPassed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonBottomPassed]
  }
  
  extension [Self <: PickImplonBottomPassed](x: Self) {
    
    inline def setOnBottomPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomPassed", value.asInstanceOf[js.Any])
  }
}
