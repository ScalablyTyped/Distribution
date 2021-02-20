package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  var eventCall: FunctionCall = js.native
  
  @JSName("type")
  var type_EmitStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = js.native
}
object EmitStatement {
  
  @scala.inline
  def apply(
    eventCall: FunctionCall,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitStatement]
  }
  
  @scala.inline
  implicit class EmitStatementMutableBuilder[Self <: EmitStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventCall(value: FunctionCall): Self = StObject.set(x, "eventCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
