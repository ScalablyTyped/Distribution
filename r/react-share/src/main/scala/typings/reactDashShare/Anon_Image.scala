package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  /** An absolute link to the image that will be shared */
  var image: js.UndefOr[String] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(image: String = null, title: String = null): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Image]
  }
}

