package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContractDefinition
  extends BaseASTNode
     with ASTNode {
  var baseContracts: js.Array[InheritanceSpecifier] = js.native
  var kind: String = js.native
  var name: String = js.native
  var subNodes: js.Array[ASTNode] = js.native
  @JSName("type")
  var type_ContractDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition = js.native
}

object ContractDefinition {
  @scala.inline
  def apply(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
  ): ContractDefinition = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractDefinition]
  }
  @scala.inline
  implicit class ContractDefinitionOps[Self <: ContractDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseContractsVarargs(value: InheritanceSpecifier*): Self = this.set("baseContracts", js.Array(value :_*))
    @scala.inline
    def setBaseContracts(value: js.Array[InheritanceSpecifier]): Self = this.set("baseContracts", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubNodesVarargs(value: ASTNode*): Self = this.set("subNodes", js.Array(value :_*))
    @scala.inline
    def setSubNodes(value: js.Array[ASTNode]): Self = this.set("subNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

