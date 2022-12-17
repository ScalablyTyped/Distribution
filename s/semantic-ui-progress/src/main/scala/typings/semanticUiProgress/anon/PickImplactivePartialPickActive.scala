package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'active'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl>> */
trait PickImplactivePartialPickActive
  extends StObject
     with Param {
  
  var active: String
  
  var error: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[String] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object PickImplactivePartialPickActive {
  
  inline def apply(active: String): PickImplactivePartialPickActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactivePartialPickActive]
  }
  
  extension [Self <: PickImplactivePartialPickActive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
