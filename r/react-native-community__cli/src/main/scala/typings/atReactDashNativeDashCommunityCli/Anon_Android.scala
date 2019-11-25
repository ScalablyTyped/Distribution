package typings.atReactDashNativeDashCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyConfigAndroid
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyConfigIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyConfigAndroid | Null] = js.undefined
  var ios: js.UndefOr[DependencyConfigIOS | Null] = js.undefined
}

object Anon_Android {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    android: DependencyConfigAndroid = null,
    ios: DependencyConfigIOS = null
  ): Anon_Android = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Android]
  }
}

