package typings.reactNativeCommunityCli.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platforms extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  var android: js.UndefOr[
    PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ]
  ] = js.native
  var ios: js.UndefOr[
    PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]
  ] = js.native
}

object Platforms {
  @scala.inline
  def apply(): Platforms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Platforms]
  }
  @scala.inline
  implicit class PlatformsOps[Self <: Platforms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroid(
      value: PlatformConfig[
          ProjectParamsAndroid, 
          DependencyParamsAndroid, 
          ProjectConfigAndroid, 
          DependencyConfigAndroid
        ]
    ): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    @scala.inline
    def setIos(value: PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
  
}

