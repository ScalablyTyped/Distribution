package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "DataFactory")
@js.native
object DataFactoryNs extends js.Object {
  /**
       * Creates a new blank node
       * @param value The blank node's identifier
       */
  def blankNode(value: java.lang.String): rdflibLib.rdflibMod.BlankNode = js.native
  /**
       * Creates a new collection
       * @param elements The initial element
       */
  def collection(elements: js.Array[rdflibLib.rdflibMod.ValueType]): rdflibLib.rdflibMod.Collection = js.native
  /**
       * Gets the default graph
       */
  def defaultGraph(): rdflibLib.rdflibMod.DefaultGraph = js.native
  /**
       * Creates a new fetcher
       * @param store The store to use
       * @param options The options
       */
  def fetcher(store: rdflibLib.rdflibMod.Formula, options: js.Any): rdflibLib.rdflibMod.Fetcher = js.native
  /**
       * Creates a new graph (store)
       */
  def graph(): rdflibLib.rdflibMod.IndexedFormula = js.native
  /**
       * Creates a new literal node
       * @param val The lexical value
       * @param lang The language
       * @param dt The datatype
       */
  def lit(`val`: java.lang.String, lang: java.lang.String, dt: rdflibLib.rdflibMod.NamedNode): rdflibLib.rdflibMod.Literal = js.native
  /**
       * Creates a new literal node
       * @param value The lexical value
       * @param languageOrDatatype Either the language or the datatype
       */
  def literal(value: java.lang.String, languageOrDatatype: java.lang.String): rdflibLib.rdflibMod.Literal = js.native
  /**
       * Creates a new literal node
       * @param value The lexical value
       * @param languageOrDatatype Either the language or the datatype
       */
  def literal(value: java.lang.String, languageOrDatatype: rdflibLib.rdflibMod.NamedNode): rdflibLib.rdflibMod.Literal = js.native
  /**
       * Creates a new named node
       * @param value The new named node
       */
  def namedNode(value: java.lang.String): rdflibLib.rdflibMod.NamedNode = js.native
  /**
       * Creates a new statement
       * @param subject The subject
       * @param predicate The predicate
       * @param object The object
       * @param graph The containing graph
       */
  def quad(
    subject: rdflibLib.rdflibMod.Node,
    predicate: rdflibLib.rdflibMod.Node,
    `object`: rdflibLib.rdflibMod.Node,
    graph: rdflibLib.rdflibMod.Node
  ): rdflibLib.rdflibMod.Statement = js.native
  /**
       * Creates a new statement
       * @param subject The subject
       * @param predicate The predicate
       * @param object The object
       * @param graph The containing graph
       */
  def st(
    subject: rdflibLib.rdflibMod.Node,
    predicate: rdflibLib.rdflibMod.Node,
    `object`: rdflibLib.rdflibMod.Node,
    graph: rdflibLib.rdflibMod.Node
  ): rdflibLib.rdflibMod.Statement = js.native
  /**
       * Creates a new statement
       * @param subject The subject
       * @param predicate The predicate
       * @param object The object
       */
  def triple(
    subject: rdflibLib.rdflibMod.Node,
    predicate: rdflibLib.rdflibMod.Node,
    `object`: rdflibLib.rdflibMod.Node
  ): rdflibLib.rdflibMod.Statement = js.native
  /**
       * Creates a new variable
       * @param name The name for the variable
       */
  def variable(name: java.lang.String): rdflibLib.rdflibMod.Variable = js.native
}

