package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'success'> */
trait PickImplsuccess extends StObject {
  
  var success: `false` | String
}
object PickImplsuccess {
  
  inline def apply(success: `false` | String): PickImplsuccess = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsuccess]
  }
  
  extension [Self <: PickImplsuccess](x: Self) {
    
    inline def setSuccess(value: `false` | String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
