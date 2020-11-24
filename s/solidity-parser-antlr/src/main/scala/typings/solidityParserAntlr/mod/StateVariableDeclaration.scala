package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateVariableDeclaration
  extends BaseASTNode
     with ASTNode {
  
  var initialValue: js.UndefOr[Expression] = js.native
  
  @JSName("type")
  var type_StateVariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration = js.native
  
  var variables: js.Array[VariableDeclaration] = js.native
}
object StateVariableDeclaration {
  
  @scala.inline
  def apply(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration]
  ): StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateVariableDeclaration]
  }
  
  @scala.inline
  implicit class StateVariableDeclarationOps[Self <: StateVariableDeclaration] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: VariableDeclaration*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[VariableDeclaration]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValue(value: Expression): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
  }
}
