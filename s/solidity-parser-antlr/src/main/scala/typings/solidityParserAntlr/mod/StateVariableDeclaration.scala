package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateVariableDeclaration
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var initialValue: js.UndefOr[Expression] = js.undefined
  
  @JSName("type")
  var type_StateVariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration
  
  var variables: js.Array[VariableDeclaration]
}
object StateVariableDeclaration {
  
  inline def apply(variables: js.Array[VariableDeclaration]): StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StateVariableDeclaration")
    __obj.asInstanceOf[StateVariableDeclaration]
  }
  
  extension [Self <: StateVariableDeclaration](x: Self) {
    
    inline def setInitialValue(value: Expression): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: VariableDeclaration*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
