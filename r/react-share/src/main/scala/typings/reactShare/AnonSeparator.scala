package typings.reactShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeparator extends js.Object {
  /** Separates title from the url, default: ' ' */
  var separator: js.UndefOr[String] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
}

object AnonSeparator {
  @scala.inline
  def apply(separator: String = null, title: String = null): AnonSeparator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeparator]
  }
}

