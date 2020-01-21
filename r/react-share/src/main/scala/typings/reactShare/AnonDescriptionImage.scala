package typings.reactShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionImage extends js.Object {
  /** Description of the shared page */
  var description: js.UndefOr[String] = js.undefined
  /** An absolute link to the image that will be shared */
  var image: js.UndefOr[String] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
}

object AnonDescriptionImage {
  @scala.inline
  def apply(description: String = null, image: String = null, title: String = null): AnonDescriptionImage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionImage]
  }
}

