package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormsInfo extends js.Object {
  
  var ContentTypeName: String = js.native
  
  var DisplayFormUrl: String = js.native
  
  var EditFormUrl: String = js.native
  
  var NewFormUrl: String = js.native
}
object FormsInfo {
  
  @scala.inline
  def apply(ContentTypeName: String, DisplayFormUrl: String, EditFormUrl: String, NewFormUrl: String): FormsInfo = {
    val __obj = js.Dynamic.literal(ContentTypeName = ContentTypeName.asInstanceOf[js.Any], DisplayFormUrl = DisplayFormUrl.asInstanceOf[js.Any], EditFormUrl = EditFormUrl.asInstanceOf[js.Any], NewFormUrl = NewFormUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsInfo]
  }
  
  @scala.inline
  implicit class FormsInfoOps[Self <: FormsInfo] (val x: Self) extends AnyVal {
    
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
    def setContentTypeName(value: String): Self = this.set("ContentTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFormUrl(value: String): Self = this.set("DisplayFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditFormUrl(value: String): Self = this.set("EditFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewFormUrl(value: String): Self = this.set("NewFormUrl", value.asInstanceOf[js.Any])
  }
}
