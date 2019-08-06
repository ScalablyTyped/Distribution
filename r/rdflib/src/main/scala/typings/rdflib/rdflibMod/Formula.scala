package typings.rdflib.rdflibMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
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
  def this(
    statements: js.Array[Statement],
    constraints: js.Array[_],
    initBindings: StringDictionary[Node],
    optional: js.Array[_]
  ) = this()
  /**
    * The stored statements
    */
  var statements: js.Array[Statement] = js.native
  /**
    * Transform a collection of NTriple URIs into their URI strings
    * @param t some iterable colletion of NTriple URI strings
    * @return a collection of the URIs as strings
    */
  def NTtoURI(t: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  /**
    * Adds a statement to this formula
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def add(s: Node, p: NamedNode, o: Node, g: NamedNode): Double = js.native
  /**
    * Adds all the statements to this formula
    * @param statements A collection of statements
    */
  def addAll(statements: Iterable[Statement]): Unit = js.native
  /**
    * Adds a statement to this formula
    * @param st The statement to add
    */
  def addStatement(st: Statement): Double = js.native
  /**
    * Gets a node that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def any(): Node | Null = js.native
  def any(s: Null, p: Null, o: Null, g: Node): Node | Null = js.native
  def any(s: Null, p: Null, o: Node): Node | Null = js.native
  def any(s: Null, p: Null, o: Node, g: Node): Node | Null = js.native
  def any(s: Null, p: Node): Node | Null = js.native
  def any(s: Null, p: Node, o: Null, g: Node): Node | Null = js.native
  def any(s: Null, p: Node, o: Node): Node | Null = js.native
  def any(s: Null, p: Node, o: Node, g: Node): Node | Null = js.native
  def any(s: Node): Node | Null = js.native
  def any(s: Node, p: Null, o: Null, g: Node): Node | Null = js.native
  def any(s: Node, p: Null, o: Node): Node | Null = js.native
  def any(s: Node, p: Null, o: Node, g: Node): Node | Null = js.native
  def any(s: Node, p: Node): Node | Null = js.native
  def any(s: Node, p: Node, o: Null, g: Node): Node | Null = js.native
  def any(s: Node, p: Node, o: Node): Node | Null = js.native
  def any(s: Node, p: Node, o: Node, g: Node): Node | Null = js.native
  /**
    * Gets the first JavaScript object equivalent to a node based on the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def anyJS(): js.Any = js.native
  def anyJS(s: Null, p: Null, o: Null, g: Node): js.Any = js.native
  def anyJS(s: Null, p: Null, o: Node): js.Any = js.native
  def anyJS(s: Null, p: Null, o: Node, g: Node): js.Any = js.native
  def anyJS(s: Null, p: Node): js.Any = js.native
  def anyJS(s: Null, p: Node, o: Null, g: Node): js.Any = js.native
  def anyJS(s: Null, p: Node, o: Node): js.Any = js.native
  def anyJS(s: Null, p: Node, o: Node, g: Node): js.Any = js.native
  def anyJS(s: Node): js.Any = js.native
  def anyJS(s: Node, p: Null, o: Null, g: Node): js.Any = js.native
  def anyJS(s: Node, p: Null, o: Node): js.Any = js.native
  def anyJS(s: Node, p: Null, o: Node, g: Node): js.Any = js.native
  def anyJS(s: Node, p: Node): js.Any = js.native
  def anyJS(s: Node, p: Node, o: Null, g: Node): js.Any = js.native
  def anyJS(s: Node, p: Node, o: Node): js.Any = js.native
  def anyJS(s: Node, p: Node, o: Node, g: Node): js.Any = js.native
  /**
    * Gets the first statement that matches the specified pattern
    * @param subj The subject
    * @param pred The predicate
    * @param obj The object
    * @param why The graph that contains the statement
    */
  def anyStatementMatching(): Statement = js.native
  def anyStatementMatching(subj: Null, pred: Null, obj: Null, why: Node): Statement = js.native
  def anyStatementMatching(subj: Null, pred: Null, obj: Node): Statement = js.native
  def anyStatementMatching(subj: Null, pred: Null, obj: Node, why: Node): Statement = js.native
  def anyStatementMatching(subj: Null, pred: Node): Statement = js.native
  def anyStatementMatching(subj: Null, pred: Node, obj: Null, why: Node): Statement = js.native
  def anyStatementMatching(subj: Null, pred: Node, obj: Node): Statement = js.native
  def anyStatementMatching(subj: Null, pred: Node, obj: Node, why: Node): Statement = js.native
  def anyStatementMatching(subj: Node): Statement = js.native
  def anyStatementMatching(subj: Node, pred: Null, obj: Null, why: Node): Statement = js.native
  def anyStatementMatching(subj: Node, pred: Null, obj: Node): Statement = js.native
  def anyStatementMatching(subj: Node, pred: Null, obj: Node, why: Node): Statement = js.native
  def anyStatementMatching(subj: Node, pred: Node): Statement = js.native
  def anyStatementMatching(subj: Node, pred: Node, obj: Null, why: Node): Statement = js.native
  def anyStatementMatching(subj: Node, pred: Node, obj: Node): Statement = js.native
  def anyStatementMatching(subj: Node, pred: Node, obj: Node, why: Node): Statement = js.native
  /**
    * Gets the value of a node that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def anyValue(): String = js.native
  def anyValue(s: Null, p: Null, o: Null, g: Node): String = js.native
  def anyValue(s: Null, p: Null, o: Node): String = js.native
  def anyValue(s: Null, p: Null, o: Node, g: Node): String = js.native
  def anyValue(s: Null, p: Node): String = js.native
  def anyValue(s: Null, p: Node, o: Null, g: Node): String = js.native
  def anyValue(s: Null, p: Node, o: Node): String = js.native
  def anyValue(s: Null, p: Node, o: Node, g: Node): String = js.native
  def anyValue(s: Node): String = js.native
  def anyValue(s: Node, p: Null, o: Null, g: Node): String = js.native
  def anyValue(s: Node, p: Null, o: Node): String = js.native
  def anyValue(s: Node, p: Null, o: Node, g: Node): String = js.native
  def anyValue(s: Node, p: Node): String = js.native
  def anyValue(s: Node, p: Node, o: Null, g: Node): String = js.native
  def anyValue(s: Node, p: Node, o: Node): String = js.native
  def anyValue(s: Node, p: Node, o: Node, g: Node): String = js.native
  /**
    * Gets a blank node
    * @param id The node's identifier
    */
  def bnode(id: String): BlankNode = js.native
  /**
    * Finds the types in the list which have no *stored* subtypes
    * These are a set of classes which provide by themselves complete
    * information -- the other classes are redundant for those who
    * know the class DAG.
    * @param types A map of the types
    */
  def bottomTypeURIs(types: StringDictionary[String | NamedNode]): StringDictionary[String | NamedNode] = js.native
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
  def connectedStatements(subject: Node, doc: ValueType, excludePredicateURIs: js.Array[String]): js.Array[Statement] = js.native
  /**
    * Gets each node that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def each(): js.Array[Node] = js.native
  def each(s: Null, p: Null, o: Null, g: Node): js.Array[Node] = js.native
  def each(s: Null, p: Null, o: Node): js.Array[Node] = js.native
  def each(s: Null, p: Null, o: Node, g: Node): js.Array[Node] = js.native
  def each(s: Null, p: Node): js.Array[Node] = js.native
  def each(s: Null, p: Node, o: Null, g: Node): js.Array[Node] = js.native
  def each(s: Null, p: Node, o: Node): js.Array[Node] = js.native
  def each(s: Null, p: Node, o: Node, g: Node): js.Array[Node] = js.native
  def each(s: Node): js.Array[Node] = js.native
  def each(s: Node, p: Null, o: Null, g: Node): js.Array[Node] = js.native
  def each(s: Node, p: Null, o: Node): js.Array[Node] = js.native
  def each(s: Node, p: Null, o: Node, g: Node): js.Array[Node] = js.native
  def each(s: Node, p: Node): js.Array[Node] = js.native
  def each(s: Node, p: Node, o: Null, g: Node): js.Array[Node] = js.native
  def each(s: Node, p: Node, o: Node): js.Array[Node] = js.native
  def each(s: Node, p: Node, o: Node, g: Node): js.Array[Node] = js.native
  /**
    * Gets whether this formula is equals to the other one
    * @param other The other formula
    */
  def equals(other: Formula): Boolean = js.native
  /**
    * For thisClass or any subclass, anything which has it is its type
    * or is the object of something which has the type as its range, or subject
    * of something which has the type as its domain
    * We don't bother doing subproperty (yet?)as it doesn't seeem to be used
    * much.
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * @param subject A named node
    */
  def findMemberURIs(subject: Node): StringDictionary[Statement] = js.native
  /**
    * For thisClass or any subclass, anything which has it is its type
    * or is the object of something which has the type as its range, or subject
    * of something which has the type as its domain
    * We don't bother doing subproperty (yet?)as it doesn't seeem to be used
    * much.
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * @param thisClass A named node
    */
  def findMembersNT(thisClass: Node): StringDictionary[Statement] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a superclass
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    * @param subject A subject node
    */
  def findSubClassesNT(subject: Node): StringDictionary[Boolean] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a subclass
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    * @param subject A subject node
    */
  def findSuperClassesNT(subject: Node): StringDictionary[Boolean] = js.native
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
  def findTypeURIs(subject: Node): StringDictionary[Boolean] = js.native
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
  def findTypesNT(subject: Node): StringDictionary[Boolean] = js.native
  /**
    * Creates a new empty formula - features not applicable, but necessary for typing to pass
    */
  def formula(): Formula = js.native
  def formula(features: js.Array[String]): Formula = js.native
  /**
    * Transforms an NTriples string format into a Node.
    * The bnode bit should not be used on program-external values; designed
    * for internal work such as storing a bnode id in an HTML attribute.
    * This will only parse the strings generated by the vaious toNT() methods.
    * @param str A string representation
    */
  def fromNT(str: String): Node = js.native
  /**
    * Gets whether this formula holds the specified statement
    * @param s A subject
    * @param p A predicate
    * @param o An object
    * @param g A containing graph
    */
  def holds(): Boolean = js.native
  def holds(s: Null, p: Null, o: Null, g: Node): Boolean = js.native
  def holds(s: Null, p: Null, o: Node): Boolean = js.native
  def holds(s: Null, p: Null, o: Node, g: Node): Boolean = js.native
  def holds(s: Null, p: Node): Boolean = js.native
  def holds(s: Null, p: Node, o: Null, g: Node): Boolean = js.native
  def holds(s: Null, p: Node, o: Node): Boolean = js.native
  def holds(s: Null, p: Node, o: Node, g: Node): Boolean = js.native
  def holds(s: Node): Boolean = js.native
  def holds(s: Node, p: Null, o: Null, g: Node): Boolean = js.native
  def holds(s: Node, p: Null, o: Node): Boolean = js.native
  def holds(s: Node, p: Null, o: Node, g: Node): Boolean = js.native
  def holds(s: Node, p: Node): Boolean = js.native
  def holds(s: Node, p: Node, o: Null, g: Node): Boolean = js.native
  def holds(s: Node, p: Node, o: Node): Boolean = js.native
  def holds(s: Node, p: Node, o: Node, g: Node): Boolean = js.native
  /**
    * Gets whether this formula holds the specified statement
    * @param st A statement
    */
  def holdsStatement(st: Statement): Boolean = js.native
  /**
    * Gets a collection from a list of values
    * @param values The values
    */
  def list(values: Iterable[ValueType]): Collection = js.native
  /**
    * Gets a literal node
    * @param val The literal's lexical value
    * @param lang The language
    * @param dt The datatype as a named node
    */
  def literal(`val`: String, lang: String, dt: NamedNode): Literal = js.native
  /**
    * Gets a namespace for the specified namespace's URI
    * @param nsuri The URI for the namespace
    */
  def ns(nsuri: String): js.Function1[/* ln */ String, NamedNode] = js.native
  /**
    * Serializes this formula
    * @param base The base string
    * @param contentType The content type of the syntax to use
    * @param provenance The provenance URI
    */
  def serialize(base: String, contentType: String, provenance: String): String = js.native
  /**
    * Gets the statements matching the specified pattern
    * @param subj The subject
    * @param pred The predicate
    * @param obj The object
    * @param why The graph that contains the statement
    * @param justOne Whether to only get one statement
    */
  def statementsMatching(): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Null, obj: Null, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Null, obj: Null, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Null, obj: Null, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Null, obj: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Null, obj: Node, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Null, obj: Node, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Null, obj: Node, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node, obj: Null, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node, obj: Null, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node, obj: Null, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node, obj: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node, obj: Node, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node, obj: Node, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Null, pred: Node, obj: Node, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Null, obj: Null, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Null, obj: Null, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Null, obj: Null, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Null, obj: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Null, obj: Node, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Null, obj: Node, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Null, obj: Node, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Null, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Null, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Null, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Node, why: Null, justOne: Boolean): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Node, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Node, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  /**
    * Gets an named node for an URI
    * @param uri The URI
    */
  def sym(uri: String): NamedNode = js.native
  def sym(uri: NamedNode): NamedNode = js.native
  /**
    * Gets the node matching the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def the(): Node = js.native
  def the(s: Null, p: Null, o: Null, g: Node): Node = js.native
  def the(s: Null, p: Null, o: Node): Node = js.native
  def the(s: Null, p: Null, o: Node, g: Node): Node = js.native
  def the(s: Null, p: Node): Node = js.native
  def the(s: Null, p: Node, o: Null, g: Node): Node = js.native
  def the(s: Null, p: Node, o: Node): Node = js.native
  def the(s: Null, p: Node, o: Node, g: Node): Node = js.native
  def the(s: Node): Node = js.native
  def the(s: Node, p: Null, o: Null, g: Node): Node = js.native
  def the(s: Node, p: Null, o: Node): Node = js.native
  def the(s: Node, p: Null, o: Node, g: Node): Node = js.native
  def the(s: Node, p: Node): Node = js.native
  def the(s: Node, p: Node, o: Null, g: Node): Node = js.native
  def the(s: Node, p: Node, o: Node): Node = js.native
  def the(s: Node, p: Node, o: Node, g: Node): Node = js.native
  /**
    * Finds the types in the list which have no *stored* supertypes
    * We exclude the universal class, owl:Things and rdf:Resource, as it is
    * information-free.
    * @param types The types
    */
  def topTypeURIs(types: StringDictionary[String | NamedNode]): StringDictionary[String | NamedNode] = js.native
  /**
    * RDFS Inference
    * These are hand-written implementations of a backward-chaining reasoner
    * over the RDFS axioms.
    * @param seeds A hash of NTs of classes to start with
    * @param predicate The property to trace though
    * @param inverse Trace inverse direction
    */
  def transitiveClosure(seeds: StringDictionary[Boolean], predicate: Node, inverse: Node): StringDictionary[Boolean] = js.native
  /**
    * Gets a new variable
    * @param name The variable's name
    */
  def variable(name: String): Variable = js.native
  /**
    * Gets the number of statements in this formulat that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def whether(): Double = js.native
  def whether(s: Null, p: Null, o: Null, g: Node): Double = js.native
  def whether(s: Null, p: Null, o: Node): Double = js.native
  def whether(s: Null, p: Null, o: Node, g: Node): Double = js.native
  def whether(s: Null, p: Node): Double = js.native
  def whether(s: Null, p: Node, o: Null, g: Node): Double = js.native
  def whether(s: Null, p: Node, o: Node): Double = js.native
  def whether(s: Null, p: Node, o: Node, g: Node): Double = js.native
  def whether(s: Node): Double = js.native
  def whether(s: Node, p: Null, o: Null, g: Node): Double = js.native
  def whether(s: Node, p: Null, o: Node): Double = js.native
  def whether(s: Node, p: Null, o: Node, g: Node): Double = js.native
  def whether(s: Node, p: Node): Double = js.native
  def whether(s: Node, p: Node, o: Null, g: Node): Double = js.native
  def whether(s: Node, p: Node, o: Node): Double = js.native
  def whether(s: Node, p: Node, o: Node, g: Node): Double = js.native
}

/* static members */
@JSImport("rdflib", "Formula")
@js.native
object Formula extends js.Object {
  var termType: String = js.native
}

