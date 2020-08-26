package typings.rdfExt.anon

import org.scalablytyped.runtime.Instantiable0
import typings.rdfExt.blankNodeMod.BlankNodeExt
import typings.rdfExt.dataFactoryMod.DataFactoryExt
import typings.rdfExt.dataFactoryMod.Prefixes
import typings.rdfExt.datasetMod.DatasetExt
import typings.rdfExt.defaultGraphMod.DefaultGraphExt
import typings.rdfExt.literalMod.LiteralExt
import typings.rdfExt.namedNodeMod.NamedNodeExt
import typings.rdfExt.prefixMapMod.^
import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.quadMod.QuadExt
import typings.rdfExt.rdfExtStrings.graph
import typings.rdfExt.variableMod.VariableExt
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.QuadObject
import typings.rdfJs.mod.QuadPredicate
import typings.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDataFactoryExt extends Instantiable0[DataFactoryExt] {
  var defaults: Dataset = js.native
  def blankNode(): BlankNodeExt = js.native
  def blankNode(value: String): BlankNodeExt = js.native
  def dataset(): DatasetExt = js.native
  def dataset(quads: js.Array[Quad]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.UndefOr[scala.Nothing], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  def defaultGraph(): DefaultGraphExt = js.native
  def graph(): DatasetExt = js.native
  def graph(quads: js.Any): DatasetExt = js.native
  def literal(value: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): LiteralExt = js.native
  def namedNode(value: String): NamedNodeExt = js.native
  def prefixMap(prefixes: Prefixes): ^ = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def variable(value: String): VariableExt = js.native
}

