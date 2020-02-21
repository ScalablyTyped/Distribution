package typings.rdflib.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rdflib.AnonDelete
import typings.rdflib.rdflibStrings.FunctionalProperty
import typings.rdflib.rdflibStrings.InverseFunctionalProperty
import typings.rdflib.rdflibStrings.`two-direction`
import typings.rdflib.rdflibStrings.delete
import typings.rdflib.rdflibStrings.sameAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "IndexedFormula")
@js.native
class IndexedFormula protected () extends Formula {
  /**
    * Creates a new formula
    * @param features The list of features to support
    */
  def this(features: js.Array[String]) = this()
  /**
    * The number of statements in this formula
    */
  var length: Double = js.native
  /**
    * Dictionary of namespace prefixes
    */
  var namespaces: StringDictionary[String] = js.native
  /**
    * An UpdateManager initialised to this store
    */
  var updater: js.UndefOr[UpdateManager] = js.native
  /**
    * Return all equivalent URIs by which this is known
    * @param x A named node
    */
  def allAliases(x: NamedNode_): js.Array[NamedNode_] = js.native
  /**
    * Apply a set of statements to be deleted and to be inserted
    *
    * @param patch The set of statements to be deleted and to be inserted
    * @param target The name of the document to patch
    * @param patchCallback Callback to be called when patching is complete
    */
  def applyPatch(patch: AnonDelete, target: NamedNode_, patchCallback: js.Function0[Unit]): Unit = js.native
  /**
    * Returns the symbol with canonical URI as smushed
    * @param term A RDF node
    */
  def canon(term: Node): Node = js.native
  /**
    * Checks this formula for consistency
    */
  def check(): Unit = js.native
  /**
    * Checks a list of statements for consistency
    * @param sts The list of statements to check
    * @param from An index with the array ['subject', 'predicate', 'object', 'why']
    */
  def checkStatementList(sts: js.Array[Statement], from: Double): Boolean = js.native
  /**
    * Closes this formula (and return it)
    */
  def close(): IndexedFormula = js.native
  /**
    * replaces @template with @target and add appropriate triples
    * removes no triples by default and is a one-direction replication
    * @param template node to copy
    * @param target node to copy to
    * @param flags Whether or not to do a two-directional copy and/or delete triples
    *
    */
  def copyTo(template: Node, target: Node): Unit = js.native
  def copyTo(template: Node, target: Node, flags: js.Array[`two-direction` | delete]): Unit = js.native
  /**
    * N3 allows for declaring blank nodes, this function enables that support
    *
    * @param x The blank node to be declared, supported in N3
    */
  def declareExistential(x: Node): Node = js.native
  /**
    * Simplify graph in store when we realize two identifiers are equivalent
    * We replace the bigger with the smaller.
    * @param u1 The first node
    * @param u2 The second node
    */
  def equate(u1: Node, u2: Node): Boolean = js.native
  /**
    * @param features
    */
  def initPropertyActions(features: js.Array[sameAs | InverseFunctionalProperty | FunctionalProperty]): Boolean = js.native
  /**
    * eturns any quads matching the given arguments.
    * Standard RDFJS Taskforce method for Source objects, implemented as an
    * alias to `statementsMatching()`
    * @param subject The subject
    * @param predicate The predicate
    * @param object The object
    * @param graph The graph that contains the statement
    */
  def `match`(subject: ValueType, predicate: ValueType, `object`: ValueType, graph: ValueType): js.Array[Statement] = js.native
  /**
    * Find out whether a given URI is used as symbol in the formula
    * @param uri The URI to look for
    */
  def mentionsURI(uri: String): Boolean = js.native
  /**
    * Existentials are BNodes - something exists without naming
    * @param uri An URI
    */
  def newExistential(uri: String): Node = js.native
  /**
    * Adds a new property action
    * @param pred the predicate that the function should be triggered on
    * @param action the function that should trigger
    */
  def newPropertyAction(
    pred: Node,
    action: js.Function3[/* store */ this.type, /* subject */ NamedNode_, /* object */ NamedNode_, Boolean]
  ): Boolean = js.native
  /**
    * Creates a new universal node
    * Universals are Variables
    * @param uri An URI
    */
  def newUniversal(uri: String): Node = js.native
  /**
    * Find an unused id for a file being edited: return a symbol
    * (Note: Slow iff a lot of them -- could be O(log(k)) )
    * @param doc A document named node
    */
  def nextSymbol(doc: NamedNode_): NamedNode_ = js.native
  /**
    * Query this store asynchronously, return bindings in callback
    *
    * @param myQuery The query to be run
    * @param callback Function to call when bindings
    * @param dummy OBSOLETE - do not use this
    * @param onDone OBSOLETE - do not use this
    */
  def query(myQuery: Query, callback: js.Function1[/* bindings */ Bindings, Unit]): Unit = js.native
  def query(
    myQuery: Query,
    callback: js.Function1[/* bindings */ Bindings, Unit],
    dummy: Null,
    onDone: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Query this store synchronously and return bindings
    *
    * @param myQuery The query to be run
    */
  def querySync(myQuery: Query): js.Array[Bindings] = js.native
  /**
    * Removes a statement from this formula
    * @param st A statement to remove
    */
  def remove(st: Statement): IndexedFormula = js.native
  /**
    * Removes all statemnts in a doc
    * @param doc The document
    */
  def removeDocument(doc: NamedNode_): IndexedFormula = js.native
  /**
    * Remove all statements matching args (within limit) *
    * @param subj The subject
    * @param pred The predicate
    * @param obj The object
    * @param why The graph that contains the statement
    * @param limit The number of statements to remove
    */
  def removeMany(): Unit = js.native
  def removeMany(subj: Null, pred: Null, obj: Null, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Null, pred: Null, obj: Null, why: Node): Unit = js.native
  def removeMany(subj: Null, pred: Null, obj: Null, why: Node, limit: Double): Unit = js.native
  def removeMany(subj: Null, pred: Null, obj: Node): Unit = js.native
  def removeMany(subj: Null, pred: Null, obj: Node, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Null, pred: Null, obj: Node, why: Node): Unit = js.native
  def removeMany(subj: Null, pred: Null, obj: Node, why: Node, limit: Double): Unit = js.native
  def removeMany(subj: Null, pred: Node): Unit = js.native
  def removeMany(subj: Null, pred: Node, obj: Null, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Null, pred: Node, obj: Null, why: Node): Unit = js.native
  def removeMany(subj: Null, pred: Node, obj: Null, why: Node, limit: Double): Unit = js.native
  def removeMany(subj: Null, pred: Node, obj: Node): Unit = js.native
  def removeMany(subj: Null, pred: Node, obj: Node, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Null, pred: Node, obj: Node, why: Node): Unit = js.native
  def removeMany(subj: Null, pred: Node, obj: Node, why: Node, limit: Double): Unit = js.native
  def removeMany(subj: Node): Unit = js.native
  def removeMany(subj: Node, pred: Null, obj: Null, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Node, pred: Null, obj: Null, why: Node): Unit = js.native
  def removeMany(subj: Node, pred: Null, obj: Null, why: Node, limit: Double): Unit = js.native
  def removeMany(subj: Node, pred: Null, obj: Node): Unit = js.native
  def removeMany(subj: Node, pred: Null, obj: Node, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Node, pred: Null, obj: Node, why: Node): Unit = js.native
  def removeMany(subj: Node, pred: Null, obj: Node, why: Node, limit: Double): Unit = js.native
  def removeMany(subj: Node, pred: Node): Unit = js.native
  def removeMany(subj: Node, pred: Node, obj: Null, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Node, pred: Node, obj: Null, why: Node): Unit = js.native
  def removeMany(subj: Node, pred: Node, obj: Null, why: Node, limit: Double): Unit = js.native
  def removeMany(subj: Node, pred: Node, obj: Node): Unit = js.native
  def removeMany(subj: Node, pred: Node, obj: Node, why: Null, limit: Double): Unit = js.native
  def removeMany(subj: Node, pred: Node, obj: Node, why: Node): Unit = js.native
  def removeMany(subj: Node, pred: Node, obj: Node, why: Node, limit: Double): Unit = js.native
  /**
    * Remove all matching statements
    * @param subject The subject
    * @param predicate The predicate
    * @param object The object
    * @param graph The graph that contains the statement
    */
  def removeMatches(): Unit = js.native
  def removeMatches(subject: Null, predicate: Null, `object`: Null, graph: Node): Unit = js.native
  def removeMatches(subject: Null, predicate: Null, `object`: Node): Unit = js.native
  def removeMatches(subject: Null, predicate: Null, `object`: Node, graph: Node): Unit = js.native
  def removeMatches(subject: Null, predicate: Node): Unit = js.native
  def removeMatches(subject: Null, predicate: Node, `object`: Null, graph: Node): Unit = js.native
  def removeMatches(subject: Null, predicate: Node, `object`: Node): Unit = js.native
  def removeMatches(subject: Null, predicate: Node, `object`: Node, graph: Node): Unit = js.native
  def removeMatches(subject: Node): Unit = js.native
  def removeMatches(subject: Node, predicate: Null, `object`: Null, graph: Node): Unit = js.native
  def removeMatches(subject: Node, predicate: Null, `object`: Node): Unit = js.native
  def removeMatches(subject: Node, predicate: Null, `object`: Node, graph: Node): Unit = js.native
  def removeMatches(subject: Node, predicate: Node): Unit = js.native
  def removeMatches(subject: Node, predicate: Node, `object`: Null, graph: Node): Unit = js.native
  def removeMatches(subject: Node, predicate: Node, `object`: Node): Unit = js.native
  def removeMatches(subject: Node, predicate: Node, `object`: Node, graph: Node): Unit = js.native
  /**
    * Removes a statement
    * @param st The statement to remove
    */
  def removeStatement(st: Statement): Formula = js.native
  /**
    * Removes statements
    * @param sts The statements to remove
    */
  def removeStatements(sts: js.Array[Statement]): Formula = js.native
  /**
    * Compare by canonical URI as smushed
    * @param x A named node
    * @param y Another named node
    */
  def sameThings(x: NamedNode_, y: NamedNode_): Boolean = js.native
  /**
    * A list of all the URIs by which this thing is known
    * @param term
    */
  def uris(term: NamedNode_): js.Array[String] = js.native
}

/* static members */
@JSImport("rdflib", "IndexedFormula")
@js.native
object IndexedFormula extends js.Object {
  /**
    * Gets the URI of the default graph
    */
  def defaultGraphURI(): String = js.native
}

