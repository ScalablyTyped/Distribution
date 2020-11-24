package typings.rdfExt.anon

import typings.rdfExt.blankNodeMod.BlankNodeExt
import typings.rdfExt.datasetMod.DatasetExt
import typings.rdfExt.defaultGraphMod.DefaultGraphExt
import typings.rdfExt.literalMod.LiteralExt
import typings.rdfExt.namedNodeMod.NamedNodeExt
import typings.rdfExt.quadMod.QuadExt
import typings.rdfExt.variableMod.VariableExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends js.Object {
  
  var BlankNode: BlankNodeExt = js.native
  
  var Dataset: DatasetExt = js.native
  
  var Literal: LiteralExt = js.native
  
  var NamedNode: NamedNodeExt[String] = js.native
  
  var Quad: QuadExt = js.native
  
  var Variable: VariableExt = js.native
  
  var defaultGraph: DefaultGraphExt = js.native
}
object Dataset {
  
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt[String],
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): Dataset = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
  
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
    
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
    def setBlankNode(value: BlankNodeExt): Self = this.set("BlankNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataset(value: DatasetExt): Self = this.set("Dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteral(value: LiteralExt): Self = this.set("Literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedNode(value: NamedNodeExt[String]): Self = this.set("NamedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuad(value: QuadExt): Self = this.set("Quad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: VariableExt): Self = this.set("Variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultGraph(value: DefaultGraphExt): Self = this.set("defaultGraph", value.asInstanceOf[js.Any])
  }
}
