package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "FederationServer")
@js.native
class FederationServer protected () extends js.Object {
  def this(serverURL: java.lang.String, domain: java.lang.String) = this()
  def this(serverURL: java.lang.String, domain: java.lang.String, options: FederationOptions) = this()
  def resolveAccountId(account: java.lang.String): stdLib.Promise[FederationRecord] = js.native
  def resolveAddress(address: java.lang.String): stdLib.Promise[FederationRecord] = js.native
  def resolveTransactionId(transactionId: java.lang.String): stdLib.Promise[FederationRecord] = js.native
}

@JSImport("stellar-sdk", "FederationServer")
@js.native
object FederationServer extends js.Object {
  def createForDomain(domain: java.lang.String): stdLib.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServer] = js.native
  def createForDomain(domain: java.lang.String, options: stellarDashSdkLib.stellarDashSdkMod.FederationOptions): stdLib.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationServer] = js.native
  def resolve(value: java.lang.String): stdLib.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationRecord] = js.native
  def resolve(value: java.lang.String, options: stellarDashSdkLib.stellarDashSdkMod.FederationOptions): stdLib.Promise[stellarDashSdkLib.stellarDashSdkMod.FederationRecord] = js.native
}

