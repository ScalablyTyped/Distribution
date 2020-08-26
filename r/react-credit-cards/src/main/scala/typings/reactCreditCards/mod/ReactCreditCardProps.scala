package typings.reactCreditCards.mod

import typings.reactCreditCards.anon.Name
import typings.reactCreditCards.anon.Valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCreditCardProps extends js.Object {
  var acceptedCards: js.UndefOr[js.Array[String]] = js.native
  var callback: js.UndefOr[js.Function2[/* type */ CallbackArgument, /* isValid */ Boolean, Unit]] = js.native
  var cvc: String | Double = js.native
  var expiry: String | Double = js.native
  var focused: js.UndefOr[Focused] = js.native
  var issuer: js.UndefOr[String] = js.native
  var locale: js.UndefOr[Valid] = js.native
  var name: String = js.native
  var number: String | Double = js.native
  var placeholders: js.UndefOr[Name] = js.native
  var preview: js.UndefOr[Boolean] = js.native
}

object ReactCreditCardProps {
  @scala.inline
  def apply(cvc: String | Double, expiry: String | Double, name: String, number: String | Double): ReactCreditCardProps = {
    val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCreditCardProps]
  }
  @scala.inline
  implicit class ReactCreditCardPropsOps[Self <: ReactCreditCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCvc(value: String | Double): Self = this.set("cvc", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiry(value: String | Double): Self = this.set("expiry", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String | Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptedCardsVarargs(value: String*): Self = this.set("acceptedCards", js.Array(value :_*))
    @scala.inline
    def setAcceptedCards(value: js.Array[String]): Self = this.set("acceptedCards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptedCards: Self = this.set("acceptedCards", js.undefined)
    @scala.inline
    def setCallback(value: (/* type */ CallbackArgument, /* isValid */ Boolean) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setFocused(value: Focused): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setLocale(value: Valid): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPlaceholders(value: Name): Self = this.set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholders: Self = this.set("placeholders", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
  }
  
}

