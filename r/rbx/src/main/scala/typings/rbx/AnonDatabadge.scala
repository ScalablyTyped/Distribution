package typings.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatabadge extends js.Object {
  var `data-badge`: js.UndefOr[String | Double] = js.undefined
}

object AnonDatabadge {
  @scala.inline
  def apply(`data-badge`: String | Double = null): AnonDatabadge = {
    val __obj = js.Dynamic.literal()
    if (`data-badge` != null) __obj.updateDynamic("data-badge")(`data-badge`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatabadge]
  }
}

