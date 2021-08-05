package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleExpression
  extends StObject
     with BaseASTNode
     with ASTNode
     with Expression
     with PrimaryExpression {
  
  var components: js.Array[Expression]
  
  var isArray: Boolean
  
  @JSName("type")
  var type_TupleExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
}
object TupleExpression {
  
  inline def apply(components: js.Array[Expression], isArray: Boolean): TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[TupleExpression]
  }
  
  extension [Self <: TupleExpression](x: Self) {
    
    inline def setComponents(value: js.Array[Expression]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: Expression*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
