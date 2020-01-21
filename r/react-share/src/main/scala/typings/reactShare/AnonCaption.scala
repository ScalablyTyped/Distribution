package typings.reactShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaption extends js.Object {
  /** Description of the shared page */
  var caption: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
}

object AnonCaption {
  @scala.inline
  def apply(caption: String = null, tags: js.Array[String] = null, title: String = null): AnonCaption = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaption]
  }
}

