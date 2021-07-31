package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_ContinueStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement
}
object ContinueStatement {
  
  @scala.inline
  def apply(): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[ContinueStatement]
  }
  
  @scala.inline
  implicit class ContinueStatementMutableBuilder[Self <: ContinueStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
