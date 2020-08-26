package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.Memo")
@js.native
class Memo ()
  extends typings.stellarBase.mod.xdr.Memo

/* static members */
@JSImport("stellar-sdk", "xdr.Memo")
@js.native
object Memo extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Memo = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Memo): Boolean = js.native
  def memoHash(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def memoId(value: typings.stellarBase.xdrMod.xdr.Uint64): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def memoNone(): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def memoReturn(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def memoText(value: String): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def memoText(value: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Memo = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Memo): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Memo, io: Buffer): Unit = js.native
}

