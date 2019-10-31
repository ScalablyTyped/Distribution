package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait FunctionTypeName
  extends TypeName
     with BaseASTNode {
  var parameterTypes: js.Array[TypeName]
  var returnTypes: js.Array[TypeName]
  var stateMutability: String
  @JSName("type")
  var type_FunctionTypeName: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeName
  var visibility: String
}

object FunctionTypeName {
  @scala.inline
  def apply(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeName,
    visibility: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): FunctionTypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes, returnTypes = returnTypes, stateMutability = stateMutability, visibility = visibility)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionTypeName]
  }
}

