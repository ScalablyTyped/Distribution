package typings.atReactDashNativeDashCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyConfigAndroid
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyConfigIOS
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyParamsAndroid
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.PlatformConfig
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectConfigAndroid
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectConfigIOS
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectParamsAndroid
import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidIos extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  var android: js.UndefOr[
    PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ]
  ] = js.undefined
  var ios: js.UndefOr[
    PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]
  ] = js.undefined
}

object Anon_AndroidIos {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[PlatformConfig[_, _, _, _]] = null,
    android: PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ] = null,
    ios: PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS] = null
  ): Anon_AndroidIos = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    __obj.asInstanceOf[Anon_AndroidIos]
  }
}

