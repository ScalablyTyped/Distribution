package typings.reactDashCreditDashCards.reactDashCreditDashCardsMod

import typings.reactDashCreditDashCards.Anon_Name
import typings.reactDashCreditDashCards.Anon_Valid
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
  var locale: js.UndefOr[Anon_Valid] = js.undefined
  var name: String
  var number: String | Double
  var placeholders: js.UndefOr[Anon_Name] = js.undefined
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
    locale: Anon_Valid = null,
    placeholders: Anon_Name = null,
    preview: js.UndefOr[Boolean] = js.undefined
  ): ReactCreditCardProps = {
    val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name, number = number.asInstanceOf[js.Any])
    if (acceptedCards != null) __obj.updateDynamic("acceptedCards")(acceptedCards)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders)
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview)
    __obj.asInstanceOf[ReactCreditCardProps]
  }
}

