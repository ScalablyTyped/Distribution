package typings
package reactDashImagesLib.reactDashImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * The alt text for the image.
    */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The image caption.
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The source of the image. Required.
    */
  var src: java.lang.String
  /**
    * array of strings or string
    */
  var srcSet: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    src: java.lang.String,
    alt: java.lang.String = null,
    caption: java.lang.String = null,
    srcSet: java.lang.String | js.Array[java.lang.String] = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

