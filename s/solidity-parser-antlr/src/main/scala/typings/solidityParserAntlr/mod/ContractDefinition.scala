package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractDefinition
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var baseContracts: js.Array[InheritanceSpecifier]
  
  var kind: String
  
  var name: String
  
  var subNodes: js.Array[ASTNode]
  
  @JSName("type")
  var type_ContractDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
}
object ContractDefinition {
  
  @scala.inline
  def apply(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode]
  ): ContractDefinition = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContractDefinition")
    __obj.asInstanceOf[ContractDefinition]
  }
  
  @scala.inline
  implicit class ContractDefinitionMutableBuilder[Self <: ContractDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseContracts(value: js.Array[InheritanceSpecifier]): Self = StObject.set(x, "baseContracts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseContractsVarargs(value: InheritanceSpecifier*): Self = StObject.set(x, "baseContracts", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubNodes(value: js.Array[ASTNode]): Self = StObject.set(x, "subNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubNodesVarargs(value: ASTNode*): Self = StObject.set(x, "subNodes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
