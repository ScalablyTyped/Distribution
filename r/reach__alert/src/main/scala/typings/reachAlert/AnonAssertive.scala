package typings.reachAlert

import typings.reachAlert.reachAlertStrings.assertive
import typings.reachAlert.reachAlertStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssertive extends js.Object {
  var `type`: js.UndefOr[assertive | polite] = js.undefined
}

object AnonAssertive {
  @scala.inline
  def apply(`type`: assertive | polite = null): AnonAssertive = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssertive]
  }
}

