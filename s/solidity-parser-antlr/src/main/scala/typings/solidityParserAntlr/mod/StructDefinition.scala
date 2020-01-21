package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructDefinition
  extends BaseASTNode
     with ASTNode {
  var members: js.Array[VariableDeclaration]
  var name: String
  @JSName("type")
  var type_StructDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
}

object StructDefinition {
  @scala.inline
  def apply(
    members: js.Array[VariableDeclaration],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): StructDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructDefinition]
  }
}

