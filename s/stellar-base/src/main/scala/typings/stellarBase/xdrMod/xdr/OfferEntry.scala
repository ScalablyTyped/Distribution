package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferEntry extends js.Object {
  def amount(): Int64 = js.native
  def amount(value: Int64): Int64 = js.native
  def buying(): Asset = js.native
  def buying(value: Asset): Asset = js.native
  def ext(): OfferEntryExt = js.native
  def ext(value: OfferEntryExt): OfferEntryExt = js.native
  def flags(): Double = js.native
  def flags(value: Double): Double = js.native
  def offerId(): Int64 = js.native
  def offerId(value: Int64): Int64 = js.native
  def price(): Price = js.native
  def price(value: Price): Price = js.native
  def sellerId(): AccountId = js.native
  def sellerId(value: AccountId): AccountId = js.native
  def selling(): Asset = js.native
  def selling(value: Asset): Asset = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

