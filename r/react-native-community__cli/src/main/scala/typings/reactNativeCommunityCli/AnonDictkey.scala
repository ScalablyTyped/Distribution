package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCli.mod.DependencyConfigAndroid
import typings.reactNativeCommunityCli.mod.DependencyConfigIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyConfigAndroid | Null] = js.undefined
  var ios: js.UndefOr[DependencyConfigIOS | Null] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    android: DependencyConfigAndroid = null,
    ios: DependencyConfigIOS = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

