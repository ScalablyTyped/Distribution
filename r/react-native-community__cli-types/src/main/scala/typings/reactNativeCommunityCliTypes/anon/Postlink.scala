package typings.reactNativeCommunityCliTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Postlink extends js.Object {
  
  var postlink: js.UndefOr[String] = js.native
  
  var postunlink: js.UndefOr[String] = js.native
  
  var prelink: js.UndefOr[String] = js.native
  
  var preunlink: js.UndefOr[String] = js.native
}
object Postlink {
  
  @scala.inline
  def apply(): Postlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Postlink]
  }
  
  @scala.inline
  implicit class PostlinkOps[Self <: Postlink] (val x: Self) extends AnyVal {
    
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
    def setPostlink(value: String): Self = this.set("postlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostlink: Self = this.set("postlink", js.undefined)
    
    @scala.inline
    def setPostunlink(value: String): Self = this.set("postunlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostunlink: Self = this.set("postunlink", js.undefined)
    
    @scala.inline
    def setPrelink(value: String): Self = this.set("prelink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrelink: Self = this.set("prelink", js.undefined)
    
    @scala.inline
    def setPreunlink(value: String): Self = this.set("preunlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreunlink: Self = this.set("preunlink", js.undefined)
  }
}
