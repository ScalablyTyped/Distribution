package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  var body: Block | scala.Null
  var name: java.lang.String
  var parameters: ParameterList
  @JSName("type")
  var type_FunctionDefinition: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.FunctionDefinition
}

object FunctionDefinition {
  @scala.inline
  def apply(
    name: java.lang.String,
    parameters: ParameterList,
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.FunctionDefinition,
    body: Block = null,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parameters")(parameters)
    if (body != null) __obj.updateDynamic("body")(body)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionDefinition]
  }
}

