package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.ElementaryTypeName
  - typings.solidityParserAntlr.mod.UserDefinedTypeName
  - typings.solidityParserAntlr.mod.Mapping
  - typings.solidityParserAntlr.mod.ArrayTypeName
  - typings.solidityParserAntlr.mod.FunctionTypeName
*/
trait TypeName extends ASTNode

object TypeName {
  @scala.inline
  def Mapping(
    keyType: ElementaryTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping,
    valueType: TypeName
  ): TypeName = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName,
    visibility: String
  ): TypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def ElementaryTypeName(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName): TypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def UserDefinedTypeName(
    namePath: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  ): TypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  @scala.inline
  def ArrayTypeName(
    baseTypeName: TypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  ): TypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
}

