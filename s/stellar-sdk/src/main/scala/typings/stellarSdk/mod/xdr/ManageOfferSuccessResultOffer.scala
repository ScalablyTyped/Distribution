package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ManageOfferSuccessResultOffer")
@js.native
class ManageOfferSuccessResultOffer ()
  extends typings.stellarBase.mod.xdr.ManageOfferSuccessResultOffer

/* static members */
@JSImport("stellar-sdk", "xdr.ManageOfferSuccessResultOffer")
@js.native
object ManageOfferSuccessResultOffer extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer): Boolean = js.native
  def manageOfferCreated(value: typings.stellarBase.xdrMod.xdr.OfferEntry): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  def manageOfferUpdated(value: typings.stellarBase.xdrMod.xdr.OfferEntry): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer, io: Buffer): Unit = js.native
}

