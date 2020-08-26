package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ManageBuyOfferResult")
@js.native
class ManageBuyOfferResult ()
  extends typings.stellarBase.mod.xdr.ManageBuyOfferResult

/* static members */
@JSImport("stellar-sdk", "xdr.ManageBuyOfferResult")
@js.native
object ManageBuyOfferResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult): Boolean = js.native
  def manageBuyOfferSuccess(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult, io: Buffer): Unit = js.native
}

