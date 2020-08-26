package typings.reactToolbox.cardTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTitleTheme extends js.Object {
  /**
    * Class used for the root element.
    */
  var cardTitle: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the card has no avatar.
    */
  var large: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the card has avatar.
    */
  var small: js.UndefOr[String] = js.native
  /**
    * Added to the subtitle element.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Added to the title element.
    */
  var title: js.UndefOr[String] = js.native
}

object CardTitleTheme {
  @scala.inline
  def apply(): CardTitleTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTitleTheme]
  }
  @scala.inline
  implicit class CardTitleThemeOps[Self <: CardTitleTheme] (val x: Self) extends AnyVal {
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
    def setCardTitle(value: String): Self = this.set("cardTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardTitle: Self = this.set("cardTitle", js.undefined)
    @scala.inline
    def setLarge(value: String): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

