package typings.reactMdTheme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Background extends js.Object {
  var background: String = js.native
  var `dark-background`: String = js.native
  var `dark-surface`: String = js.native
  var error: String = js.native
  var `light-background`: String = js.native
  var `light-surface`: String = js.native
  var `on-error`: String = js.native
  var `on-primary`: String = js.native
  var `on-secondary`: String = js.native
  var `on-success`: String = js.native
  var `on-surface`: String = js.native
  var `on-warning`: String = js.native
  var primary: String = js.native
  var secondary: String = js.native
  var success: String = js.native
  var surface: String = js.native
  var `text-disabled-on-background`: String = js.native
  var `text-disabled-on-dark`: String = js.native
  var `text-disabled-on-light`: String = js.native
  var `text-hint-on-background`: String = js.native
  var `text-hint-on-dark`: String = js.native
  var `text-hint-on-light`: String = js.native
  var `text-icon-on-background`: String = js.native
  var `text-icon-on-dark`: String = js.native
  var `text-icon-on-light`: String = js.native
  var `text-primary-on-background`: String = js.native
  var `text-primary-on-dark`: String = js.native
  var `text-primary-on-light`: String = js.native
  var `text-secondary-on-background`: String = js.native
  var `text-secondary-on-dark`: String = js.native
  var `text-secondary-on-light`: String = js.native
  var warning: String = js.native
}

object Background {
  @scala.inline
  def apply(
    background: String,
    `dark-background`: String,
    `dark-surface`: String,
    error: String,
    `light-background`: String,
    `light-surface`: String,
    `on-error`: String,
    `on-primary`: String,
    `on-secondary`: String,
    `on-success`: String,
    `on-surface`: String,
    `on-warning`: String,
    primary: String,
    secondary: String,
    success: String,
    surface: String,
    `text-disabled-on-background`: String,
    `text-disabled-on-dark`: String,
    `text-disabled-on-light`: String,
    `text-hint-on-background`: String,
    `text-hint-on-dark`: String,
    `text-hint-on-light`: String,
    `text-icon-on-background`: String,
    `text-icon-on-dark`: String,
    `text-icon-on-light`: String,
    `text-primary-on-background`: String,
    `text-primary-on-dark`: String,
    `text-primary-on-light`: String,
    `text-secondary-on-background`: String,
    `text-secondary-on-dark`: String,
    `text-secondary-on-light`: String,
    warning: String
  ): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.updateDynamic("dark-background")(`dark-background`.asInstanceOf[js.Any])
    __obj.updateDynamic("dark-surface")(`dark-surface`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-background")(`light-background`.asInstanceOf[js.Any])
    __obj.updateDynamic("light-surface")(`light-surface`.asInstanceOf[js.Any])
    __obj.updateDynamic("on-error")(`on-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("on-primary")(`on-primary`.asInstanceOf[js.Any])
    __obj.updateDynamic("on-secondary")(`on-secondary`.asInstanceOf[js.Any])
    __obj.updateDynamic("on-success")(`on-success`.asInstanceOf[js.Any])
    __obj.updateDynamic("on-surface")(`on-surface`.asInstanceOf[js.Any])
    __obj.updateDynamic("on-warning")(`on-warning`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-disabled-on-background")(`text-disabled-on-background`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-disabled-on-dark")(`text-disabled-on-dark`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-disabled-on-light")(`text-disabled-on-light`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-hint-on-background")(`text-hint-on-background`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-hint-on-dark")(`text-hint-on-dark`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-hint-on-light")(`text-hint-on-light`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-icon-on-background")(`text-icon-on-background`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-icon-on-dark")(`text-icon-on-dark`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-icon-on-light")(`text-icon-on-light`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-primary-on-background")(`text-primary-on-background`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-primary-on-dark")(`text-primary-on-dark`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-primary-on-light")(`text-primary-on-light`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-secondary-on-background")(`text-secondary-on-background`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-secondary-on-dark")(`text-secondary-on-dark`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-secondary-on-light")(`text-secondary-on-light`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDark-background`(value: String): Self = this.set("dark-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDark-surface`(value: String): Self = this.set("dark-surface", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLight-background`(value: String): Self = this.set("light-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLight-surface`(value: String): Self = this.set("light-surface", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOn-error`(value: String): Self = this.set("on-error", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOn-primary`(value: String): Self = this.set("on-primary", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOn-secondary`(value: String): Self = this.set("on-secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOn-success`(value: String): Self = this.set("on-success", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOn-surface`(value: String): Self = this.set("on-surface", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOn-warning`(value: String): Self = this.set("on-warning", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurface(value: String): Self = this.set("surface", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-disabled-on-background`(value: String): Self = this.set("text-disabled-on-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-disabled-on-dark`(value: String): Self = this.set("text-disabled-on-dark", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-disabled-on-light`(value: String): Self = this.set("text-disabled-on-light", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-hint-on-background`(value: String): Self = this.set("text-hint-on-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-hint-on-dark`(value: String): Self = this.set("text-hint-on-dark", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-hint-on-light`(value: String): Self = this.set("text-hint-on-light", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-icon-on-background`(value: String): Self = this.set("text-icon-on-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-icon-on-dark`(value: String): Self = this.set("text-icon-on-dark", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-icon-on-light`(value: String): Self = this.set("text-icon-on-light", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-primary-on-background`(value: String): Self = this.set("text-primary-on-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-primary-on-dark`(value: String): Self = this.set("text-primary-on-dark", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-primary-on-light`(value: String): Self = this.set("text-primary-on-light", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-secondary-on-background`(value: String): Self = this.set("text-secondary-on-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-secondary-on-dark`(value: String): Self = this.set("text-secondary-on-dark", value.asInstanceOf[js.Any])
    @scala.inline
    def `setText-secondary-on-light`(value: String): Self = this.set("text-secondary-on-light", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

