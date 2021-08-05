package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifierInvocation
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var arguments: js.Array[Expression] | Null
  
  var name: String
  
  @JSName("type")
  var type_ModifierInvocation: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation
}
object ModifierInvocation {
  
  inline def apply(name: String): ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], arguments = null)
    __obj.updateDynamic("type")("ModifierInvocation")
    __obj.asInstanceOf[ModifierInvocation]
  }
  
  extension [Self <: ModifierInvocation](x: Self) {
    
    inline def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsNull: Self = StObject.set(x, "arguments", null)
    
    inline def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
