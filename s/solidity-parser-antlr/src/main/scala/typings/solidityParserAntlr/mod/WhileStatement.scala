package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhileStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_WhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement = js.native
}
object WhileStatement {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhileStatement]
  }
  
  @scala.inline
  implicit class WhileStatementMutableBuilder[Self <: WhileStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
