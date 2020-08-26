package typings.reactToolbox.iconButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconButtonTheme extends js.Object {
  /**
    * Used for the root in case button is accent.
    */
  var accent: js.UndefOr[String] = js.native
  /**
    * Used for the root element in any button.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * For the icon inside a button.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Used when colors are inverted.
    */
  var inverse: js.UndefOr[String] = js.native
  /**
    * Used for neutral colored buttons.
    */
  var neutral: js.UndefOr[String] = js.native
  /**
    * Used for primary buttons when button is primary.
    */
  var primary: js.UndefOr[String] = js.native
  /**
    * Used for the ripple element.
    */
  var rippleWrapper: js.UndefOr[String] = js.native
  /**
    * Used for toggle buttons in the root element.
    */
  var toggle: js.UndefOr[String] = js.native
}

object IconButtonTheme {
  @scala.inline
  def apply(): IconButtonTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconButtonTheme]
  }
  @scala.inline
  implicit class IconButtonThemeOps[Self <: IconButtonTheme] (val x: Self) extends AnyVal {
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
    def setAccent(value: String): Self = this.set("accent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccent: Self = this.set("accent", js.undefined)
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInverse(value: String): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setNeutral(value: String): Self = this.set("neutral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeutral: Self = this.set("neutral", js.undefined)
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRippleWrapper(value: String): Self = this.set("rippleWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleWrapper: Self = this.set("rippleWrapper", js.undefined)
    @scala.inline
    def setToggle(value: String): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

