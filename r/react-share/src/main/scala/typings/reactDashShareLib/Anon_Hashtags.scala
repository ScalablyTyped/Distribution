package typings
package reactDashShareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hashtags extends js.Object {
  var hashtags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[java.lang.String] = js.undefined
  var via: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Hashtags {
  @scala.inline
  def apply(
    hashtags: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    via: java.lang.String = null
  ): Anon_Hashtags = {
    val __obj = js.Dynamic.literal()
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags)
    if (title != null) __obj.updateDynamic("title")(title)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[Anon_Hashtags]
  }
}

