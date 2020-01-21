package typings.stellarSdk.mod

import typings.stellarBase.mod.TransactionBuilder.TransactionBuilderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "TransactionBuilder")
@js.native
class TransactionBuilder protected ()
  extends typings.stellarBase.mod.TransactionBuilder {
  def this(sourceAccount: typings.stellarBase.mod.Account) = this()
  def this(sourceAccount: typings.stellarBase.mod.Account, options: TransactionBuilderOptions) = this()
}

