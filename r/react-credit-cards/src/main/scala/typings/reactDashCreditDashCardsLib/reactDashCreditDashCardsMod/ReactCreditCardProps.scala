package typings
package reactDashCreditDashCardsLib.reactDashCreditDashCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCreditCardProps extends js.Object {
  var acceptedCards: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var callback: js.UndefOr[
    js.Function2[/* type */ CallbackArgument, /* isValid */ scala.Boolean, scala.Unit]
  ] = js.undefined
  var cvc: java.lang.String | scala.Double
  var expiry: java.lang.String | scala.Double
  var focused: js.UndefOr[Focused] = js.undefined
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[reactDashCreditDashCardsLib.Anon_Valid] = js.undefined
  var name: java.lang.String
  var number: java.lang.String | scala.Double
  var placeholders: js.UndefOr[reactDashCreditDashCardsLib.Anon_Name] = js.undefined
  var preview: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactCreditCardProps {
  @scala.inline
  def apply(
    cvc: java.lang.String | scala.Double,
    expiry: java.lang.String | scala.Double,
    name: java.lang.String,
    number: java.lang.String | scala.Double,
    acceptedCards: js.Array[java.lang.String] = null,
    callback: (/* type */ CallbackArgument, /* isValid */ scala.Boolean) => scala.Unit = null,
    focused: Focused = null,
    issuer: java.lang.String = null,
    locale: reactDashCreditDashCardsLib.Anon_Valid = null,
    placeholders: reactDashCreditDashCardsLib.Anon_Name = null,
    preview: js.UndefOr[scala.Boolean] = js.undefined
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

