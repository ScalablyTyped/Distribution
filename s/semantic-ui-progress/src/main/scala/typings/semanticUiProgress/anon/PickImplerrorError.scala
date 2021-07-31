package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'error'> */
trait PickImplerrorError extends StObject {
  
  var error: `false` | String
}
object PickImplerrorError {
  
  @scala.inline
  def apply(error: `false` | String): PickImplerrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorError]
  }
  
  @scala.inline
  implicit class PickImplerrorErrorMutableBuilder[Self <: PickImplerrorError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: `false` | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
