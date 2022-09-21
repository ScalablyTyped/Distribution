package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblyAssignment
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  var expression: AssemblyExpression
  
  var names: js.Array[Identifier]
  
  @JSName("type")
  var type_AssemblyAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
}
object AssemblyAssignment {
  
  inline def apply(expression: AssemblyExpression, names: js.Array[Identifier]): AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyAssignment")
    __obj.asInstanceOf[AssemblyAssignment]
  }
  
  extension [Self <: AssemblyAssignment](x: Self) {
    
    inline def setExpression(value: AssemblyExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[Identifier]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: Identifier*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
