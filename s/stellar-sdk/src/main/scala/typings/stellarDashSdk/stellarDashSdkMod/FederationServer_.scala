package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashSdk.stellarDashSdkMod.FederationServer.Options
import typings.stellarDashSdk.stellarDashSdkMod.FederationServer.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "FederationServer")
@js.native
class FederationServer_ protected () extends js.Object {
  def this(serverURL: String, domain: String) = this()
  def this(serverURL: String, domain: String, options: Options) = this()
  def resolveAccountId(account: String): js.Promise[Record] = js.native
  def resolveAddress(address: String): js.Promise[Record] = js.native
  def resolveTransactionId(transactionId: String): js.Promise[Record] = js.native
}

