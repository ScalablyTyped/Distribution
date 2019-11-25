package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ElementaryTypeName
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.UserDefinedTypeName
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Mapping
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ArrayTypeName
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.FunctionTypeName
*/
trait TypeName extends ASTNode

object TypeName {
  @scala.inline
  def UserDefinedTypeName(
    namePath: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.UserDefinedTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): TypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def Mapping(
    keyType: ElementaryTypeName,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Mapping,
    valueType: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): TypeName = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def ElementaryTypeName(
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): TypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeName,
    visibility: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): TypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def ArrayTypeName(
    baseTypeName: TypeName,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ArrayTypeName,
    length: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): TypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
}

