package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Destination
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.CreateAccountOp")
@js.native
class CreateAccountOp protected ()
  extends typings.stellarBase.mod.xdr.CreateAccountOp {
  def this(attributes: Destination) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.CreateAccountOp")
@js.native
object CreateAccountOp extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.CreateAccountOp): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.CreateAccountOp): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.CreateAccountOp, io: Buffer): Unit = js.native
}

