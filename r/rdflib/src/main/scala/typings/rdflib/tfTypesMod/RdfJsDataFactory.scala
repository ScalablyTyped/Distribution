package typings.rdflib.tfTypesMod

import typings.rdflib.factoryTypesMod.SupportTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdfJsDataFactory extends js.Object {
  /**
    * Returns a new instance of Quad, such that newObject.equals(original) returns true.
    * Not implemented in RDFJS, so optional.
    */
  var fromQuad: js.UndefOr[
    js.Function1[
      /* original */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], 
      Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]
    ]
  ] = js.native
  /**
    * Returns a new instance of the specific Term subclass given by original.termType
    * (e.g., NamedNode, BlankNode, Literal, etc.),
    * such that newObject.equals(original) returns true.
    * Not implemented in RDFJS, so optional.
    */
  var fromTerm: js.UndefOr[js.Function1[/* original */ Term, Term]] = js.native
  /**
    * Check for specific features/behaviour on the factory.
    *
    * This does not exist on the original RDF/JS spec
    */
  var supports: SupportTable = js.native
  /** Returns a new instance of Variable. This method is optional. */
  var variable: js.UndefOr[js.Function1[/* value */ String, Variable]] = js.native
  /**
    * Returns a new instance of BlankNode.
    * If the value parameter is undefined a new identifier for the
    * blank node is generated for each call.
    */
  def blankNode(): BlankNode = js.native
  def blankNode(value: String): BlankNode = js.native
  /**
    * Returns an instance of DefaultGraph.
    */
  def defaultGraph(): DefaultGraph = js.native
  /**
    * Returns a new instance of Literal.
    * If languageOrDatatype is a NamedNode, then it is used for the value of datatype.
    * Otherwise languageOrDatatype is used for the value of language. */
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: NamedNode): Literal = js.native
  /** Returns a new instance of NamedNode. */
  def namedNode(value: String): NamedNode = js.native
  /**
    * Returns a new instance of Quad.
    * If graph is undefined or null it MUST set graph to a DefaultGraph.
    */
  def quad(subject: Term, predicate: Term, `object`: Term): Quad[_, _, _, _] = js.native
  def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad[_, _, _, _] = js.native
  /**
    * Returns a new instance of Quad.
    * If graph is undefined or null it MUST set graph to a DefaultGraph.
    */
  def triple(subject: Term, predicate: Term, `object`: Term): Quad[_, _, _, _] = js.native
  def triple(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad[_, _, _, _] = js.native
}

