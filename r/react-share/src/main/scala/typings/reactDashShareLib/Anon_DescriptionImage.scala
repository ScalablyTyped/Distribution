package typings
package reactDashShareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionImage extends js.Object {
  /** Description of the shared page */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** An absolute link to the image that will be shared */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DescriptionImage {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    image: java.lang.String = null,
    title: java.lang.String = null
  ): Anon_DescriptionImage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_DescriptionImage]
  }
}

