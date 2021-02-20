package typings.rdfDataModel

import typings.rdfJs.mod.BlankNode
import typings.rdfJs.mod.DefaultGraph
import typings.rdfJs.mod.Literal
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import typings.rdfJs.mod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-data-model", "blankNode")
  @js.native
  def blankNode(): BlankNode = js.native
  @JSImport("rdf-data-model", "blankNode")
  @js.native
  def blankNode(value: String): BlankNode = js.native
  
  @JSImport("rdf-data-model", "defaultGraph")
  @js.native
  def defaultGraph(): DefaultGraph = js.native
  
  @JSImport("rdf-data-model", "defaultGraphInstance")
  @js.native
  val defaultGraphInstance: DefaultGraph = js.native
  
  @JSImport("rdf-data-model", "literal")
  @js.native
  def literal(value: String): Literal = js.native
  @JSImport("rdf-data-model", "literal")
  @js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  @JSImport("rdf-data-model", "literal")
  @js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): Literal = js.native
  
  @JSImport("rdf-data-model", "namedNode")
  @js.native
  def namedNode(value: String): NamedNode[String] = js.native
  
  @JSImport("rdf-data-model", "quad")
  @js.native
  def quad(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  @JSImport("rdf-data-model", "quad")
  @js.native
  def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad = js.native
  
  @JSImport("rdf-data-model", "triple")
  @js.native
  def triple(subject: Term, predicate: Term, `object`: Term): Quad = js.native
  
  @JSImport("rdf-data-model", "variable")
  @js.native
  def variable(value: String): Variable = js.native
}
