package typings.solidityParserAntlr.mod

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
  implicit class ForStatementOps[Self <: ForStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: Statement): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpression(value: Expression): Self = this.set("conditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionExpression: Self = this.set("conditionExpression", js.undefined)
    
    @scala.inline
    def setInitExpression(value: SimpleStatement): Self = this.set("initExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitExpression: Self = this.set("initExpression", js.undefined)
    
    @scala.inline
    def setLoopExpression(value: ExpressionStatement): Self = this.set("loopExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoopExpression: Self = this.set("loopExpression", js.undefined)
  }
}
