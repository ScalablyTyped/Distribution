package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mapping
  extends StObject
     with BaseASTNode
     with ASTNode
     with TypeName {
  
  var keyType: ElementaryTypeName
  
  @JSName("type")
  var type_Mapping: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping
  
  var valueType: TypeName
}
object Mapping {
  
  inline def apply(keyType: ElementaryTypeName, valueType: TypeName): Mapping = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Mapping")
    __obj.asInstanceOf[Mapping]
  }
  
  extension [Self <: Mapping](x: Self) {
    
    inline def setKeyType(value: ElementaryTypeName): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: TypeName): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
  }
}
