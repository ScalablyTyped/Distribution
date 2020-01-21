package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  var name: String
  @JSName("type")
  var type_Identifier: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier
}

object Identifier {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

