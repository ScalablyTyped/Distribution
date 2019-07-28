package typings.soap.libNscontextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scope for XML namespaces
  * @param {NamespaceScope} [parent] Parent scope
  * @returns {NamespaceScope}
  * @constructor
  */
@js.native
trait NamespaceScope extends js.Object {
  var namespaces: StringDictionary[INamespace] = js.native
  var parent: NamespaceScope = js.native
  def getNamespaceMapping(prefix: String): INamespace = js.native
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
    * @param {String} nsUri Namespace URI
    * @param {Boolean} [localOnly] Search current scope only
    * @returns {String} Namespace prefix
    */
  def getPrefix(nsUri: String): String = js.native
  def getPrefix(nsUri: String, localOnly: Boolean): String = js.native
}

