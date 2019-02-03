package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "FederationServer")
@js.native
class FederationServer protected () extends js.Object {
  def this(serverURL: java.lang.String, domain: java.lang.String) = this()
  def this(serverURL: java.lang.String, domain: java.lang.String, options: stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Options) = this()
  def resolveAccountId(account: java.lang.String): js.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Record] = js.native
  def resolveAddress(address: java.lang.String): js.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Record] = js.native
  def resolveTransactionId(transactionId: java.lang.String): js.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Record] = js.native
}

/* static members */
@JSImport("stellar-sdk", "FederationServer")
@js.native
object FederationServer extends js.Object {
  def createForDomain(domain: java.lang.String): js.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServer] = js.native
  def createForDomain(domain: java.lang.String, options: stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Options): js.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServer] = js.native
  def resolve(value: java.lang.String): js.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Record] = js.native
  def resolve(value: java.lang.String, options: stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Options): js.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServerNs.Record] = js.native
}

