package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashSdk.stellarDashSdkMod.FederationServerNs.Options
import typings.stellarDashSdk.stellarDashSdkMod.FederationServerNs.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "FederationServer")
@js.native
class FederationServer protected () extends js.Object {
  def this(serverURL: String, domain: String) = this()
  def this(serverURL: String, domain: String, options: Options) = this()
  def resolveAccountId(account: String): js.Promise[Record] = js.native
  def resolveAddress(address: String): js.Promise[Record] = js.native
  def resolveTransactionId(transactionId: String): js.Promise[Record] = js.native
}

/* static members */
@JSImport("stellar-sdk", "FederationServer")
@js.native
object FederationServer extends js.Object {
  def createForDomain(domain: String): js.Promise[FederationServer] = js.native
  def createForDomain(domain: String, options: Options): js.Promise[FederationServer] = js.native
  def resolve(value: String): js.Promise[Record] = js.native
  def resolve(value: String, options: Options): js.Promise[Record] = js.native
}

