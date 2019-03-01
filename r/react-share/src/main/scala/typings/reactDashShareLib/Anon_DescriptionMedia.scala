package typings
package reactDashShareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionMedia extends js.Object {
  /** Description of the shared page */
  var description: js.UndefOr[java.lang.String] = js.undefined
  var media: java.lang.String
}

object Anon_DescriptionMedia {
  @scala.inline
  def apply(media: java.lang.String, description: java.lang.String = null): Anon_DescriptionMedia = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("media")(media)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_DescriptionMedia]
  }
}

