package typings.reactCreditCards.mod

import typings.reactCreditCards.AnonName
import typings.reactCreditCards.AnonValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCreditCardProps extends js.Object {
  var acceptedCards: js.UndefOr[js.Array[String]] = js.undefined
  var callback: js.UndefOr[js.Function2[/* type */ CallbackArgument, /* isValid */ Boolean, Unit]] = js.undefined
  var cvc: String | Double
  var expiry: String | Double
  var focused: js.UndefOr[Focused] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[AnonValid] = js.undefined
  var name: String
  var number: String | Double
  var placeholders: js.UndefOr[AnonName] = js.undefined
  var preview: js.UndefOr[Boolean] = js.undefined
}

object ReactCreditCardProps {
  @scala.inline
  def apply(
    cvc: String | Double,
    expiry: String | Double,
    name: String,
    number: String | Double,
    acceptedCards: js.Array[String] = null,
    callback: (/* type */ CallbackArgument, /* isValid */ Boolean) => Unit = null,
    focused: Focused = null,
    issuer: String = null,
    locale: AnonValid = null,
    placeholders: AnonName = null,
    preview: js.UndefOr[Boolean] = js.undefined
  ): ReactCreditCardProps = {
    val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (acceptedCards != null) __obj.updateDynamic("acceptedCards")(acceptedCards.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCreditCardProps]
  }
}

