package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition
  extends BaseASTNode
     with ASTNode {
  var name: String
  var parameters: js.Array[VariableDeclaration]
  @JSName("type")
  var type_EventDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
}

object EventDefinition {
  @scala.inline
  def apply(
    name: String,
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EventDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDefinition]
  }
}

