package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  var body: Block | Null
  var name: String
  var parameters: ParameterList
  @JSName("type")
  var type_FunctionDefinition: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionDefinition
}

object FunctionDefinition {
  @scala.inline
  def apply(
    name: String,
    parameters: ParameterList,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionDefinition,
    body: Block = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(name = name, parameters = parameters)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionDefinition]
  }
}

