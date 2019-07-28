package typings.shopifyDashPrime.distModelsArticleUnderscoreImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArticleImage extends js.Object {
  /**
    * A base64 image string only used when creating an image. It will be converted to the src property.
    */
  var attachment: js.UndefOr[String] = js.undefined
  /**
    * The date and time the image was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The image's src URL.
    */
  var src: js.UndefOr[String] = js.undefined
}

object ArticleImage {
  @scala.inline
  def apply(attachment: String = null, created_at: String = null, src: String = null): ArticleImage = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[ArticleImage]
  }
}

