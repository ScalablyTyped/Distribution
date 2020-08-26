package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._DefaultFactoryTypes
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import typings.rdflib.typesMod._FromValueReturns
import typings.rdflib.typesMod._ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/named-node", JSImport.Namespace)
@js.native
object namedNodeMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typings.rdflib.tfTypesMod.NamedNode because var conflicts: termType, value. Inlined  */ @js.native
  trait NamedNode
    extends typings.rdflib.nodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadPredicate
       with QuadSubject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[js.Any] {
    @JSName("termType")
    var termType_NamedNode: typings.rdflib.rdflibStrings.NamedNode = js.native
    /**
      * Returns an $rdf node for the containing directory, ending in slash.
      */
    def dir(): NamedNode | Null = js.native
    /**
      * Creates the fetchable named node for the document.
      * Removes everything from the # anchor tag.
      */
    def doc(): NamedNode = js.native
    /** The local identifier with the document */
    def id(): String = js.native
    /**
      * Returns an NN for the whole web site, ending in slash.
      * Contrast with the "origin" which does NOT have a trailing slash
      */
    def site(): NamedNode = js.native
    /** Alias for value, favored by Tim */
    def uri: String = js.native
    def uri_=(uri: String): Unit = js.native
  }
  
  @js.native
  class default protected ()
    extends NamedNode
       with GraphType
       with PredicateType
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    /**
      * Create a named (IRI) RDF Node
      * @constructor
      * @param iri - The IRI for this node
      */
    def this(iri: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Creates a named node from the specified input value
      * @param value - An input value
      */
    def fromValue(value: js.Any): js.Any = js.native
  }
  
}

