package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashBase.stellarDashBaseMod.TransactionBuilderNs.TransactionBuilderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "TransactionBuilder")
@js.native
class TransactionBuilder protected ()
  extends typings.stellarDashBase.stellarDashBaseMod.TransactionBuilder {
  def this(sourceAccount: typings.stellarDashBase.stellarDashBaseMod.Account) = this()
  def this(
    sourceAccount: typings.stellarDashBase.stellarDashBaseMod.Account,
    options: TransactionBuilderOptions
  ) = this()
}

