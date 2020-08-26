package typings.reactToolbox.cardActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardActionsTheme extends js.Object {
  /**
    * Used for a wrapper around actions as the root element.
    */
  var cardActions: js.UndefOr[String] = js.native
}

object CardActionsTheme {
  @scala.inline
  def apply(): CardActionsTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardActionsTheme]
  }
  @scala.inline
  implicit class CardActionsThemeOps[Self <: CardActionsTheme] (val x: Self) extends AnyVal {
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
    def setCardActions(value: String): Self = this.set("cardActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardActions: Self = this.set("cardActions", js.undefined)
  }
  
}

