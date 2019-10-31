package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDirective
  extends BaseASTNode
     with ASTNode {
  var path: String
  var symbolAliases: js.Array[js.Tuple2[String, String]]
  @JSName("type")
  var type_ImportDirective: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ImportDirective
  var unitAlias: String
}

object ImportDirective {
  @scala.inline
  def apply(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ImportDirective,
    unitAlias: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ImportDirective = {
    val __obj = js.Dynamic.literal(path = path, symbolAliases = symbolAliases, unitAlias = unitAlias)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ImportDirective]
  }
}

