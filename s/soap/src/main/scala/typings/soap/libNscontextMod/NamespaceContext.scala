package typings.soap.libNscontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/nscontext", "NamespaceContext")
@js.native
class NamespaceContext () extends js.Object {
  var currentScope: js.UndefOr[NamespaceScope] = js.native
  var prefixCount: Double = js.native
  var scopes: js.Array[NamespaceScope] = js.native
  /**
    * Add a prefix/URI namespace mapping
    * @param {String} prefix Namespace prefix
    * @param {String} nsUri Namespace URI
    * @param {Boolean} [localOnly] Search current scope only
    * @returns {boolean} true if the mapping is added or false if the mapping
    * already exists
    */
  def addNamespace(prefix: String, nsUri: String): Boolean = js.native
  def addNamespace(prefix: String, nsUri: String, localOnly: Boolean): Boolean = js.native
  /**
    * Declare a namespace prefix/uri mapping
    * @param {String} prefix Namespace prefix
    * @param {String} nsUri Namespace URI
    * @returns {Boolean} true if the declaration is created
    */
  def declareNamespace(prefix: String, nsUri: String): Boolean = js.native
  /**
    * Look up the namespace URI by prefix
    * @param {String} prefix Namespace prefix
    * @param {Boolean} [localOnly] Search current scope only
    * @returns {String} Namespace URI
    */
  def getNamespaceURI(prefix: String): String = js.native
  def getNamespaceURI(prefix: String, localOnly: Boolean): String = js.native
  /**
    * Look up the namespace prefix by URI
    * @param {String} nsURI Namespace URI
    * @param {Boolean} [localOnly] Search current scope only
    * @returns {String} Namespace prefix
    */
  def getPrefix(nsUri: String): String = js.native
  def getPrefix(nsUri: String, localOnly: Boolean): String = js.native
  /**
    * Pop a scope out of the context
    * @returns {NamespaceScope} The removed scope
    */
  def popContext(): NamespaceScope = js.native
  /**
    * Push a scope into the context
    * @returns {NamespaceScope} The current scope
    */
  def pushContext(): NamespaceScope = js.native
  /**
    * Register a namespace
    * @param {String} nsUri Namespace URI
    * @returns {String} The matching or generated namespace prefix
    */
  def registerNamespace(nsUri: String): String = js.native
}

