package typings.atReactDashNativeDashCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyParamsAndroid
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidIosKey
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyParamsAndroid] = js.undefined
  var ios: js.UndefOr[ProjectParamsIOS] = js.undefined
}

object Anon_AndroidIosKey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    android: DependencyParamsAndroid = null,
    ios: ProjectParamsIOS = null
  ): Anon_AndroidIosKey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AndroidIosKey]
  }
}

