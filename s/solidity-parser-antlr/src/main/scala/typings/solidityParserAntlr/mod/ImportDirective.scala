package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDirective
  extends BaseASTNode
     with ASTNode {
  var path: String
  var symbolAliases: js.Array[js.Tuple2[String, String]]
  @JSName("type")
  var type_ImportDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective
  var unitAlias: String
}

object ImportDirective {
  @scala.inline
  def apply(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDirective]
  }
}

