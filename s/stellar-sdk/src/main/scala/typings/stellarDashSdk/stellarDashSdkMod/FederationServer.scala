package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer.Options
import typings.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "FederationServer")
@js.native
class FederationServer protected ()
  extends typings.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer {
  def this(serverURL: String, domain: String) = this()
  def this(serverURL: String, domain: String, opts: Options) = this()
}

/* static members */
@JSImport("stellar-sdk", "FederationServer")
@js.native
object FederationServer extends js.Object {
  def createForDomain(domain: String): js.Promise[typings.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer] = js.native
  def createForDomain(domain: String, opts: Options): js.Promise[typings.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer] = js.native
  def resolve(value: String): js.Promise[Record] = js.native
  def resolve(value: String, opts: Options): js.Promise[Record] = js.native
}

