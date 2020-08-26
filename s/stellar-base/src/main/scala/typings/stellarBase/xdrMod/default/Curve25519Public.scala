package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Key
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "Curve25519Public")
@js.native
class Curve25519Public protected ()
  extends typings.stellarBase.xdrMod.xdr.Curve25519Public {
  def this(attributes: Key) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "Curve25519Public")
@js.native
object Curve25519Public extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Curve25519Public): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Curve25519Public): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Curve25519Public, io: Buffer): Unit = js.native
}

