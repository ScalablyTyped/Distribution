package typings.reactNativeShare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleOptions extends js.Object {
  
  var excludedActivityTypes: js.UndefOr[String] = js.native
  
  var failOnCancel: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var showAppsToView: js.UndefOr[Boolean] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.Array[String] = js.native
}
object MultipleOptions {
  
  @scala.inline
  def apply(urls: js.Array[String]): MultipleOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOptions]
  }
  
  @scala.inline
  implicit class MultipleOptionsOps[Self <: MultipleOptions] (val x: Self) extends AnyVal {
    
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
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedActivityTypes(value: String): Self = this.set("excludedActivityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedActivityTypes: Self = this.set("excludedActivityTypes", js.undefined)
    
    @scala.inline
    def setFailOnCancel(value: Boolean): Self = this.set("failOnCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnCancel: Self = this.set("failOnCancel", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setShowAppsToView(value: Boolean): Self = this.set("showAppsToView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAppsToView: Self = this.set("showAppsToView", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
