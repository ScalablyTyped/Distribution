package typings.rdfDashExt.libDataFactoryMod

import typings.rdfDashExt.Anon_BlankNode
import typings.rdfDashExt.TypeofClassDataFactoryExt
import typings.rdfDashExt.libBlankNodeMod.BlankNodeExt
import typings.rdfDashExt.libDatasetMod.DatasetExt
import typings.rdfDashExt.libDefaultGraphMod.DefaultGraphExt
import typings.rdfDashExt.libLiteralMod.LiteralExt
import typings.rdfDashExt.libNamedNodeMod.NamedNodeExt
import typings.rdfDashExt.libQuadMod.QuadExt
import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.libVariableMod.VariableExt
import typings.rdfDashExt.rdfDashExtStrings.graph
import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
@js.native
class ^ () extends DataFactoryExt

@JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: Anon_BlankNode = js.native
  var factory: TypeofClassDataFactoryExt = js.native
  def blankNode(): BlankNodeExt = js.native
  def blankNode(value: String): BlankNodeExt = js.native
  def dataset(): DatasetExt = js.native
  def dataset(quads: js.Array[Quad]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  def defaultGraph(): DefaultGraphExt = js.native
  def graph(): DatasetExt = js.native
  def graph(quads: js.Any): DatasetExt = js.native
  def literal(value: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: NamedNode): LiteralExt = js.native
  def namedNode(value: String): NamedNodeExt = js.native
  def prefixMap(prefixes: Prefixes): typings.rdfDashExt.libPrefixMapMod.^ = js.native
  def quad[Q /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): Q = js.native
  def quad[Q /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
  ): Q = js.native
  def triple[Q /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): Q = js.native
  def variable(value: String): VariableExt = js.native
}

