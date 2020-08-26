package typings.rdflib.fetcherMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/fetcher", JSImport.Default)
@js.native
class default protected () extends Fetcher {
  def this(store: typings.rdflib.storeMod.default) = this()
  def this(store: typings.rdflib.storeMod.default, options: Options) = this()
}

/* static members */
@JSImport("rdflib/lib/fetcher", JSImport.Default)
@js.native
object default extends js.Object {
  var CONTENT_TYPE_BY_EXT: Record[String, String] = js.native
  var HANDLERS: NumberDictionary[Handler] = js.native
  var crossSiteProxyTemplate: js.Any = js.native
  def crossSiteProxy(uri: String): js.UndefOr[js.Any] = js.native
  def offlineOverride(uri: String): String = js.native
  def proxyIfNecessary(uri: String): js.Any = js.native
  /** Decide on credentials using old XXHR api or new fetch()  one
    * @param requestedURI
    * @param options
    */
  def setCredentials(requestedURI: String): Unit = js.native
  def setCredentials(requestedURI: String, options: Options): Unit = js.native
  /**
    * Tests whether the uri's protocol is supported by the Fetcher.
    * @param uri
    */
  def unsupportedProtocol(uri: String): Boolean = js.native
}

