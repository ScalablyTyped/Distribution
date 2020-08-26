package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typings.solidityParserAntlr.solidityParserAntlrStrings.constant
import typings.solidityParserAntlr.solidityParserAntlrStrings.default
import typings.solidityParserAntlr.solidityParserAntlrStrings.external
import typings.solidityParserAntlr.solidityParserAntlrStrings.internal
import typings.solidityParserAntlr.solidityParserAntlrStrings.payable
import typings.solidityParserAntlr.solidityParserAntlrStrings.public
import typings.solidityParserAntlr.solidityParserAntlrStrings.pure
import typings.solidityParserAntlr.solidityParserAntlrStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  var body: js.UndefOr[Block] = js.native
  var isConstructor: Boolean = js.native
  var modifiers: js.Array[ModifierInvocation] = js.native
  var name: js.UndefOr[String] = js.native
  var parameters: js.Array[VariableDeclaration] = js.native
  var returnParameters: js.UndefOr[js.Array[VariableDeclaration]] = js.native
  var stateMutability: js.UndefOr[pure | constant | payable | view] = js.native
  @JSName("type")
  var type_FunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = js.native
  var visibility: default | external | internal | public | `private` = js.native
}

object FunctionDefinition {
  @scala.inline
  def apply(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
  @scala.inline
  implicit class FunctionDefinitionOps[Self <: FunctionDefinition] (val x: Self) extends AnyVal {
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
    def setIsConstructor(value: Boolean): Self = this.set("isConstructor", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiersVarargs(value: ModifierInvocation*): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(value: js.Array[ModifierInvocation]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersVarargs(value: VariableDeclaration*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[VariableDeclaration]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: default | external | internal | public | `private`): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: Block): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReturnParametersVarargs(value: VariableDeclaration*): Self = this.set("returnParameters", js.Array(value :_*))
    @scala.inline
    def setReturnParameters(value: js.Array[VariableDeclaration]): Self = this.set("returnParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnParameters: Self = this.set("returnParameters", js.undefined)
    @scala.inline
    def setStateMutability(value: pure | constant | payable | view): Self = this.set("stateMutability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateMutability: Self = this.set("stateMutability", js.undefined)
  }
  
}

