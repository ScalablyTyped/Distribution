package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'warning'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl>> */
trait PickImplwarningPartialPicActive
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[String] = js.undefined
  
  var warning: String
}
object PickImplwarningPartialPicActive {
  
  inline def apply(warning: String): PickImplwarningPartialPicActive = {
    val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplwarningPartialPicActive]
  }
  
  extension [Self <: PickImplwarningPartialPicActive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
