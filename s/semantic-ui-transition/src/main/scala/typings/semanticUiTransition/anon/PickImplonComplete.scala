package typings.semanticUiTransition.anon

import typings.semanticUiTransition.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'onComplete'> */
trait PickImplonComplete extends StObject {
  
  def onComplete(): Unit
  @JSName("onComplete")
  var onComplete_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonComplete {
  
  @scala.inline
  def apply(onComplete: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonComplete = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonComplete]
  }
  
  @scala.inline
  implicit class PickImplonCompleteMutableBuilder[Self <: PickImplonComplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
  }
}
