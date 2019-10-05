package typings.stellarDashSdk.stellarDashSdkMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.AccountCallBuilder")
@js.native
abstract class AccountCallBuilder () extends CallBuilder[AccountRecord] {
  def accountId(id: String): this.type = js.native
}

