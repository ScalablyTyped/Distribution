package typings.reactNativeCommunityCameraroll.mod

import typings.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.auto
import typings.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.photo
import typings.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveToCameraRollOptions extends js.Object {
  
  var album: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[photo | video | auto] = js.native
}
object SaveToCameraRollOptions {
  
  @scala.inline
  def apply(): SaveToCameraRollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveToCameraRollOptions]
  }
  
  @scala.inline
  implicit class SaveToCameraRollOptionsOps[Self <: SaveToCameraRollOptions] (val x: Self) extends AnyVal {
    
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
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    
    @scala.inline
    def setType(value: photo | video | auto): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
