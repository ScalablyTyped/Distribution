package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Account")
@js.native
class Account protected ()
  extends typings.stellarDashBase.stellarDashBaseMod.Account {
  def this(accountId: String, sequence: String) = this()
  def this(accountId: String, sequence: Double) = this()
}

