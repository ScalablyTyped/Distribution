package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedTypeName
  extends StObject
     with BaseASTNode
     with ASTNode
     with TypeName {
  
  var namePath: String
  
  @JSName("type")
  var type_UserDefinedTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
}
object UserDefinedTypeName {
  
  inline def apply(namePath: String): UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UserDefinedTypeName")
    __obj.asInstanceOf[UserDefinedTypeName]
  }
  
  extension [Self <: UserDefinedTypeName](x: Self) {
    
    inline def setNamePath(value: String): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
