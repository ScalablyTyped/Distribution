package typings.reactDashImages.reactDashImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * The alt text for the image.
    */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * The image caption.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * The source of the image. Required.
    */
  var src: String
  /**
    * array of strings or string
    */
  var srcSet: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Image {
  @scala.inline
  def apply(src: String, alt: String = null, caption: String = null, srcSet: String | js.Array[String] = null): Image = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

