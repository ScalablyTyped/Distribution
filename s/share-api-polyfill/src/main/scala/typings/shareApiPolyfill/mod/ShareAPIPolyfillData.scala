package typings.shareApiPolyfill.mod

import typings.std.ShareData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareAPIPolyfillData extends ShareData {
  
  var fbId: js.UndefOr[String] = js.native
  
  var hashtags: js.UndefOr[String] = js.native
}
object ShareAPIPolyfillData {
  
  @scala.inline
  def apply(): ShareAPIPolyfillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareAPIPolyfillData]
  }
  
  @scala.inline
  implicit class ShareAPIPolyfillDataOps[Self <: ShareAPIPolyfillData] (val x: Self) extends AnyVal {
    
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
    def setFbId(value: String): Self = this.set("fbId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFbId: Self = this.set("fbId", js.undefined)
    
    @scala.inline
    def setHashtags(value: String): Self = this.set("hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtags: Self = this.set("hashtags", js.undefined)
  }
}
