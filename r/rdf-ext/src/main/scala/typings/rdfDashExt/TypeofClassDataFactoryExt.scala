package typings.rdfDashExt

import org.scalablytyped.runtime.Instantiable0
import typings.rdfDashExt.libBlankNodeMod.BlankNodeExt
import typings.rdfDashExt.libDataFactoryMod.DataFactoryExt
import typings.rdfDashExt.libDataFactoryMod.Prefixes
import typings.rdfDashExt.libDatasetMod.DatasetExt
import typings.rdfDashExt.libDefaultGraphMod.DefaultGraphExt
import typings.rdfDashExt.libLiteralMod.LiteralExt
import typings.rdfDashExt.libNamedNodeMod.NamedNodeExt
import typings.rdfDashExt.libPrefixMapMod.^
import typings.rdfDashExt.libQuadMod.QuadExt
import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.libVariableMod.VariableExt
import typings.rdfDashExt.rdfDashExtStrings.graph
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Quad_Graph
import typings.rdfDashJs.rdfDashJsMod.Quad_Object
import typings.rdfDashJs.rdfDashJsMod.Quad_Predicate
import typings.rdfDashJs.rdfDashJsMod.Quad_Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassDataFactoryExt extends Instantiable0[DataFactoryExt] {
  var defaults: Anon_BlankNodeDataset = js.native
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
  def prefixMap(prefixes: Prefixes): ^ = js.native
  def quad(subject: Quad_Subject, predicate: Quad_Predicate, `object`: Quad_Object): QuadExt = js.native
  def quad(subject: Quad_Subject, predicate: Quad_Predicate, `object`: Quad_Object, graph: Quad_Graph): QuadExt = js.native
  def triple(subject: Quad_Subject, predicate: Quad_Predicate, `object`: Quad_Object): QuadExt = js.native
  def variable(value: String): VariableExt = js.native
}

