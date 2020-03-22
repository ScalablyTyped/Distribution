package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCli.mod.DependencyConfigAndroid
import typings.reactNativeCommunityCli.mod.DependencyConfigIOS
import typings.reactNativeCommunityCli.mod.DependencyParamsAndroid
import typings.reactNativeCommunityCli.mod.PlatformConfig
import typings.reactNativeCommunityCli.mod.ProjectConfigAndroid
import typings.reactNativeCommunityCli.mod.ProjectConfigIOS
import typings.reactNativeCommunityCli.mod.ProjectParamsAndroid
import typings.reactNativeCommunityCli.mod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictname extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
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

object AnonDictname {
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
  ): AnonDictname = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictname]
  }
}

