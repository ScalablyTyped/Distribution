package typings.reactNative.mod.Appearance

import typings.reactNative.mod.ColorSchemeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearancePreferences extends js.Object {
  var colorScheme: ColorSchemeName
}

object AppearancePreferences {
  @scala.inline
  def apply(colorScheme: js.UndefOr[Null | ColorSchemeName] = js.undefined): AppearancePreferences = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorScheme)) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearancePreferences]
  }
}

