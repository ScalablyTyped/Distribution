package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.Statement because Already inherited */ trait VariableDeclarationStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with SimpleStatement {
  
  var initialValue: js.UndefOr[Expression] = js.undefined
  
  @JSName("type")
  var type_VariableDeclarationStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement
  
  var variables: js.Array[ASTNode]
}
object VariableDeclarationStatement {
  
  inline def apply(variables: js.Array[ASTNode]): VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarationStatement")
    __obj.asInstanceOf[VariableDeclarationStatement]
  }
  
  extension [Self <: VariableDeclarationStatement](x: Self) {
    
    inline def setInitialValue(value: Expression): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[ASTNode]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: ASTNode*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
