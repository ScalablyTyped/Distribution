package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  var statements: js.Array[Statement]
  
  @JSName("type")
  var type_Block: typings.solidityParserAntlr.solidityParserAntlrStrings.Block
}
object Block {
  
  inline def apply(statements: js.Array[Statement]): Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value*))
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
