package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Key
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.HmacSha256Key")
@js.native
class HmacSha256Key protected ()
  extends typings.stellarBase.xdrMod.default.HmacSha256Key {
  def this(attributes: Key) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.HmacSha256Key")
@js.native
object HmacSha256Key extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.HmacSha256Key): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.HmacSha256Key = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.HmacSha256Key): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.HmacSha256Key, io: Buffer): Unit = js.native
}

