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
  def apply(clearAllSubscriptions: () => js.Any): ClearAllSubscriptions = {
    val __obj = js.Dynamic.literal(clearAllSubscriptions = js.Any.fromFunction0(clearAllSubscriptions))
  
    __obj.asInstanceOf[ClearAllSubscriptions]
  }
}

