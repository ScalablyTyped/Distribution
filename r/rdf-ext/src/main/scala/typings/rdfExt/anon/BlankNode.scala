package typings.rdfExt.anon

import org.scalablytyped.runtime.Instantiable2
import typings.rdfExt.blankNodeMod.BlankNodeExt
import typings.rdfExt.datasetMod.DatasetExt
import typings.rdfExt.defaultGraphMod.DefaultGraphExt
import typings.rdfExt.literalMod.LiteralExt
import typings.rdfExt.namedNodeMod.NamedNodeExt
import typings.rdfExt.prefixMapMod.Prefixes
import typings.rdfExt.prefixMapMod.^
import typings.rdfExt.quadMod.QuadExt
import typings.rdfExt.variableMod.VariableExt
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlankNode extends js.Object {
  var BlankNode: BlankNodeExt = js.native
  var Dataset: DatasetExt = js.native
  var Literal: LiteralExt = js.native
  var NamedNode: NamedNodeExt = js.native
  var PrefixMap: Instantiable2[/* factory */ DataFactory[Quad, Quad], /* prefixes */ Prefixes, ^] = js.native
  var Quad: QuadExt = js.native
  var Variable: VariableExt = js.native
  var defaultGraph: DefaultGraphExt = js.native
}

object BlankNode {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    PrefixMap: Instantiable2[/* factory */ DataFactory[Quad, Quad], /* prefixes */ Prefixes, ^],
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): BlankNode = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], PrefixMap = PrefixMap.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankNode]
  }
  @scala.inline
  implicit class BlankNodeOps[Self <: BlankNode] (val x: Self) extends AnyVal {
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
    def setNamedNode(value: NamedNodeExt): Self = this.set("NamedNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixMap(value: Instantiable2[/* factory */ DataFactory[Quad, Quad], /* prefixes */ Prefixes, ^]): Self = this.set("PrefixMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuad(value: QuadExt): Self = this.set("Quad", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable(value: VariableExt): Self = this.set("Variable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultGraph(value: DefaultGraphExt): Self = this.set("defaultGraph", value.asInstanceOf[js.Any])
  }
  
}

