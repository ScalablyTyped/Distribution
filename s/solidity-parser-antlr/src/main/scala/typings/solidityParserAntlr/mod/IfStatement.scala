package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  var condition: Expression = js.native
  
  var falseBody: js.UndefOr[Statement] = js.native
  
  var trueBody: Statement = js.native
  
  @JSName("type")
  var type_IfStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = js.native
}
object IfStatement {
  
  @scala.inline
  def apply(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
  
  @scala.inline
  implicit class IfStatementMutableBuilder[Self <: IfStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseBody(value: Statement): Self = StObject.set(x, "falseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseBodyUndefined: Self = StObject.set(x, "falseBody", js.undefined)
    
    @scala.inline
    def setTrueBody(value: Statement): Self = StObject.set(x, "trueBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
