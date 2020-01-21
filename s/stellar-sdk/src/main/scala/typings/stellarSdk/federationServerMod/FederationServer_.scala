package typings.stellarSdk.federationServerMod

import typings.stellarSdk.federationServerMod.FederationServer.Options
import typings.stellarSdk.federationServerMod.FederationServer.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/federation_server", "FederationServer")
@js.native
class FederationServer_ protected () extends js.Object {
  def this(serverURL: String, domain: String) = this()
  def this(serverURL: String, domain: String, opts: Options) = this()
  var _sendRequest: js.Any = js.native
  val domain: js.Any = js.native
  val serverURL: js.Any = js.native
  val timeout: js.Any = js.native
  def resolveAccountId(accountId: String): js.Promise[Record] = js.native
  def resolveAddress(address: String): js.Promise[Record] = js.native
  def resolveTransactionId(transactionId: String): js.Promise[Record] = js.native
}

