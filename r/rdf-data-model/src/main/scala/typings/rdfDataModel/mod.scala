package typings.rdfDataModel

import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DefaultGraph
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-data-model", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultGraphInstance: DefaultGraph = js.native
  def blankNode(): BlankNode = js.native
  def blankNode(value: String): BlankNode = js.native
  def defaultGraph(): DefaultGraph = js.native
  def literal(value: String): Literal = js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = js.native
  def namedNode(value: String): NamedNode[String] = js.native
  def quad(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad = js.native
  def triple(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  def variable(value: String): Variable = js.native
}

