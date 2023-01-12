package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoWhileStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  var body: Statement
  
  var condition: Expression
  
  @JSName("type")
  var type_DoWhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
}
object DoWhileStatement {
  
  inline def apply(body: Statement, condition: Expression): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[DoWhileStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoWhileStatement] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
