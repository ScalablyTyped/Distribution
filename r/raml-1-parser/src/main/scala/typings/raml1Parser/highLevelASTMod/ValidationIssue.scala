package typings.raml1Parser.highLevelASTMod

import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationIssue extends StObject {
  
  var actions: js.UndefOr[js.Array[ValidationAction]] = js.undefined
  
  var code: String
  
  var end: Double
  
  var extras: js.UndefOr[js.Array[ValidationIssue]] = js.undefined
  
  var isWarning: Boolean
  
  var message: String
  
  var node: IParseResult
  
  var path: String
  
  var start: Double
  
  var unit: js.UndefOr[ICompilationUnit] = js.undefined
}
object ValidationIssue {
  
  inline def apply(
    code: String,
    end: Double,
    isWarning: Boolean,
    message: String,
    node: IParseResult,
    path: String,
    start: Double
  ): ValidationIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], isWarning = isWarning.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationIssue]
  }
  
  extension [Self <: ValidationIssue](x: Self) {
    
    inline def setActions(value: js.Array[ValidationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: ValidationAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setExtras(value: js.Array[ValidationIssue]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    inline def setExtrasVarargs(value: ValidationIssue*): Self = StObject.set(x, "extras", js.Array(value*))
    
    inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNode(value: IParseResult): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: ICompilationUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
