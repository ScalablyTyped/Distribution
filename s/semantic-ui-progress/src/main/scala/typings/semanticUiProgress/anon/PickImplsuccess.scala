package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'success'> */
@js.native
trait PickImplsuccess extends StObject {
  
  var success: `false` | String = js.native
}
object PickImplsuccess {
  
  @scala.inline
  def apply(success: `false` | String): PickImplsuccess = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsuccess]
  }
  
  @scala.inline
  implicit class PickImplsuccessMutableBuilder[Self <: PickImplsuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: `false` | String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
