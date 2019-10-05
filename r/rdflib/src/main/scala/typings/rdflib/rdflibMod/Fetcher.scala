package typings.rdflib.rdflibMod

import org.scalablytyped.runtime.StringDictionary
import typings.rdflib.Anon_HTMLHandler
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Fetcher")
@js.native
class Fetcher protected () extends js.Object {
  def this(store: js.Any, options: js.Any) = this()
  var appNode: BlankNode = js.native
  var redirectedTo: js.Any = js.native
  var requested: StringDictionary[js.Any] = js.native
  var store: js.Any = js.native
  var timeout: Double = js.native
  var timeouts: js.Any = js.native
  def load(uri: String): js.Promise[Response] = js.native
  def load(uri: String, options: FetchOptions): js.Promise[Response] = js.native
  /**
    * Loads a web resource or resources into the store.
    * @param uri Resource to load, provided either as a NamedNode object or a plain URL. If multiple resources are passed as an array, they will be fetched in parallel.
    */
  def load(uri: js.Array[NamedNode | String]): js.Promise[Response] = js.native
  def load(uri: js.Array[NamedNode | String], options: FetchOptions): js.Promise[Response] = js.native
  def load(uri: NamedNode): js.Promise[Response] = js.native
  def load(uri: NamedNode, options: FetchOptions): js.Promise[Response] = js.native
}

/* static members */
@JSImport("rdflib", "Fetcher")
@js.native
object Fetcher extends js.Object {
  var CONTENT_TYPE_BY_EXT: StringDictionary[String] = js.native
  var HANDLERS: Anon_HTMLHandler = js.native
}

@JSImport("rdflib", "fetcher")
@js.native
object fetcher extends js.Object {
  def apply(store: Formula, options: js.Any): Fetcher = js.native
}

