package typings
package pubsubDashJsLib.PubSubJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearAllSubscriptions extends js.Object {
  def clearAllSubscriptions(): js.Any
}

object ClearAllSubscriptions {
  @scala.inline
  def apply(clearAllSubscriptions: js.Function0[js.Any]): ClearAllSubscriptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearAllSubscriptions")(clearAllSubscriptions)
    __obj.asInstanceOf[ClearAllSubscriptions]
  }
}

