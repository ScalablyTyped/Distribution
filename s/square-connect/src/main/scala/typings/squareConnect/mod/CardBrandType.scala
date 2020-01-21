package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.JCB
  - typings.squareConnect.squareConnectStrings.VISA
  - typings.squareConnect.squareConnectStrings.DISCOVER
  - typings.squareConnect.squareConnectStrings.MASTERCARD
  - typings.squareConnect.squareConnectStrings.OTHER_BRAND
  - typings.squareConnect.squareConnectStrings.CHINA_UNIONPAY
  - typings.squareConnect.squareConnectStrings.DISCOVER_DINERS
  - typings.squareConnect.squareConnectStrings.AMERICAN_EXPRESS
  - typings.squareConnect.squareConnectStrings.SQUARE_GIFT_CARD
*/
trait CardBrandType extends js.Object

object CardBrandType {
  @scala.inline
  def AMERICAN_EXPRESS: typings.squareConnect.squareConnectStrings.AMERICAN_EXPRESS = this.cast("AMERICAN_EXPRESS")
  @scala.inline
  def CHINA_UNIONPAY: typings.squareConnect.squareConnectStrings.CHINA_UNIONPAY = this.cast("CHINA_UNIONPAY")
  @scala.inline
  def DISCOVER: typings.squareConnect.squareConnectStrings.DISCOVER = this.cast("DISCOVER")
  @scala.inline
  def DISCOVER_DINERS: typings.squareConnect.squareConnectStrings.DISCOVER_DINERS = this.cast("DISCOVER_DINERS")
  @scala.inline
  def JCB: typings.squareConnect.squareConnectStrings.JCB = this.cast("JCB")
  @scala.inline
  def MASTERCARD: typings.squareConnect.squareConnectStrings.MASTERCARD = this.cast("MASTERCARD")
  @scala.inline
  def OTHER_BRAND: typings.squareConnect.squareConnectStrings.OTHER_BRAND = this.cast("OTHER_BRAND")
  @scala.inline
  def SQUARE_GIFT_CARD: typings.squareConnect.squareConnectStrings.SQUARE_GIFT_CARD = this.cast("SQUARE_GIFT_CARD")
  @scala.inline
  def VISA: typings.squareConnect.squareConnectStrings.VISA = this.cast("VISA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

