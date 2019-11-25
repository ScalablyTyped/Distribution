package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAccess
  extends Expression
     with BaseASTNode {
  var expression: Expression
  var memberName: String
  @JSName("type")
  var type_MemberAccess: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.MemberAccess
}

object MemberAccess {
  @scala.inline
  def apply(
    expression: Expression,
    memberName: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.MemberAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccess]
  }
}

