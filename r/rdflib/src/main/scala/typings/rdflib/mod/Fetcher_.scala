package typings.rdflib.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rdflib.AnonHTMLHandler
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Fetcher")
@js.native
class Fetcher_ protected () extends js.Object {
  def this(store: js.Any, options: js.Any) = this()
  var appNode: BlankNode_ = js.native
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
  def load(uri: js.Array[NamedNode_ | String]): js.Promise[Response] = js.native
  def load(uri: js.Array[NamedNode_ | String], options: FetchOptions): js.Promise[Response] = js.native
  def load(uri: NamedNode_): js.Promise[Response] = js.native
  def load(uri: NamedNode_, options: FetchOptions): js.Promise[Response] = js.native
}

/* static members */
@JSImport("rdflib", "Fetcher")
@js.native
object Fetcher_ extends js.Object {
  var CONTENT_TYPE_BY_EXT: StringDictionary[String] = js.native
  var HANDLERS: AnonHTMLHandler = js.native
}

