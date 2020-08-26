package typings.reactNative.mod.Appearance

import typings.reactNative.mod.ColorSchemeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppearancePreferences extends js.Object {
  var colorScheme: ColorSchemeName = js.native
}

object AppearancePreferences {
  @scala.inline
  def apply(): AppearancePreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppearancePreferences]
  }
  @scala.inline
  implicit class AppearancePreferencesOps[Self <: AppearancePreferences] (val x: Self) extends AnyVal {
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
    def setColorScheme(value: ColorSchemeName): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    @scala.inline
    def setColorSchemeNull: Self = this.set("colorScheme", null)
  }
  
}

