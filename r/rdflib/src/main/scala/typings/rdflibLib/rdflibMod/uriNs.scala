package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "uri")
@js.native
object uriNs extends js.Object {
  /**
    * Gets the document part of an URI
    * @param uri The URI
    */
  def docpart(uri: java.lang.String): java.lang.String = js.native
  /**
    * Gets the document part of an URI as a named node
    * @param x The URI
    */
  def document(x: java.lang.String): rdflibLib.rdflibMod.NamedNode = js.native
  /**
    * Gets the hostname in an URI
    * @param u The URI
    */
  def hostpart(u: java.lang.String): java.lang.String = js.native
  /**
    * Joins an URI with a base
    * @param given The relative part
    * @param base The base URI
    */
  def join(given: java.lang.String, base: java.lang.String): java.lang.String = js.native
  /**
    * Gets the protocol part of an URI
    * @param uri The URI
    */
  def protocol(uri: java.lang.String): java.lang.String = js.native
  /**
    * Gets a relative uri
    * @param base The base URI
    * @param uri The absolute URI
    */
  def refTo(base: java.lang.String, uri: java.lang.String): java.lang.String = js.native
}

