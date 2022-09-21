package typings.raml1Parser.highLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify rTypes.tsInterfaces.PluginValidationIssue * / any */ trait PluginValidationIssue extends StObject {
  
  var isWarning: js.UndefOr[Boolean] = js.undefined
  
  var issueCode: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var node: js.UndefOr[IParseResult] = js.undefined
  
  var validationIssue: js.UndefOr[ValidationIssue] = js.undefined
}
object PluginValidationIssue {
  
  inline def apply(): PluginValidationIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginValidationIssue]
  }
  
  extension [Self <: PluginValidationIssue](x: Self) {
    
    inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
    
    inline def setIsWarningUndefined: Self = StObject.set(x, "isWarning", js.undefined)
    
    inline def setIssueCode(value: String): Self = StObject.set(x, "issueCode", value.asInstanceOf[js.Any])
    
    inline def setIssueCodeUndefined: Self = StObject.set(x, "issueCode", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNode(value: IParseResult): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setValidationIssue(value: ValidationIssue): Self = StObject.set(x, "validationIssue", value.asInstanceOf[js.Any])
    
    inline def setValidationIssueUndefined: Self = StObject.set(x, "validationIssue", js.undefined)
  }
}
