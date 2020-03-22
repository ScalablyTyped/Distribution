package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCli.mod.DependencyParamsAndroid
import typings.reactNativeCommunityCli.mod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndroid
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyParamsAndroid] = js.undefined
  var ios: js.UndefOr[ProjectParamsIOS] = js.undefined
}

object AnonAndroid {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    android: DependencyParamsAndroid = null,
    ios: ProjectParamsIOS = null
  ): AnonAndroid = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroid]
  }
}

