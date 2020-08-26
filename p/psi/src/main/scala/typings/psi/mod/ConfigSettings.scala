package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigSettings extends js.Object {
  var emulatedFormFactor: String = js.native
  var locale: String = js.native
  var onlyCategories: js.Object = js.native
}

object ConfigSettings {
  @scala.inline
  def apply(emulatedFormFactor: String, locale: String, onlyCategories: js.Object): ConfigSettings = {
    val __obj = js.Dynamic.literal(emulatedFormFactor = emulatedFormFactor.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onlyCategories = onlyCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSettings]
  }
  @scala.inline
  implicit class ConfigSettingsOps[Self <: ConfigSettings] (val x: Self) extends AnyVal {
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
    def setEmulatedFormFactor(value: String): Self = this.set("emulatedFormFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyCategories(value: js.Object): Self = this.set("onlyCategories", value.asInstanceOf[js.Any])
  }
  
}

