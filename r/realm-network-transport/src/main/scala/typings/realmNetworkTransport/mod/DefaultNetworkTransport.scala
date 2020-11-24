package typings.realmNetworkTransport.mod

import typings.realmNetworkTransport.anon.Accept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("realm-network-transport", "DefaultNetworkTransport")
@js.native
class DefaultNetworkTransport () extends NetworkTransport {
  
  var createTimeoutSignal: js.Any = js.native
  
  var fetch: js.Any = js.native
}
/* static members */
@JSImport("realm-network-transport", "DefaultNetworkTransport")
@js.native
object DefaultNetworkTransport extends js.Object {
  
  var AbortController: typings.realmNetworkTransport.mod.AbortController = js.native
  
  var DEFAULT_HEADERS: Accept = js.native
  
  def fetch(input: FetchRequestInfo): js.Promise[FetchResponse] = js.native
  def fetch(input: FetchRequestInfo, init: FetchRequestInit): js.Promise[FetchResponse] = js.native
  @JSName("fetch")
  var fetch_Original: Fetch = js.native
}
