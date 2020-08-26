package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.ManageSellOfferResult")
@js.native
class ManageSellOfferResult ()
  extends typings.stellarBase.xdrMod.default.ManageSellOfferResult

/* static members */
@JSImport("stellar-base", "xdr.ManageSellOfferResult")
@js.native
object ManageSellOfferResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): Boolean = js.native
  def manageSellOfferSuccess(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult, io: Buffer): Unit = js.native
}

