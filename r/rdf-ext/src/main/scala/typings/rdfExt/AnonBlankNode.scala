package typings.rdfExt

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

trait AnonBlankNode extends js.Object {
  var BlankNode: BlankNodeExt
  var Dataset: DatasetExt
  var Literal: LiteralExt
  var NamedNode: NamedNodeExt
  var PrefixMap: Instantiable2[/* factory */ DataFactory[Quad, Quad], /* prefixes */ Prefixes, ^]
  var Quad: QuadExt
  var Variable: VariableExt
  var defaultGraph: DefaultGraphExt
}

object AnonBlankNode {
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
  ): AnonBlankNode = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], PrefixMap = PrefixMap.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlankNode]
  }
}

