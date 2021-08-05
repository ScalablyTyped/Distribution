package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplError extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[String] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplError {
  
  inline def apply(): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
  
  extension [Self <: PartialPickImplkeyofImplError](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
