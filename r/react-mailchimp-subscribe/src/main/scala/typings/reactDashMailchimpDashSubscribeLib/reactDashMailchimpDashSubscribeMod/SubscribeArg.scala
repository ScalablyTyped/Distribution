package typings
package reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeArg[FormFields] extends js.Object {
  def subscribe(data: FormFields): scala.Unit
}

object SubscribeArg {
  @scala.inline
  def apply[FormFields](subscribe: js.Function1[FormFields, scala.Unit]): SubscribeArg[FormFields] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[SubscribeArg[FormFields]]
  }
}

