package typings.reactNativeCommunityCliTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidIos extends js.Object {
  
  var android: js.UndefOr[Null | js.Object] = js.native
  
  var ios: js.UndefOr[Null | PodspecPath] = js.native
}
object AndroidIos {
  
  @scala.inline
  def apply(): AndroidIos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidIos]
  }
  
  @scala.inline
  implicit class AndroidIosOps[Self <: AndroidIos] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: js.Object): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setAndroidNull: Self = this.set("android", null)
    
    @scala.inline
    def setIos(value: PodspecPath): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    
    @scala.inline
    def setIosNull: Self = this.set("ios", null)
  }
}
