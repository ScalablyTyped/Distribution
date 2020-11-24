package typings.solidityParserAntlr.mod

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
  implicit class VariableDeclarationStatementOps[Self <: VariableDeclarationStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: ASTNode*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[ASTNode]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValue(value: Expression): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
  }
}
