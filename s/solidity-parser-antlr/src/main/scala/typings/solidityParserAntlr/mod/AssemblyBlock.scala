package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyBlock
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  var operations: js.Array[AssemblyItem]
  
  @JSName("type")
  var type_AssemblyBlock: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
}
object AssemblyBlock {
  
  inline def apply(operations: js.Array[AssemblyItem]): AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyBlock")
    __obj.asInstanceOf[AssemblyBlock]
  }
  
  extension [Self <: AssemblyBlock](x: Self) {
    
    inline def setOperations(value: js.Array[AssemblyItem]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: AssemblyItem*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
