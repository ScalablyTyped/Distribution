package typings.semanticUiTransition.anon

import typings.semanticUiTransition.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'onStart'> */
trait PickImplonStart extends StObject {
  
  def onStart(): Unit
  @JSName("onStart")
  var onStart_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonStart {
  
  inline def apply(onStart: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonStart = {
    val __obj = js.Dynamic.literal(onStart = onStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonStart]
  }
  
  extension [Self <: PickImplonStart](x: Self) {
    
    inline def setOnStart(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
  }
}
