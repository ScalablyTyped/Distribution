package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhileStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_WhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement
}
object WhileStatement {
  
  inline def apply(): WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[WhileStatement]
  }
  
  extension [Self <: WhileStatement](x: Self) {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
