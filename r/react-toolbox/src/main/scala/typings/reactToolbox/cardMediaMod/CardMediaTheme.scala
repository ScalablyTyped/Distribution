package typings.reactToolbox.cardMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardMediaTheme extends js.Object {
  /**
    * Added to the element root.
    */
  var cardMedia: js.UndefOr[String] = js.native
  /**
    * Used for the content element.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Added to content element if its overlayed.
    */
  var contentOverlay: js.UndefOr[String] = js.native
  /**
    * Added to content element if its squared.
    */
  var square: js.UndefOr[String] = js.native
  /**
    * Added to content element if its wide.
    */
  var wide: js.UndefOr[String] = js.native
}

object CardMediaTheme {
  @scala.inline
  def apply(): CardMediaTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardMediaTheme]
  }
  @scala.inline
  implicit class CardMediaThemeOps[Self <: CardMediaTheme] (val x: Self) extends AnyVal {
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
    def setCardMedia(value: String): Self = this.set("cardMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardMedia: Self = this.set("cardMedia", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentOverlay(value: String): Self = this.set("contentOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentOverlay: Self = this.set("contentOverlay", js.undefined)
    @scala.inline
    def setSquare(value: String): Self = this.set("square", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
    @scala.inline
    def setWide(value: String): Self = this.set("wide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWide: Self = this.set("wide", js.undefined)
  }
  
}

