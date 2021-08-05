package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyLiteral
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyExpression {
  
  @JSName("type")
  var type_AssemblyLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral
}
object AssemblyLiteral {
  
  inline def apply(): AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLiteral")
    __obj.asInstanceOf[AssemblyLiteral]
  }
  
  extension [Self <: AssemblyLiteral](x: Self) {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
