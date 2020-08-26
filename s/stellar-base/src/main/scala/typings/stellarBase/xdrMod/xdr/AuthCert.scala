package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthCert extends js.Object {
  def expiration(): Uint64 = js.native
  def expiration(value: Uint64): Uint64 = js.native
  def pubkey(): Curve25519Public = js.native
  def pubkey(value: Curve25519Public): Curve25519Public = js.native
  def sig(): Buffer = js.native
  def sig(value: Buffer): Buffer = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

