package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'error'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl>> */
trait PickImplerrorPartialPickIError
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var error: String & js.UndefOr[String]
  
  var success: js.UndefOr[String] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object PickImplerrorPartialPickIError {
  
  inline def apply(error: String & js.UndefOr[String]): PickImplerrorPartialPickIError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorPartialPickIError]
  }
  
  extension [Self <: PickImplerrorPartialPickIError](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setError(value: String & js.UndefOr[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
