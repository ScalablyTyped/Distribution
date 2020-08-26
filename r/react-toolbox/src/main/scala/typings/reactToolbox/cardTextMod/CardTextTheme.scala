package typings.reactToolbox.cardTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTextTheme extends js.Object {
  /**
    * Used for the main root element.
    */
  var cardText: js.UndefOr[String] = js.native
}

object CardTextTheme {
  @scala.inline
  def apply(): CardTextTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTextTheme]
  }
  @scala.inline
  implicit class CardTextThemeOps[Self <: CardTextTheme] (val x: Self) extends AnyVal {
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
    def setCardText(value: String): Self = this.set("cardText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardText: Self = this.set("cardText", js.undefined)
  }
  
}

