package typings.rdfjsDataset

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DefaultGraph
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadObject
import typings.rdfJs.mod.QuadPredicate
import typings.rdfJs.mod.QuadSubject
import typings.rdfJs.mod.Variable
import typings.rdfjsDataset.datasetCoreMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/dataset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("blankNode")
  var blankNode_Original: js.Function0[BlankNode] = js.native
  var defaultGraphInstance: DefaultGraph = js.native
  @JSName("defaultGraph")
  var defaultGraph_Original: js.Function0[DefaultGraph] = js.native
  @JSName("literal")
  var literal_Original: js.Function1[/* value */ String, Literal] = js.native
  @JSName("namedNode")
  var namedNode_Original: js.Function1[/* value */ String, NamedNode[String]] = js.native
  @JSName("quad")
  var quad_Original: js.Function3[
    /* subject */ QuadSubject, 
    /* predicate */ QuadPredicate, 
    /* object */ QuadObject, 
    Quad
  ] = js.native
  @JSName("variable")
  var variable_Original: js.Function1[/* value */ String, Variable] = js.native
  def blankNode(): BlankNode = js.native
  def dataset[InQuad /* <: BaseQuad */](): ^[InQuad] = js.native
  def dataset[InQuad /* <: BaseQuad */](quads: js.Array[InQuad]): ^[InQuad] = js.native
  def defaultGraph(): DefaultGraph = js.native
  def literal(value: String): Literal = js.native
  def namedNode(value: String): NamedNode[String] = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): Quad = js.native
  def variable(value: String): Variable = js.native
}

