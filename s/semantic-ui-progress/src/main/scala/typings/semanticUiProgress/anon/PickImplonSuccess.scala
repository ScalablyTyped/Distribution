package typings.semanticUiProgress.anon

import typings.semanticUiProgress.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'onSuccess'> */
trait PickImplonSuccess extends StObject {
  
  def onSuccess(total: Double): Unit
  @JSName("onSuccess")
  var onSuccess_Original: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]
}
object PickImplonSuccess {
  
  @scala.inline
  def apply(onSuccess: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]): PickImplonSuccess = {
    val __obj = js.Dynamic.literal(onSuccess = onSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonSuccess]
  }
  
  @scala.inline
  implicit class PickImplonSuccessMutableBuilder[Self <: PickImplonSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSuccess(value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
  }
}
