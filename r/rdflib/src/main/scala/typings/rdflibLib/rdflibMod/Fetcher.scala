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
  var requested: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var store: js.Any = js.native
  var timeout: scala.Double = js.native
  var timeouts: js.Any = js.native
}

@JSImport("rdflib", "Fetcher")
@js.native
object Fetcher extends js.Object {
  var CONTENT_TYPE_BY_EXT: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  var HANDLERS: rdflibLib.Anon_HTMLHandler = js.native
}

