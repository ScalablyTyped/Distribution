package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hashtags extends js.Object {
  var hashtags: js.UndefOr[js.Array[String]] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
  var via: js.UndefOr[String] = js.undefined
}

object Anon_Hashtags {
  @scala.inline
  def apply(hashtags: js.Array[String] = null, title: String = null, via: String = null): Anon_Hashtags = {
    val __obj = js.Dynamic.literal()
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hashtags]
  }
}

