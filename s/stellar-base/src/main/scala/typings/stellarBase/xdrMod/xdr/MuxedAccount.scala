package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuxedAccount extends js.Object {
  def ed25519(): Buffer = js.native
  def ed25519(value: Buffer): Buffer = js.native
  def med25519(): MuxedAccountMed25519 = js.native
  def med25519(value: MuxedAccountMed25519): MuxedAccountMed25519 = js.native
  def switch(): CryptoKeyType = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def value(): Buffer | MuxedAccountMed25519 = js.native
}

