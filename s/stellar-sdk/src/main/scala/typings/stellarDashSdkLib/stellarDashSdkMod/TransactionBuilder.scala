package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "TransactionBuilder")
@js.native
class TransactionBuilder protected () extends js.Object {
  def this(sourceAccount: Account) = this()
  def this(sourceAccount: Account, options: stellarDashSdkLib.stellarDashSdkMod.TransactionBuilderNs.TransactionBuilderOptions) = this()
  def addMemo(memo: Memo): this.type = js.native
  def addOperation(
    operation: stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.OperationNs.Operation]
  ): this.type = js.native
  def build(): Transaction = js.native
}

