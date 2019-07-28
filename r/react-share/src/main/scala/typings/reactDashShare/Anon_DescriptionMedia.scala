package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionMedia extends js.Object {
  /** Description of the shared page */
  var description: js.UndefOr[String] = js.undefined
  var media: String
}

object Anon_DescriptionMedia {
  @scala.inline
  def apply(media: String, description: String = null): Anon_DescriptionMedia = {
    val __obj = js.Dynamic.literal(media = media)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_DescriptionMedia]
  }
}

