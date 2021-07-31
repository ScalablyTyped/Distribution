package typings.semanticUiProgress.anon

import typings.semanticUiProgress.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'onError'> */
trait PickImplonError extends StObject {
  
  def onError(value: Double, total: Double): Unit
  @JSName("onError")
  var onError_Original: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
}
object PickImplonError {
  
  @scala.inline
  def apply(onError: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): PickImplonError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonError]
  }
  
  @scala.inline
  implicit class PickImplonErrorMutableBuilder[Self <: PickImplonError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
  }
}
