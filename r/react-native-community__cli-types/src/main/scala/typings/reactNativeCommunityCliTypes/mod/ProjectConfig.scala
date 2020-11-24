package typings.reactNativeCommunityCliTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.iosMod.IOSProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectConfig
  extends /* key */ StringDictionary[js.Any] {
  
  var android: js.UndefOr[AndroidProjectConfig] = js.native
  
  var ios: js.UndefOr[IOSProjectConfig] = js.native
}
object ProjectConfig {
  
  @scala.inline
  def apply(): ProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectConfig]
  }
  
  @scala.inline
  implicit class ProjectConfigOps[Self <: ProjectConfig] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: AndroidProjectConfig): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setIos(value: IOSProjectConfig): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
}
