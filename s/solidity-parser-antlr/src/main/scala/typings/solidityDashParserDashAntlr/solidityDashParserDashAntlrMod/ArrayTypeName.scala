package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayTypeName
  extends TypeName
     with BaseASTNode {
  var baseTypeName: TypeName
  var length: js.UndefOr[Expression] = js.undefined
  @JSName("type")
  var type_ArrayTypeName: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ArrayTypeName
}

object ArrayTypeName {
  @scala.inline
  def apply(
    baseTypeName: TypeName,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ArrayTypeName,
    length: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ArrayTypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName)
    __obj.updateDynamic("type")(`type`)
    if (length != null) __obj.updateDynamic("length")(length)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ArrayTypeName]
  }
}

