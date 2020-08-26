package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Changes
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.OperationMeta")
@js.native
class OperationMeta protected ()
  extends typings.stellarBase.mod.xdr.OperationMeta {
  def this(attributes: Changes) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.OperationMeta")
@js.native
object OperationMeta extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationMeta): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationMeta): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationMeta, io: Buffer): Unit = js.native
}

