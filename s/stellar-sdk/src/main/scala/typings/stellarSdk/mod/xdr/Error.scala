package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Code
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.Error")
@js.native
class Error protected ()
  extends typings.stellarBase.mod.xdr.Error {
  def this(attributes: Code) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.Error")
@js.native
object Error extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Error = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Error = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Error = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Error = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Error): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Error = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Error): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Error, io: Buffer): Unit = js.native
}

