package typings.rdflib

import typings.rdflib.tfTypesMod.DefaultGraph
import typings.rdflib.tfTypesMod.Quad
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.typesMod.Bindings
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/statement", JSImport.Namespace)
@js.native
object statementMod extends js.Object {
  @js.native
  trait Statement[S /* <: SubjectType */, P /* <: PredicateType */, O /* <: ObjectType */, G /* <: GraphType */] extends Quad[S, P, O, G | DefaultGraph] {
    /**
      * Checks whether two statements are the same
      * @param other - The other statement
      */
    def equals(other: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): Boolean = js.native
    /**
      * Creates a statement with the bindings substituted
      * @param bindings The bindings
      */
    def substitute(bindings: Bindings): Statement[SubjectType, PredicateType, ObjectType, GraphType] = js.native
    /** Creates a canonical string representation of this statement. */
    def toCanonical(): String = js.native
    /** Creates a n-quads string representation of this statement */
    def toNQ(): String = js.native
    /** Creates a n-triples string representation of this statement */
    def toNT(): String = js.native
    /** Alias for graph, favored by Tim */
    def why: DefaultGraph | G = js.native
    def why_=(g: DefaultGraph | G): Unit = js.native
  }
  
  @js.native
  class default[S /* <: SubjectType */, P /* <: PredicateType */, O /* <: ObjectType */, G /* <: GraphType */] protected () extends Statement[S, P, O, G] {
    /**
      * Construct a new statement
      *
      * @param subject - The subject of the triple.  What the fact is about
      * @param predicate - The relationship which is asserted between the subject and object
      * @param object - The thing or data value which is asserted to be related to the subject
      * @param {NamedNode} graph - The document where the triple is or was or will be stored on the web.
      *
      * The graph param is a named node of the document in which the triple when it is stored
      *  on the web. It exists because when you have read data from various places in the web,
      *  the “graph” tells you _why_ you have the triple. (At the moment, it is just the
      *  document, in future it could be an inference step)
      *
      * When you do UpdateManager.update() then the graph’s of all the statements must be the same,
      *  and give the document you are patching. In future, we may have a more
      *  powerful update() which can update more than one document.
      */
    def this(subject: S, predicate: P, `object`: O) = this()
    def this(subject: S, predicate: P, `object`: O, graph: G) = this()
    def this(subject: S, predicate: P, `object`: O, graph: DefaultGraph) = this()
  }
  
}

