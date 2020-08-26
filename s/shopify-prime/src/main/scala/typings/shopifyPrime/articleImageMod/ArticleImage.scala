package typings.shopifyPrime.articleImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArticleImage extends js.Object {
  /**
    * A base64 image string only used when creating an image. It will be converted to the src property.
    */
  var attachment: js.UndefOr[String] = js.native
  /**
    * The date and time the image was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The image's src URL.
    */
  var src: js.UndefOr[String] = js.native
}

object ArticleImage {
  @scala.inline
  def apply(): ArticleImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArticleImage]
  }
  @scala.inline
  implicit class ArticleImageOps[Self <: ArticleImage] (val x: Self) extends AnyVal {
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
    def setAttachment(value: String): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

