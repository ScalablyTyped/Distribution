package typings
package atReachAlertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assertive extends js.Object {
  var `type`: js.UndefOr[
    atReachAlertLib.atReachAlertLibStrings.assertive | atReachAlertLib.atReachAlertLibStrings.polite
  ] = js.undefined
}

object Anon_Assertive {
  @scala.inline
  def apply(
    `type`: atReachAlertLib.atReachAlertLibStrings.assertive | atReachAlertLib.atReachAlertLibStrings.polite = null
  ): Anon_Assertive = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Assertive]
  }
}

