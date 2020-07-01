package typings.reactNativeSharedGroupPreferences.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedGroupPreferenceOptions extends js.Object {
  var useAndroidSharedPreferences: js.UndefOr[Boolean] = js.undefined
}

object SharedGroupPreferenceOptions {
  @scala.inline
  def apply(useAndroidSharedPreferences: js.UndefOr[Boolean] = js.undefined): SharedGroupPreferenceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useAndroidSharedPreferences)) __obj.updateDynamic("useAndroidSharedPreferences")(useAndroidSharedPreferences.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedGroupPreferenceOptions]
  }
}

