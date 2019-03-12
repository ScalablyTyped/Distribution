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
  def apply[FormFields](subscribe: FormFields => scala.Unit): SubscribeArg[FormFields] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[SubscribeArg[FormFields]]
  }
}

