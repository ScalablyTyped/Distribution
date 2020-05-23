package typings.reactNativeCommunityCli.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCli.mod.DependencyConfigAndroid
import typings.reactNativeCommunityCli.mod.DependencyConfigIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyConfigAndroid | Null] = js.undefined
  var ios: js.UndefOr[DependencyConfigIOS | Null] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    android: js.UndefOr[Null | DependencyConfigAndroid] = js.undefined,
    ios: js.UndefOr[Null | DependencyConfigIOS] = js.undefined
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(android)) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (!js.isUndefined(ios)) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

