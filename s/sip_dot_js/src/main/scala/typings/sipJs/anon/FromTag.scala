package typings.sipJs.anon

import typings.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromTag extends js.Object {
  
  var fromDisplayName: js.UndefOr[String] = js.native
  
  var fromTag: js.UndefOr[String] = js.native
  
  var fromUri: js.UndefOr[URI] = js.native
  
  var toDisplayName: js.UndefOr[String] = js.native
  
  var toUri: js.UndefOr[URI] = js.native
}
object FromTag {
  
  @scala.inline
  def apply(): FromTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromTag]
  }
  
  @scala.inline
  implicit class FromTagOps[Self <: FromTag] (val x: Self) extends AnyVal {
    
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
    def setFromDisplayName(value: String): Self = this.set("fromDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromDisplayName: Self = this.set("fromDisplayName", js.undefined)
    
    @scala.inline
    def setFromTag(value: String): Self = this.set("fromTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromTag: Self = this.set("fromTag", js.undefined)
    
    @scala.inline
    def setFromUri(value: URI): Self = this.set("fromUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromUri: Self = this.set("fromUri", js.undefined)
    
    @scala.inline
    def setToDisplayName(value: String): Self = this.set("toDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDisplayName: Self = this.set("toDisplayName", js.undefined)
    
    @scala.inline
    def setToUri(value: URI): Self = this.set("toUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToUri: Self = this.set("toUri", js.undefined)
  }
}
