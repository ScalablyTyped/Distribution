package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Offer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.ManageOfferSuccessResult")
@js.native
class ManageOfferSuccessResult protected ()
  extends typings.stellarBase.xdrMod.default.ManageOfferSuccessResult {
  def this(attributes: Offer) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.ManageOfferSuccessResult")
@js.native
object ManageOfferSuccessResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult, io: Buffer): Unit = js.native
}

