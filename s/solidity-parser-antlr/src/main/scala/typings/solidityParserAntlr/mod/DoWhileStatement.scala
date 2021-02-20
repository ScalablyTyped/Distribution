package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoWhileStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  var body: Statement = js.native
  
  var condition: Expression = js.native
  
  @JSName("type")
  var type_DoWhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement = js.native
}
object DoWhileStatement {
  
  @scala.inline
  def apply(
    body: Statement,
    condition: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoWhileStatement]
  }
  
  @scala.inline
  implicit class DoWhileStatementMutableBuilder[Self <: DoWhileStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
