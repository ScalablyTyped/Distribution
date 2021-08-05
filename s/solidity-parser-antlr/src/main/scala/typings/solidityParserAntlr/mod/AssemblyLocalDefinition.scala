package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyLocalDefinition
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblyLocalDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition
}
object AssemblyLocalDefinition {
  
  inline def apply(): AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLocalDefinition")
    __obj.asInstanceOf[AssemblyLocalDefinition]
  }
  
  extension [Self <: AssemblyLocalDefinition](x: Self) {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
