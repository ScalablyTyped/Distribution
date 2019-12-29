package typings.rdfDashExt

import typings.rdfDashExt.libBlankNodeMod.BlankNodeExt
import typings.rdfDashExt.libDatasetMod.DatasetExt
import typings.rdfDashExt.libDefaultGraphMod.DefaultGraphExt
import typings.rdfDashExt.libLiteralMod.LiteralExt
import typings.rdfDashExt.libNamedNodeMod.NamedNodeExt
import typings.rdfDashExt.libQuadMod.QuadExt
import typings.rdfDashExt.libVariableMod.VariableExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlankNodeDataset extends js.Object {
  var BlankNode: BlankNodeExt
  var Dataset: DatasetExt
  var Literal: LiteralExt
  var NamedNode: NamedNodeExt
  var Quad: QuadExt
  var Variable: VariableExt
  var defaultGraph: DefaultGraphExt
}

object Anon_BlankNodeDataset {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): Anon_BlankNodeDataset = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlankNodeDataset]
  }
}

