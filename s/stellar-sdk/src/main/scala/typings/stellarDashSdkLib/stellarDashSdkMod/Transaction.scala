package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Transaction")
@js.native
class Transaction[TMemo /* <: stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoType] */, TOps /* <: js.Array[stellarDashBaseLib.stellarDashBaseMod.Operation] */] protected ()
  extends stellarDashBaseLib.stellarDashBaseMod.Transaction[TMemo, TOps] {
  def this(envelope: java.lang.String) = this()
  def this(envelope: stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionEnvelope) = this()
}

