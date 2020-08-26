package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.OperationResult")
@js.native
class OperationResult ()
  extends typings.stellarBase.mod.xdr.OperationResult

/* static members */
@JSImport("stellar-sdk", "xdr.OperationResult")
@js.native
object OperationResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationResult): Boolean = js.native
  def opInner(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationResult, io: Buffer): Unit = js.native
}

