package typings.rdflib.formulaMod

import org.scalablytyped.runtime.StringDictionary
import typings.rdflib.collectionMod.Collection
import typings.rdflib.factoryTypesMod.Indexable
import typings.rdflib.factoryTypesMod.TFIDFactoryTypes
import typings.rdflib.rdflibStrings.Graph
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.Quad
import typings.rdflib.tfTypesMod.QuadGraph
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.tfTypesMod.QuadPredicate
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.tfTypesMod.RdfJsDataFactory
import typings.rdflib.tfTypesMod.Term
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formula
  extends typings.rdflib.nodeInternalMod.default {
  var constraints: js.Array[_] = js.native
  /**
    * The accompanying fetcher instance.
    *
    * Is set by the fetcher when initialized.
    */
  var fetcher: js.UndefOr[typings.rdflib.fetcherMod.default] = js.native
  var initBindings: js.Array[_] = js.native
  var isVar: Double = js.native
  /**
    * A namespace for the specified namespace's URI
    * @param nsuri The URI for the namespace
    */
  @JSName("ns")
  var ns_Original: js.Function2[
    /* nsuri */ String, 
    /* factory */ js.UndefOr[RdfJsDataFactory], 
    js.Function1[/* ln */ String, NamedNode]
  ] = js.native
  var optional: js.Array[_] = js.native
  /** The factory used to generate statements and terms */
  var rdfFactory: js.Any = js.native
  var statements: js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  @JSName("termType")
  var termType_Formula: Graph = js.native
  /**
    * Transform a collection of NTriple URIs into their URI strings
    * @param t - Some iterable collection of NTriple URI strings
    * @return A collection of the URIs as strings
    * todo: explain why it is important to go through NT
    */
  def NTtoURI(t: js.Any): js.Object = js.native
  def add(subject: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]]): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]],
    predicate: QuadPredicate
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]],
    predicate: QuadPredicate,
    `object`: String
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]],
    predicate: QuadPredicate,
    `object`: String,
    graph: QuadGraph
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]],
    predicate: QuadPredicate,
    `object`: Term
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]],
    predicate: QuadPredicate,
    `object`: Term,
    graph: QuadGraph
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(subject: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  /** Add a statement from its parts
    * @param subject - the first part of the statement
    * @param predicate - the second part of the statement
    * @param object - the third part of the statement
    * @param graph - the last part of the statement
    */
  def add(subject: QuadSubject): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(subject: QuadSubject, predicate: QuadPredicate): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(subject: QuadSubject, predicate: QuadPredicate, `object`: String): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(subject: QuadSubject, predicate: QuadPredicate, `object`: String, graph: QuadGraph): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(subject: QuadSubject, predicate: QuadPredicate, `object`: Term): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(subject: QuadSubject, predicate: QuadPredicate, `object`: Term, graph: QuadGraph): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(subject: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], predicate: QuadPredicate): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph],
    predicate: QuadPredicate,
    `object`: String
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph],
    predicate: QuadPredicate,
    `object`: String,
    graph: QuadGraph
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph],
    predicate: QuadPredicate,
    `object`: Term
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  def add(
    subject: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph],
    predicate: QuadPredicate,
    `object`: Term,
    graph: QuadGraph
  ): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  /**
    * Adds all the statements to this formula
    * @param statements - A collection of statements
    */
  def addAll(statements: js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]]): Unit = js.native
  /** Add a statment object
    * @param {Statement} statement - An existing constructed statement to add
    */
  def addStatement(statement: Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]): (typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]) | Null | this.type | Double = js.native
  /** Follow link from one node, using one wildcard, looking for one
    *
    * For example, any(me, knows, null, profile)  - a person I know accoring to my profile .
    * any(me, knows, null, null)  - a person I know accoring to anything in store .
    * any(null, knows, me, null)  - a person who know me accoring to anything in store .
    *
    * @param s - A node to search for as subject, or if null, a wildcard
    * @param p - A node to search for as predicate, or if null, a wildcard
    * @param o - A node to search for as object, or if null, a wildcard
    * @param g - A node to search for as graph, or if null, a wildcard
    * @returns A node which match the wildcard position, or null
    */
  def any(): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: Null, p: Null, o: Null, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: Null, p: Null, o: QuadObject): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: Null, p: Null, o: QuadObject, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: Null, p: QuadPredicate): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: Null, p: QuadPredicate, o: Null, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: Null, p: QuadPredicate, o: QuadObject): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject, p: Null, o: Null, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject, p: Null, o: QuadObject): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject, p: QuadPredicate): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject, p: QuadPredicate, o: QuadObject): typings.rdflib.nodeInternalMod.default | Null = js.native
  def any(s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): typings.rdflib.nodeInternalMod.default | Null = js.native
  /**
    * Gets the first JavaScript object equivalent to a node based on the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def anyJS(): js.Any = js.native
  def anyJS(s: Null, p: Null, o: Null, g: QuadGraph): js.Any = js.native
  def anyJS(s: Null, p: Null, o: QuadObject): js.Any = js.native
  def anyJS(s: Null, p: Null, o: QuadObject, g: QuadGraph): js.Any = js.native
  def anyJS(s: Null, p: QuadPredicate): js.Any = js.native
  def anyJS(s: Null, p: QuadPredicate, o: Null, g: QuadGraph): js.Any = js.native
  def anyJS(s: Null, p: QuadPredicate, o: QuadObject): js.Any = js.native
  def anyJS(s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.Any = js.native
  def anyJS(s: QuadSubject): js.Any = js.native
  def anyJS(s: QuadSubject, p: Null, o: Null, g: QuadGraph): js.Any = js.native
  def anyJS(s: QuadSubject, p: Null, o: QuadObject): js.Any = js.native
  def anyJS(s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): js.Any = js.native
  def anyJS(s: QuadSubject, p: QuadPredicate): js.Any = js.native
  def anyJS(s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): js.Any = js.native
  def anyJS(s: QuadSubject, p: QuadPredicate, o: QuadObject): js.Any = js.native
  def anyJS(s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.Any = js.native
  /**
    * Gets the first statement that matches the specified pattern
    */
  def anyStatementMatching(): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: Null, p: Null, o: Null, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: Null, p: Null, o: QuadObject): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: Null, p: Null, o: QuadObject, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: Null, p: QuadPredicate): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: Null, p: QuadPredicate, o: Null, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: Null, p: QuadPredicate, o: QuadObject): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject, p: Null, o: Null, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject, p: Null, o: QuadObject): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject, p: QuadPredicate): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject, p: QuadPredicate, o: QuadObject): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def anyStatementMatching(s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.UndefOr[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  /**
    * Gets the value of a node that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def anyValue(): String | Unit = js.native
  def anyValue(s: Null, p: Null, o: Null, g: QuadGraph): String | Unit = js.native
  def anyValue(s: Null, p: Null, o: QuadObject): String | Unit = js.native
  def anyValue(s: Null, p: Null, o: QuadObject, g: QuadGraph): String | Unit = js.native
  def anyValue(s: Null, p: QuadPredicate): String | Unit = js.native
  def anyValue(s: Null, p: QuadPredicate, o: Null, g: QuadGraph): String | Unit = js.native
  def anyValue(s: Null, p: QuadPredicate, o: QuadObject): String | Unit = js.native
  def anyValue(s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): String | Unit = js.native
  def anyValue(s: QuadSubject): String | Unit = js.native
  def anyValue(s: QuadSubject, p: Null, o: Null, g: QuadGraph): String | Unit = js.native
  def anyValue(s: QuadSubject, p: Null, o: QuadObject): String | Unit = js.native
  def anyValue(s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): String | Unit = js.native
  def anyValue(s: QuadSubject, p: QuadPredicate): String | Unit = js.native
  def anyValue(s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): String | Unit = js.native
  def anyValue(s: QuadSubject, p: QuadPredicate, o: QuadObject): String | Unit = js.native
  def anyValue(s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): String | Unit = js.native
  /**
    * Shortcut for adding blankNodes
    * @param [id]
    */
  def bnode(): typings.rdflib.blankNodeMod.default = js.native
  def bnode(id: String): typings.rdflib.blankNodeMod.default = js.native
  /**
    * Finds the types in the list which have no *stored* subtypes
    * These are a set of classes which provide by themselves complete
    * information -- the other classes are redundant for those who
    * know the class DAG.
    * @param types A map of the types
    */
  def bottomTypeURIs(types: js.Any): js.Any = js.native
  /** Creates a new collection */
  def collection(): typings.rdflib.collectionMod.default[
    typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | Collection[_] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
  ] = js.native
  /** Trace statements which connect directly, or through bnodes
    *
    * @param subject - The node to start looking for statments
    * @param doc - The document to be searched, or null to search all documents
    * @returns an array of statements, duplicate statements are suppresssed.
    */
  def connectedStatements(subject: QuadSubject, doc: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def connectedStatements(subject: QuadSubject, doc: QuadGraph, excludePredicateURIs: js.Array[String]): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  /** Follow links from one node, using one wildcard.
    *
    * For example, each(me, knows, null, profile)  - people I know accoring to my profile .
    * each(me, knows, null, null)  - people I know accoring to anything in store .
    * each(null, knows, me, null)  - people who know me accoring to anything in store .
    *
    * @param s - A node to search for as subject, or if null, a wildcard
    * @param p - A node to search for as predicate, or if null, a wildcard
    * @param o - A node to search for as object, or if null, a wildcard
    * @param g - A node to search for as graph, or if null, a wildcard
    * @returns {Array<Node>} - An array of nodes which match the wildcard position
    */
  def each(): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: Null, p: Null, o: Null, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: Null, p: Null, o: QuadObject): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: Null, p: Null, o: QuadObject, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: Null, p: QuadPredicate): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: Null, p: QuadPredicate, o: Null, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: Null, p: QuadPredicate, o: QuadObject): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject, p: Null, o: Null, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject, p: Null, o: QuadObject): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject, p: QuadPredicate): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject, p: QuadPredicate, o: QuadObject): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  def each(s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.Array[typings.rdflib.nodeInternalMod.default] = js.native
  /**
    * Test whether this formula is equals to {other}
    * @param other - The other formula
    */
  def equals(other: Formula): Boolean = js.native
  /**
    * For thisClass or any subclass, anything which has it is its type
    * or is the object of something which has the type as its range, or subject
    * of something which has the type as its domain
    * We don't bother doing subproperty (yet?)as it doesn't seeem to be used
    * much.
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * @param subject - A named node
    */
  def findMemberURIs(subject: typings.rdflib.nodeInternalMod.default): UriMap = js.native
  /**
    * For thisClass or any subclass, anything which has it is its type
    * or is the object of something which has the type as its range, or subject
    * of something which has the type as its domain
    * We don't bother doing subproperty (yet?)as it doesn't seeem to be used
    * much.
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * @return a hash of URIs
    */
  def findMembersNT(thisClass: js.Any): MembersMap = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a superclass
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    */
  def findSubClassesNT(subject: typings.rdflib.nodeInternalMod.default): StringDictionary[Boolean] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a subclass
    * @param {RDFlibNamedNode} subject - The thing whose classes are to be found
    * @returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    */
  def findSuperClassesNT(subject: typings.rdflib.nodeInternalMod.default): StringDictionary[Boolean] = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * todo: This will loop is there is a class subclass loop (Sublass loops are
    * not illegal)
    * Returns a hash table where key is NT of type and value is statement why we
    * think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    * @param subject - A subject node
    */
  def findTypeURIs(subject: QuadSubject): UriMap = js.native
  /**
    * Get all the Classes of which we can RDFS-infer the subject is a member
    * todo: This will loop is there is a class subclass loop (Sublass loops are
    * not illegal)
    * @param {RDFlibNamedNode} subject - The thing whose classes are to be found
    * @returns a hash table where key is NT of type and value is statement why we think so.
    * Does NOT return terms, returns URI strings.
    * We use NT representations in this version because they handle blank nodes.
    */
  def findTypesNT(subject: js.Any): StringDictionary[Boolean] = js.native
  /**
    * Creates a new empty formula
    *
    * @param _features - Not applicable, but necessary for typing to pass
    */
  def formula(): Formula = js.native
  def formula(_features: js.Array[String]): Formula = js.native
  /**
    * Transforms an NTriples string format into a Node.
    * The blank node bit should not be used on program-external values; designed
    * for internal work such as storing a blank node id in an HTML attribute.
    * This will only parse the strings generated by the various toNT() methods.
    */
  def fromNT(str: js.Any): js.Any = js.native
  /** Returns true if this formula holds the specified statement(s) */
  def holds(s: js.Any): Boolean = js.native
  def holds(s: js.Any, p: js.Any): Boolean = js.native
  def holds(s: js.Any, p: js.Any, o: js.Any): Boolean = js.native
  def holds(s: js.Any, p: js.Any, o: js.Any, g: js.Any): Boolean = js.native
  def holds(s: js.Array[_]): Boolean = js.native
  def holds(s: js.Array[_], p: js.Any): Boolean = js.native
  def holds(s: js.Array[_], p: js.Any, o: js.Any): Boolean = js.native
  def holds(s: js.Array[_], p: js.Any, o: js.Any, g: js.Any): Boolean = js.native
  /**
    * Returns true if this formula holds the specified {statement}
    */
  def holdsStatement(statement: js.Any): Boolean = js.native
  /**
    * Returns a unique index-safe identifier for the given term.
    *
    * Falls back to the rdflib hashString implementation if the given factory doesn't support id.
    */
  def id(term: TFIDFactoryTypes): Indexable = js.native
  /**
    * Used by the n3parser to generate list elements
    * @param values - The values of the collection
    * @param context - The store
    * @return {BlankNode|Collection} - The term for the statement
    */
  def list(values: js.Any, context: js.Any): js.Any = js.native
  /**
    * A namespace for the specified namespace's URI
    * @param nsuri The URI for the namespace
    */
  def ns(nsuri: String): js.Function1[/* ln */ String, NamedNode] = js.native
  def ns(nsuri: String, factory: RdfJsDataFactory): js.Function1[/* ln */ String, NamedNode] = js.native
  /**
    * Serializes this formula
    * @param base - The base string
    * @param contentType - The content type of the syntax to use
    * @param provenance - The provenance URI
    */
  def serialize(base: js.Any, contentType: js.Any, provenance: js.Any): js.Any = js.native
  /**
    * Search the Store
    * This is really a teaching method as to do this properly you would use IndexedFormula
    *
    * @param s - A node to search for as subject, or if null, a wildcard
    * @param p - A node to search for as predicate, or if null, a wildcard
    * @param o - A node to search for as object, or if null, a wildcard
    * @param g - A node to search for as graph, or if null, a wildcard
    * @param justOne - flag - stop when found one rather than get all of them?
    * @returns {Array<Node>} - An array of nodes which match the wildcard position
    */
  def statementsMatching[JustOne /* <: Boolean */](): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: Null, o: Null, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: Null, o: Null, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: Null, o: Null, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: Null, o: QuadObject): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: Null, o: QuadObject, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: Null, o: QuadObject, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: Null, o: QuadObject, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate, o: Null, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate, o: Null, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate, o: Null, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate, o: QuadObject): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate, o: QuadObject, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: Null, o: Null, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: Null, o: Null, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: Null, o: Null, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: Null, o: QuadObject): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: Null, o: QuadObject, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate, o: Null, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate, o: QuadObject): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate, o: QuadObject, g: Null, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def statementsMatching[JustOne /* <: Boolean */](s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph, justOne: Boolean): js.Array[
    typings.rdflib.statementMod.default[SubjectType, PredicateType, ObjectType, GraphType]
  ] = js.native
  def sym(uri: String): typings.rdflib.namedNodeMod.default = js.native
  def sym(uri: String, name: js.Any): typings.rdflib.namedNodeMod.default = js.native
  /**
    * Gets the node matching the specified pattern. Throws when no match could be made.
    * @param s - The subject
    * @param p - The predicate
    * @param o - The object
    * @param g - The graph that contains the statement
    */
  def the(): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: Null, p: Null, o: Null, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: Null, p: Null, o: QuadObject): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: Null, p: Null, o: QuadObject, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: Null, p: QuadPredicate): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: Null, p: QuadPredicate, o: Null, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: Null, p: QuadPredicate, o: QuadObject): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject, p: Null, o: Null, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject, p: Null, o: QuadObject): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject, p: QuadPredicate): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject, p: QuadPredicate, o: QuadObject): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  def the(s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): js.UndefOr[typings.rdflib.nodeInternalMod.default | Null] = js.native
  /**
    * Finds the types in the list which have no *stored* supertypes
    * We exclude the universal class, owl:Things and rdf:Resource, as it is
    * information-free.
    * @param types - The types
    */
  def topTypeURIs(types: StringDictionary[String | typings.rdflib.namedNodeMod.default]): StringDictionary[String | typings.rdflib.namedNodeMod.default] = js.native
  /**
    * RDFS Inference
    * These are hand-written implementations of a backward-chaining reasoner
    * over the RDFS axioms.
    * @param seeds - A hash of NTs of classes to start with
    * @param predicate - The property to trace though
    * @param inverse - Trace inverse direction
    */
  def transitiveClosure(seeds: BooleanMap, predicate: QuadPredicate): StringDictionary[Boolean] = js.native
  def transitiveClosure(seeds: BooleanMap, predicate: QuadPredicate, inverse: Boolean): StringDictionary[Boolean] = js.native
  /**
    * Gets a new variable
    * @param name - The variable's name
    */
  def variable(name: String): typings.rdflib.variableMod.default = js.native
  /**
    * Gets the number of statements in this formula that matches the specified pattern
    * @param s - The subject
    * @param p - The predicate
    * @param o - The object
    * @param g - The graph that contains the statement
    */
  def whether(): Double = js.native
  def whether(s: Null, p: Null, o: Null, g: QuadGraph): Double = js.native
  def whether(s: Null, p: Null, o: QuadObject): Double = js.native
  def whether(s: Null, p: Null, o: QuadObject, g: QuadGraph): Double = js.native
  def whether(s: Null, p: QuadPredicate): Double = js.native
  def whether(s: Null, p: QuadPredicate, o: Null, g: QuadGraph): Double = js.native
  def whether(s: Null, p: QuadPredicate, o: QuadObject): Double = js.native
  def whether(s: Null, p: QuadPredicate, o: QuadObject, g: QuadGraph): Double = js.native
  def whether(s: QuadSubject): Double = js.native
  def whether(s: QuadSubject, p: Null, o: Null, g: QuadGraph): Double = js.native
  def whether(s: QuadSubject, p: Null, o: QuadObject): Double = js.native
  def whether(s: QuadSubject, p: Null, o: QuadObject, g: QuadGraph): Double = js.native
  def whether(s: QuadSubject, p: QuadPredicate): Double = js.native
  def whether(s: QuadSubject, p: QuadPredicate, o: Null, g: QuadGraph): Double = js.native
  def whether(s: QuadSubject, p: QuadPredicate, o: QuadObject): Double = js.native
  def whether(s: QuadSubject, p: QuadPredicate, o: QuadObject, g: QuadGraph): Double = js.native
}

