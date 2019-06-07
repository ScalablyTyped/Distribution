package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Fetcher")
@js.native
class Fetcher protected () extends js.Object {
  def this(store: js.Any, options: js.Any) = this()
  var appNode: BlankNode = js.native
  var redirectedTo: js.Any = js.native
  var requested: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var store: js.Any = js.native
  var timeout: scala.Double = js.native
  var timeouts: js.Any = js.native
  def load(uri: java.lang.String): js.Promise[stdLib.Response] = js.native
  def load(uri: java.lang.String, options: FetchOptions): js.Promise[stdLib.Response] = js.native
  /**
    * Loads a web resource or resources into the store.
    * @param uri Resource to load, provided either as a NamedNode object or a plain URL. If multiple resources are passed as an array, they will be fetched in parallel.
    */
  def load(uri: js.Array[NamedNode | java.lang.String]): js.Promise[stdLib.Response] = js.native
  def load(uri: js.Array[NamedNode | java.lang.String], options: FetchOptions): js.Promise[stdLib.Response] = js.native
  def load(uri: NamedNode): js.Promise[stdLib.Response] = js.native
  def load(uri: NamedNode, options: FetchOptions): js.Promise[stdLib.Response] = js.native
}

/* static members */
@JSImport("rdflib", "Fetcher")
@js.native
object Fetcher extends js.Object {
  var CONTENT_TYPE_BY_EXT: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var HANDLERS: rdflibLib.Anon_HTMLHandler = js.native
}

