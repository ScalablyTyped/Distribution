package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  var body: Statement
  
  var conditionExpression: js.UndefOr[Expression] = js.undefined
  
  var initExpression: js.UndefOr[SimpleStatement] = js.undefined
  
  var loopExpression: js.UndefOr[ExpressionStatement] = js.undefined
  
  @JSName("type")
  var type_ForStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement
}
object ForStatement {
  
  inline def apply(body: Statement): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[ForStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForStatement] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setConditionExpression(value: Expression): Self = StObject.set(x, "conditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "conditionExpression", js.undefined)
    
    inline def setInitExpression(value: SimpleStatement): Self = StObject.set(x, "initExpression", value.asInstanceOf[js.Any])
    
    inline def setInitExpressionUndefined: Self = StObject.set(x, "initExpression", js.undefined)
    
    inline def setLoopExpression(value: ExpressionStatement): Self = StObject.set(x, "loopExpression", value.asInstanceOf[js.Any])
    
    inline def setLoopExpressionUndefined: Self = StObject.set(x, "loopExpression", js.undefined)
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
