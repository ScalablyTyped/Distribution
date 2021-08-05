package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.ElementaryTypeName
  - typings.solidityParserAntlr.mod.UserDefinedTypeName
  - typings.solidityParserAntlr.mod.Mapping
  - typings.solidityParserAntlr.mod.ArrayTypeName
  - typings.solidityParserAntlr.mod.FunctionTypeName
*/
trait TypeName
  extends StObject
     with ASTNode
object TypeName {
  
  inline def ArrayTypeName(baseTypeName: TypeName): typings.solidityParserAntlr.mod.ArrayTypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeName")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ArrayTypeName]
  }
  
  inline def ElementaryTypeName(name: String): typings.solidityParserAntlr.mod.ElementaryTypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeName")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ElementaryTypeName]
  }
  
  inline def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    visibility: String
  ): typings.solidityParserAntlr.mod.FunctionTypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeName")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.FunctionTypeName]
  }
  
  inline def Mapping(keyType: ElementaryTypeName, valueType: TypeName): typings.solidityParserAntlr.mod.Mapping = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Mapping")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Mapping]
  }
  
  inline def UserDefinedTypeName(namePath: String): typings.solidityParserAntlr.mod.UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UserDefinedTypeName")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.UserDefinedTypeName]
  }
}
