package typings.rdfDashExt

import org.scalablytyped.runtime.Instantiable2
import typings.rdfDashExt.libBlankNodeMod.BlankNodeExt
import typings.rdfDashExt.libDatasetMod.DatasetExt
import typings.rdfDashExt.libDefaultGraphMod.DefaultGraphExt
import typings.rdfDashExt.libLiteralMod.LiteralExt
import typings.rdfDashExt.libNamedNodeMod.NamedNodeExt
import typings.rdfDashExt.libPrefixMapMod.Prefixes
import typings.rdfDashExt.libPrefixMapMod.^
import typings.rdfDashExt.libQuadMod.QuadExt
import typings.rdfDashExt.libVariableMod.VariableExt
import typings.rdfDashJs.rdfDashJsMod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlankNode extends js.Object {
  var BlankNode: BlankNodeExt
  var Dataset: DatasetExt
  var Literal: LiteralExt
  var NamedNode: NamedNodeExt
  var PrefixMap: Instantiable2[/* factory */ DataFactory, /* prefixes */ Prefixes, ^]
  var Quad: QuadExt
  var Variable: VariableExt
  var defaultGraph: DefaultGraphExt
}

object Anon_BlankNode {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    PrefixMap: Instantiable2[/* factory */ DataFactory, /* prefixes */ Prefixes, ^],
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): Anon_BlankNode = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], PrefixMap = PrefixMap.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlankNode]
  }
}

