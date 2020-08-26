package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePhotoContent extends ShareContent {
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  /**
    * The type of content to be shared is photo.
    */
  var contentType: photo = js.native
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * Photos to be shared.
    */
  var photos: js.Array[SharePhoto] = js.native
}

object SharePhotoContent {
  @scala.inline
  def apply(contentType: photo, photos: js.Array[SharePhoto]): SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePhotoContent]
  }
  @scala.inline
  implicit class SharePhotoContentOps[Self <: SharePhotoContent] (val x: Self) extends AnyVal {
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
    def setContentType(value: photo): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotosVarargs(value: SharePhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[SharePhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
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

