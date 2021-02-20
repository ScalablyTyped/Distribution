package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  var body: Statement = js.native
  
  var conditionExpression: js.UndefOr[Expression] = js.native
  
  var initExpression: js.UndefOr[SimpleStatement] = js.native
  
  var loopExpression: js.UndefOr[ExpressionStatement] = js.native
  
  @JSName("type")
  var type_ForStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement = js.native
}
object ForStatement {
  
  @scala.inline
  def apply(body: Statement, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
  
  @scala.inline
  implicit class ForStatementMutableBuilder[Self <: ForStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpression(value: Expression): Self = StObject.set(x, "conditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressionUndefined: Self = StObject.set(x, "conditionExpression", js.undefined)
    
    @scala.inline
    def setInitExpression(value: SimpleStatement): Self = StObject.set(x, "initExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitExpressionUndefined: Self = StObject.set(x, "initExpression", js.undefined)
    
    @scala.inline
    def setLoopExpression(value: ExpressionStatement): Self = StObject.set(x, "loopExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopExpressionUndefined: Self = StObject.set(x, "loopExpression", js.undefined)
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
