package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typings.solidityParserAntlr.solidityParserAntlrStrings.constant
import typings.solidityParserAntlr.solidityParserAntlrStrings.default
import typings.solidityParserAntlr.solidityParserAntlrStrings.external
import typings.solidityParserAntlr.solidityParserAntlrStrings.internal
import typings.solidityParserAntlr.solidityParserAntlrStrings.payable
import typings.solidityParserAntlr.solidityParserAntlrStrings.public
import typings.solidityParserAntlr.solidityParserAntlrStrings.pure
import typings.solidityParserAntlr.solidityParserAntlrStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  
  var body: js.UndefOr[Block] = js.native
  
  var isConstructor: Boolean = js.native
  
  var modifiers: js.Array[ModifierInvocation] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parameters: js.Array[VariableDeclaration] = js.native
  
  var returnParameters: js.UndefOr[js.Array[VariableDeclaration]] = js.native
  
  var stateMutability: js.UndefOr[pure | constant | payable | view] = js.native
  
  @JSName("type")
  var type_FunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = js.native
  
  var visibility: default | external | internal | public | `private` = js.native
}
object FunctionDefinition {
  
  @scala.inline
  def apply(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
  
  @scala.inline
  implicit class FunctionDefinitionMutableBuilder[Self <: FunctionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Block): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: js.Array[ModifierInvocation]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: ModifierInvocation*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: VariableDeclaration*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setReturnParameters(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "returnParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnParametersUndefined: Self = StObject.set(x, "returnParameters", js.undefined)
    
    @scala.inline
    def setReturnParametersVarargs(value: VariableDeclaration*): Self = StObject.set(x, "returnParameters", js.Array(value :_*))
    
    @scala.inline
    def setStateMutability(value: pure | constant | payable | view): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: default | external | internal | public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
