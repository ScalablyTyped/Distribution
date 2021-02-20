package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierInvocation
  extends BaseASTNode
     with ASTNode {
  
  var arguments: js.Array[Expression] | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_ModifierInvocation: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation = js.native
}
object ModifierInvocation {
  
  @scala.inline
  def apply(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation): ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierInvocation]
  }
  
  @scala.inline
  implicit class ModifierInvocationMutableBuilder[Self <: ModifierInvocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsNull: Self = StObject.set(x, "arguments", null)
    
    @scala.inline
    def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
