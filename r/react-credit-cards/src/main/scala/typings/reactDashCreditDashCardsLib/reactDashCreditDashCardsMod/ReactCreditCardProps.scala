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

