package typings.rdflib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "NamedNode")
@js.native
class NamedNode protected () extends Node {
  def this(iri: String) = this()
  /**
    * Initializes this node
    * @param iri The IRI for this node
    */
  def this(iri: NamedNode) = this()
  /**
    * The URI for this node
    */
  var uri: String = js.native
  /**
    * Returns an RDF node for the containing directory, ending in slash.
    */
  def dir(): NamedNode = js.native
  /**
    * Gets the named node for the document
    */
  def doc(): NamedNode = js.native
  /**
    * Returns an named node for the whole web site, ending in slash.
    * Contrast with the "origin" which does NOT have a trailing slash
    */
  def site(): NamedNode = js.native
}

/* static members */
@JSImport("rdflib", "NamedNode")
@js.native
object NamedNode extends js.Object {
  var termType: String = js.native
  /**
    * Gets a named node from the specified input value
    * @param value An input value
    */
  def fromValue(value: ValueType): NamedNode | ValueType = js.native
}

