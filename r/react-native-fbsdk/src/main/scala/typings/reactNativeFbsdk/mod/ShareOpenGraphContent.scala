package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareOpenGraphContent extends ShareContent {
  
  /**
    * Open Graph Action to be shared.
    */
  var action: ShareOpenGraphAction = js.native
  
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  
  /**
    * The type of content to be shared is open graph content.
    */
  var contentType: `open-graph` = js.native
  
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /**
    * Property name that points to the primary Open Graph Object in the action.
    */
  var previewPropertyName: String = js.native
}
object ShareOpenGraphContent {
  
  @scala.inline
  def apply(action: ShareOpenGraphAction, contentType: `open-graph`, previewPropertyName: String): ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphContent]
  }
  
  @scala.inline
  implicit class ShareOpenGraphContentOps[Self <: ShareOpenGraphContent] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ShareOpenGraphAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: `open-graph`): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewPropertyName(value: String): Self = this.set("previewPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonParameters(value: ShareContentCommonParameters): Self = this.set("commonParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonParameters: Self = this.set("commonParameters", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
  }
}
