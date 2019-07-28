package typings.rdflib.rdflibMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
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
    * Adds all the statements to this formula
    * @param statements A collection of statements
    */
  def addAll(statements: Iterable[Statement]): Unit = js.native
  /**
    * Return all equivalent URIs by which this is known
    * @param x A named node
    */
  def allAliases(x: NamedNode): js.Array[NamedNode] = js.native
  /**
    * Gets the value of a node that matches the specified pattern
    * @param s The subject
    * @param p The predicate
    * @param o The object
    * @param g The graph that contains the statement
    */
  def anyValue(s: ValueType, p: ValueType, o: ValueType, g: ValueType): String = js.native
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
    * Simplify graph in store when we realize two identifiers are equivalent
    * We replace the bigger with the smaller.
    * @param u1 The first node
    * @param u2 The second node
    */
  def equate(u1: Node, u2: Node): Boolean = js.native
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
  def nextSymbol(doc: NamedNode): NamedNode = js.native
  /**
    * Removes a statement from this formula
    * @param st A statement to remove
    */
  def remove(st: Statement): IndexedFormula = js.native
  /**
    * Removes all statemnts in a doc
    * @param doc The document
    */
  def removeDocument(doc: NamedNode): IndexedFormula = js.native
  /**
    * Remove all statements matching args (within limit) *
    * @param subj The subject
    * @param pred The predicate
    * @param obj The object
    * @param why The graph that contains the statement
    * @param limit The number of statements to remove
    */
  def removeMany(subj: Node, pred: Node, obj: Node, why: Node, limit: Double): Unit = js.native
  /**
    * Remove all matching statements
    * @param subject The subject
    * @param predicate The predicate
    * @param object The object
    * @param graph The graph that contains the statement
    */
  def removeMatches(subject: ValueType, predicate: ValueType, `object`: ValueType, graph: ValueType): Unit = js.native
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
  def sameThings(x: NamedNode, y: NamedNode): Boolean = js.native
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
  /**
    * Gets the statements matching the specified pattern
    * @param subj The subject
    * @param pred The predicate
    * @param obj The object
    * @param why The graph that contains the statement
    * @param justOne Whether to only get one statement
    */
  def statementsMatching(subj: Node, pred: Node, obj: Node, why: Node): js.Array[Statement] = js.native
  def statementsMatching(subj: Node, pred: Node, obj: Node, why: Node, justOne: Boolean): js.Array[Statement] = js.native
  /**
    * A list of all the URIs by which this thing is known
    * @param term
    */
  def uris(term: NamedNode): js.Array[String] = js.native
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

