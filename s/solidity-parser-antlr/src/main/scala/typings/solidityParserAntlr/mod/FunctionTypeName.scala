package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait FunctionTypeName
  extends TypeName
     with BaseASTNode {
  
  var parameterTypes: js.Array[TypeName] = js.native
  
  var returnTypes: js.Array[TypeName] = js.native
  
  var stateMutability: String = js.native
  
  @JSName("type")
  var type_FunctionTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName = js.native
  
  var visibility: String = js.native
}
object FunctionTypeName {
  
  @scala.inline
  def apply(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName,
    visibility: String
  ): FunctionTypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeName]
  }
  
  @scala.inline
  implicit class FunctionTypeNameMutableBuilder[Self <: FunctionTypeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterTypes(value: js.Array[TypeName]): Self = StObject.set(x, "parameterTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypesVarargs(value: TypeName*): Self = StObject.set(x, "parameterTypes", js.Array(value :_*))
    
    @scala.inline
    def setReturnTypes(value: js.Array[TypeName]): Self = StObject.set(x, "returnTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypesVarargs(value: TypeName*): Self = StObject.set(x, "returnTypes", js.Array(value :_*))
    
    @scala.inline
    def setStateMutability(value: String): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
