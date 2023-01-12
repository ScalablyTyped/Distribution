package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginValidationIssue extends StObject {
  
  var isWarning: js.UndefOr[Boolean] = js.undefined
  
  var issueCode: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[IValidationPath] = js.undefined
}
object PluginValidationIssue {
  
  inline def apply(): PluginValidationIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginValidationIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginValidationIssue] (val x: Self) extends AnyVal {
    
    inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
    
    inline def setIsWarningUndefined: Self = StObject.set(x, "isWarning", js.undefined)
    
    inline def setIssueCode(value: String): Self = StObject.set(x, "issueCode", value.asInstanceOf[js.Any])
    
    inline def setIssueCodeUndefined: Self = StObject.set(x, "issueCode", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPath(value: IValidationPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
