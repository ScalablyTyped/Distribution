package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.OfferId
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.LedgerKeyOffer")
@js.native
class LedgerKeyOffer protected ()
  extends typings.stellarBase.mod.xdr.LedgerKeyOffer {
  def this(attributes: OfferId) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.LedgerKeyOffer")
@js.native
object LedgerKeyOffer extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer, io: Buffer): Unit = js.native
}

