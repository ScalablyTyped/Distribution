package typings.reactNativeCommunityCli.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCli.mod.DependencyParamsAndroid
import typings.reactNativeCommunityCli.mod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Android
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyParamsAndroid] = js.native
  var ios: js.UndefOr[ProjectParamsIOS] = js.native
}

object Android {
  @scala.inline
  def apply(): Android = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Android]
  }
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
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
    def setAndroid(value: DependencyParamsAndroid): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    @scala.inline
    def setIos(value: ProjectParamsIOS): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
  
}

