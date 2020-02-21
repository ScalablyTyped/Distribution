package typings.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "uri")
@js.native
object uri extends js.Object {
  /**
    * Gets the document part of an URI
    * @param uri The URI
    */
  def docpart(uri: String): String = js.native
  /**
    * Gets the document part of an URI as a named node
    * @param x The URI
    */
  def document(x: String): NamedNode_ = js.native
  /**
    * Gets the hostname in an URI
    * @param u The URI
    */
  def hostpart(u: String): String = js.native
  /**
    * Joins an URI with a base
    * @param given The relative part
    * @param base The base URI
    */
  def join(given: String, base: String): String = js.native
  /**
    * Gets the protocol part of an URI
    * @param uri The URI
    */
  def protocol(uri: String): String = js.native
  /**
    * Gets a relative uri
    * @param base The base URI
    * @param uri The absolute URI
    */
  def refTo(base: String, uri: String): String = js.native
}

