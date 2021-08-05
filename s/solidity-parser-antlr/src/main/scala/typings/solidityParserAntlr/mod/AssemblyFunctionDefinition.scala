package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyFunctionDefinition
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyFunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition
}
object AssemblyFunctionDefinition {
  
  inline def apply(): AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFunctionDefinition")
    __obj.asInstanceOf[AssemblyFunctionDefinition]
  }
  
  extension [Self <: AssemblyFunctionDefinition](x: Self) {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
