package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "TransactionBuilder")
@js.native
class TransactionBuilder protected () extends js.Object {
  def this(sourceAccount: Account) = this()
  def this(sourceAccount: Account, options: stellarDashBaseLib.stellarDashBaseMod.TransactionBuilderNs.TransactionBuilderOptions) = this()
  def addMemo(memo: Memo[MemoType]): this.type = js.native
  def addOperation(operation: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[Operation]): this.type = js.native
  def build(): Transaction[Memo[MemoType], js.Array[Operation]] = js.native
  def setTimeout(timeoutInSeconds: scala.Double): this.type = js.native
}

