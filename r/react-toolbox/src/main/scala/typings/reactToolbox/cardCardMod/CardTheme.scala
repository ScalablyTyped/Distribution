package typings.reactToolbox.cardCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTheme extends js.Object {
  /**
    * Class used for the root element.
    */
  var card: js.UndefOr[String] = js.native
  /**
    *Added to the root element in case the card is raised.
    */
  var raised: js.UndefOr[String] = js.native
}

object CardTheme {
  @scala.inline
  def apply(): CardTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTheme]
  }
  @scala.inline
  implicit class CardThemeOps[Self <: CardTheme] (val x: Self) extends AnyVal {
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
    def setCard(value: String): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setRaised(value: String): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
  }
  
}

