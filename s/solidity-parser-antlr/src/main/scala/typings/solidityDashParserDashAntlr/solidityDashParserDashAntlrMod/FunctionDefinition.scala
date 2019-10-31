package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.`private`
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.constant
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.default
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.external
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.internal
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.payable
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.public
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.pure
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  var body: js.UndefOr[Block] = js.undefined
  var isConstructor: Boolean
  var modifiers: js.Array[ModifierInvocation]
  var name: js.UndefOr[String] = js.undefined
  var parameters: js.Array[VariableDeclaration]
  var returnParameters: js.UndefOr[js.Array[VariableDeclaration]] = js.undefined
  var stateMutability: js.UndefOr[pure | constant | payable | view] = js.undefined
  @JSName("type")
  var type_FunctionDefinition: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionDefinition
  var visibility: default | external | internal | public | `private`
}

object FunctionDefinition {
  @scala.inline
  def apply(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`,
    body: Block = null,
    loc: Location = null,
    name: String = null,
    range: js.Tuple2[Double, Double] = null,
    returnParameters: js.Array[VariableDeclaration] = null,
    stateMutability: pure | constant | payable | view = null
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor, modifiers = modifiers, parameters = parameters, visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (range != null) __obj.updateDynamic("range")(range)
    if (returnParameters != null) __obj.updateDynamic("returnParameters")(returnParameters)
    if (stateMutability != null) __obj.updateDynamic("stateMutability")(stateMutability.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
}

