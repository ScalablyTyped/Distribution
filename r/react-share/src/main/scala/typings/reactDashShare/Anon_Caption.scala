package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Caption extends js.Object {
  /** Description of the shared page */
  var caption: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Caption {
  @scala.inline
  def apply(caption: String = null, tags: js.Array[String] = null, title: String = null): Anon_Caption = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Caption]
  }
}

