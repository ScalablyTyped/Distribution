package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Formula")
@js.native
class Formula protected () extends Node {
  /**
    * Initializes this formula
    * @param statements The initial statements in this formulat
    * @param constraints The additional constraints
    * @param initBindings The initial bindings
    * @param optional
    */
  def this(statements: js.Array[Statement], constraints: js.Array[_], initBindings: org.scalablytyped.runtime.StringDictionary[Node], optional: js.Array[_]) = this()
  /**
    * The stored statements
    */
  var statements: js.Array[Statement] = js.native
  /**
    * Transform a collection of NTriple URIs into their URI strings
    * @param t some iterable colletion of NTriple URI strings
    * @return a collection of the URIs as strings
    */
  def NTtoURI(t: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Adds a statement to this formula
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def add(s: ValueType, p: ValueType, o: ValueType, g: ValueType): scala.Double = js.native
  /**
    * Adds a statement to this formula
    * @param st The statement to add
    */
  def addStatement(st: Statement): scala.Double = js.native
  /**
    * Gets a node that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def any(s: ValueType, p: ValueType, o: ValueType, g: ValueType): Node = js.native
  /**
    * Gets a blank node
    * @param id The node's identifier
    */
  def bnode(id: java.lang.String): BlankNode = js.native
  /**
    * Finds the types in the list which have no *stored* subtypes
    * These are a set of classes which provide by themselves complete
    * information -- the other classes are redundant for those who
    * know the class DAG.
    * @param types A map of the types
    */
  def bottomTypeURIs(types: org.scalablytyped.runtime.StringDictionary[java.lang.String | NamedNode]): org.scalablytyped.runtime.StringDictionary[java.lang.String | NamedNode] = js.native
  /**
    * Gets a new collection
    */
  def collection(): Collection = js.native
  /**
    * Trace the statements which connect directly, or through bnodes
    * Returns an array of statements
    * doc param may be null to search all documents in store
    * @param subject A subject node
    * @param doc A document (the graph that contains statements)
    * @param excludePredicateURIs The predicate URIs to exclude
    */
  def connectedStatements(subject: Node, doc: ValueType, excludePredicateURIs: js.Array[java.lang.String]): js.Array[Statement] = js.native
  /**
    * Gets each node that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def each(s: ValueType, p: ValueType, o: ValueType, g: ValueType): js.Array[Node] = js.native
  /**
    * Gets whether this formula is equals to the other one
    * @param other The other formula
    */
  def equals(other: Formula): scala.Boolean = js.native
  /**
    * For thisClass or any subclass, anything which has it is its type
    * or is the object of something which has the type as its range, or subject
    * of something which has the type as its domain
    * We don't bother doing subproperty (yet?)as it doesn't seeem to be used
    * much.
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * @param subject A named node
    */
  def findMemberURIs(subject: Node): org.scalablytyped.runtime.StringDictionary[Statement] = js.native
  /**
    * For thisClass or any subclass, anything which has it is its type
    * or is the object of something which has the type as its range, or subject
    * of something which has the type as its domain
    * We don't bother doing subproperty (yet?)as it doesn't seeem to be used
    * much.
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * @param thisClass A named node
    */
  def findMembersNT(thisClass: Node): org.scalablytyped.runtime.StringDictionary[Statement] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a superclass
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    * @param subject A subject node
    */
  def findSubClassesNT(subject: Node): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a subclass
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    * @param subject A subject node
    */
  def findSuperClassesNT(subject: Node): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * todo: This will loop is there is a class subclass loop (Sublass loops are
    * not illegal)
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    * @param subject A subject node
    */
  def findTypeURIs(subject: Node): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * todo: This will loop is there is a class subclass loop (Sublass loops are
    * not illegal)
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    * @param subject A subject node
    */
  def findTypesNT(subject: Node): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /**
    * Creates a new empty formula
    */
  def formula(): Formula = js.native
  /**
    * Creates a new empty indexed formulat
    * @param features The list of features
    */
  def formula(features: js.Array[java.lang.String]): IndexedFormula = js.native
  /**
    * Transforms an NTriples string format into a Node.
    * The bnode bit should not be used on program-external values; designed
    * for internal work such as storing a bnode id in an HTML attribute.
    * This will only parse the strings generated by the vaious toNT() methods.
    * @param str A string representation
    */
  def fromNT(str: java.lang.String): Node = js.native
  def holds(s: js.Array[Statement]): scala.Boolean = js.native
  /**
    * Gets whether this formula holds the specified statement
    * @param s A statement
    */
  def holds(s: Statement): scala.Boolean = js.native
  /**
    * Gets whether this formula holds the specified statement
    * @param s A subject
    * @param p A predicate
    * @param o An object
    * @param g A containing graph
    */
  def holds(s: ValueType, p: ValueType, o: ValueType, g: ValueType): scala.Boolean = js.native
  /**
    * Gets whether this formula holds the specified statement
    * @param st A statement
    */
  def holdsStatement(st: Statement): scala.Boolean = js.native
  /**
    * Gets a collection from a list of values
    * @param values The values
    */
  def list(values: stdLib.Iterable[ValueType]): Collection = js.native
  /**
    * Gets a literal node
    * @param val The literal's lexical value
    * @param lang The language
    * @param dt The datatype as a named node
    */
  def literal(`val`: java.lang.String, lang: java.lang.String, dt: NamedNode): Literal = js.native
  /**
    * Gets a namespace for the specified namespace's URI
    * @param nsuri The URI for the namespace
    */
  def ns(nsuri: java.lang.String): js.Function1[/* ln */ java.lang.String, NamedNode] = js.native
  /**
    * Serializes this formula
    * @param base The base string
    * @param contentType The content type of the syntax to use
    * @param provenance The provenance URI
    */
  def serialize(base: java.lang.String, contentType: java.lang.String, provenance: java.lang.String): java.lang.String = js.native
  /**
    * Gets an named node for an URI
    * @param uri The URI
    */
  def sym(uri: java.lang.String): NamedNode = js.native
  def sym(uri: NamedNode): NamedNode = js.native
  /**
    * Gets the node matching the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def the(s: ValueType, p: ValueType, o: ValueType, g: ValueType): Node = js.native
  /**
    * Finds the types in the list which have no *stored* supertypes
    * We exclude the universal class, owl:Things and rdf:Resource, as it is
    * information-free.
    * @param types The types
    */
  def topTypeURIs(types: org.scalablytyped.runtime.StringDictionary[java.lang.String | NamedNode]): org.scalablytyped.runtime.StringDictionary[java.lang.String | NamedNode] = js.native
  /**
    * RDFS Inference
    * These are hand-written implementations of a backward-chaining reasoner
    * over the RDFS axioms.
    * @param seeds A hash of NTs of classes to start with
    * @param predicate The property to trace though
    * @param inverse Trace inverse direction
    */
  def transitiveClosure(seeds: org.scalablytyped.runtime.StringDictionary[scala.Boolean], predicate: Node, inverse: Node): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /**
    * Gets a new variable
    * @param name The variable's name
    */
  def variable(name: java.lang.String): Variable = js.native
  /**
    * Gets the number of statements in this formulat that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def whether(s: ValueType, p: ValueType, o: ValueType, g: ValueType): scala.Double = js.native
}

@JSImport("rdflib", "Formula")
@js.native
object Formula extends js.Object {
  var termType: java.lang.String = js.native
}

