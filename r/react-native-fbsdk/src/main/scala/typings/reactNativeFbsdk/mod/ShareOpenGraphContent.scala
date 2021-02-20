package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import org.scalablytyped.runtime.StObject
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
  implicit class ShareOpenGraphContentMutableBuilder[Self <: ShareOpenGraphContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ShareOpenGraphAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonParameters(value: ShareContentCommonParameters): Self = StObject.set(x, "commonParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonParametersUndefined: Self = StObject.set(x, "commonParameters", js.undefined)
    
    @scala.inline
    def setContentType(value: `open-graph`): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setPreviewPropertyName(value: String): Self = StObject.set(x, "previewPropertyName", value.asInstanceOf[js.Any])
  }
}
