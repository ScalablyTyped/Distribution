package typings.reactShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  /** Description of the shared page */
  var description: js.UndefOr[String] = js.undefined
  /** An absolute link to the image that will be pinned */
  var media: String
}

object AnonDescription {
  @scala.inline
  def apply(media: String, description: String = null): AnonDescription = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

