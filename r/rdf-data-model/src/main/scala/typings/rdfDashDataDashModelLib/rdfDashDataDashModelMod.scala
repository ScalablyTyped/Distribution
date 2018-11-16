package typings
package rdfDashDataDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-data-model", JSImport.Namespace)
@js.native
object rdfDashDataDashModelMod extends js.Object {
  val defaultGraphInstance: rdfDashJsLib.rdfDashJsMod.DefaultGraph = js.native
  def blankNode(): rdfDashJsLib.rdfDashJsMod.BlankNode = js.native
  def blankNode(value: java.lang.String): rdfDashJsLib.rdfDashJsMod.BlankNode = js.native
  def defaultGraph(): rdfDashJsLib.rdfDashJsMod.DefaultGraph = js.native
  def literal(value: java.lang.String): rdfDashJsLib.rdfDashJsMod.Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: java.lang.String): rdfDashJsLib.rdfDashJsMod.Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: rdfDashJsLib.rdfDashJsMod.NamedNode): rdfDashJsLib.rdfDashJsMod.Literal = js.native
  def namedNode(value: java.lang.String): rdfDashJsLib.rdfDashJsMod.NamedNode = js.native
  def quad(
    subject: rdfDashJsLib.rdfDashJsMod.Term,
    predicate: rdfDashJsLib.rdfDashJsMod.Term,
    `object`: rdfDashJsLib.rdfDashJsMod.Term
  ): rdfDashJsLib.rdfDashJsMod.Quad = js.native
  def quad(
    subject: rdfDashJsLib.rdfDashJsMod.Term,
    predicate: rdfDashJsLib.rdfDashJsMod.Term,
    `object`: rdfDashJsLib.rdfDashJsMod.Term,
    graph: rdfDashJsLib.rdfDashJsMod.Term
  ): rdfDashJsLib.rdfDashJsMod.Quad = js.native
  def triple(
    subject: rdfDashJsLib.rdfDashJsMod.Term,
    predicate: rdfDashJsLib.rdfDashJsMod.Term,
    `object`: rdfDashJsLib.rdfDashJsMod.Term
  ): rdfDashJsLib.rdfDashJsMod.Quad = js.native
  def variable(value: java.lang.String): rdfDashJsLib.rdfDashJsMod.Variable = js.native
}

