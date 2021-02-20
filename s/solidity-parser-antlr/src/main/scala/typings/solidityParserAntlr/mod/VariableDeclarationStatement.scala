package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.Statement because Already inherited */ @js.native
trait VariableDeclarationStatement
  extends SimpleStatement
     with BaseASTNode
     with ASTNode {
  
  var initialValue: js.UndefOr[Expression] = js.native
  
  @JSName("type")
  var type_VariableDeclarationStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement = js.native
  
  var variables: js.Array[ASTNode] = js.native
}
object VariableDeclarationStatement {
  
  @scala.inline
  def apply(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode]
  ): VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarationStatement]
  }
  
  @scala.inline
  implicit class VariableDeclarationStatementMutableBuilder[Self <: VariableDeclarationStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialValue(value: Expression): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: js.Array[ASTNode]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: ASTNode*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
