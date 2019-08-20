package typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platforms extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
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

object Platforms {
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
  ): Platforms = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    __obj.asInstanceOf[Platforms]
  }
}

