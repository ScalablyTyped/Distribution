package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseASTNode extends js.Object {
  var loc: js.UndefOr[Location] = js.undefined
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var `type`: ASTNodeTypeString
}

object BaseASTNode {
  @scala.inline
  def apply(`type`: ASTNodeTypeString, loc: Location = null, range: js.Tuple2[Double, Double] = null): BaseASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseASTNode]
  }
}

