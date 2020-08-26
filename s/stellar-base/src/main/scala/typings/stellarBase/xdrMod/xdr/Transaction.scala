package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def ext(): TransactionExt = js.native
  def ext(value: TransactionExt): TransactionExt = js.native
  def fee(): Double = js.native
  def fee(value: Double): Double = js.native
  def memo(): Memo = js.native
  def memo(value: Memo): Memo = js.native
  def operations(): js.Array[Operation[typings.stellarBase.mod.Operation]] = js.native
  def operations(value: js.Array[Operation[typings.stellarBase.mod.Operation]]): js.Array[Operation[typings.stellarBase.mod.Operation]] = js.native
  def seqNum(): SequenceNumber = js.native
  def seqNum(value: SequenceNumber): SequenceNumber = js.native
  def sourceAccount(): MuxedAccount = js.native
  def sourceAccount(value: MuxedAccount): MuxedAccount = js.native
  def timeBounds(): Null | TimeBounds = js.native
  def timeBounds(value: TimeBounds): Null | TimeBounds = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

