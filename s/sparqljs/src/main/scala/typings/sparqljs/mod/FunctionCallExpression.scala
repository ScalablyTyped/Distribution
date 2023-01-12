package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.functionCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionCallExpression
  extends StObject
     with BaseExpression
     with _Expression {
  
  var args: js.Array[Expression]
  
  var function: String
  
  @JSName("type")
  var type_FunctionCallExpression: functionCall
}
object FunctionCallExpression {
  
  inline def apply(args: js.Array[Expression], function: String): FunctionCallExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("functionCall")
    __obj.asInstanceOf[FunctionCallExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionCallExpression] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Expression*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setType(value: functionCall): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
