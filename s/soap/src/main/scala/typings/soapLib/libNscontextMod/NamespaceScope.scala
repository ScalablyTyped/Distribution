package typings
package soapLib.libNscontextMod

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
  var namespaces: org.scalablytyped.runtime.StringDictionary[INamespace] = js.native
  var parent: NamespaceScope = js.native
  def getNamespaceMapping(prefix: java.lang.String): INamespace = js.native
  /**
    * Look up the namespace URI by prefix
    * @param {String} prefix Namespace prefix
    * @param {Boolean} [localOnly] Search current scope only
    * @returns {String} Namespace URI
    */
  def getNamespaceURI(prefix: java.lang.String): java.lang.String = js.native
  def getNamespaceURI(prefix: java.lang.String, localOnly: scala.Boolean): java.lang.String = js.native
  /**
    * Look up the namespace prefix by URI
    * @param {String} nsUri Namespace URI
    * @param {Boolean} [localOnly] Search current scope only
    * @returns {String} Namespace prefix
    */
  def getPrefix(nsUri: java.lang.String): java.lang.String = js.native
  def getPrefix(nsUri: java.lang.String, localOnly: scala.Boolean): java.lang.String = js.native
}

