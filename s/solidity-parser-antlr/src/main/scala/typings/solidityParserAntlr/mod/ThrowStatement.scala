package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrowStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_ThrowStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement
}
object ThrowStatement {
  
  @scala.inline
  def apply(): ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[ThrowStatement]
  }
  
  @scala.inline
  implicit class ThrowStatementMutableBuilder[Self <: ThrowStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
