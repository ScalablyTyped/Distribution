package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** Description of the shared page */
  var description: js.UndefOr[String] = js.undefined
  /** An absolute link to the image that will be pinned */
  var media: String
}

object Anon_Description {
  @scala.inline
  def apply(media: String, description: String = null): Anon_Description = {
    val __obj = js.Dynamic.literal(media = media)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_Description]
  }
}

