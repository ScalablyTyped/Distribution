package typings.atReachAlert

import typings.atReachAlert.atReachAlertStrings.assertive
import typings.atReachAlert.atReachAlertStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assertive extends js.Object {
  var `type`: js.UndefOr[assertive | polite] = js.undefined
}

object Anon_Assertive {
  @scala.inline
  def apply(`type`: assertive | polite = null): Anon_Assertive = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Assertive]
  }
}

