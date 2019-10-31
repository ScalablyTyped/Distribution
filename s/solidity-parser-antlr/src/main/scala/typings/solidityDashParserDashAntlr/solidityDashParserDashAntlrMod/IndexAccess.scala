package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait IndexAccess
  extends Expression
     with BaseASTNode {
  var base: Expression
  var index: Expression
  @JSName("type")
  var type_IndexAccess: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IndexAccess
}

object IndexAccess {
  @scala.inline
  def apply(
    base: Expression,
    index: Expression,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IndexAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): IndexAccess = {
    val __obj = js.Dynamic.literal(base = base, index = index)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[IndexAccess]
  }
}

