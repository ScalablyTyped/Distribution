package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onFixed'> */
trait PickImplonFixed extends StObject {
  
  def onFixed(): Unit
  @JSName("onFixed")
  var onFixed_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonFixed {
  
  inline def apply(onFixed: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonFixed = {
    val __obj = js.Dynamic.literal(onFixed = onFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonFixed]
  }
  
  extension [Self <: PickImplonFixed](x: Self) {
    
    inline def setOnFixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onFixed", value.asInstanceOf[js.Any])
  }
}
