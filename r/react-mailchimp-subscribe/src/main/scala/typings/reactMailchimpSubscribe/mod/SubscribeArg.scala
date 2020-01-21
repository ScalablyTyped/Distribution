package typings.reactMailchimpSubscribe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeArg[FormFields] extends js.Object {
  def subscribe(data: FormFields): Unit
}

object SubscribeArg {
  @scala.inline
  def apply[FormFields](subscribe: FormFields => Unit): SubscribeArg[FormFields] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[SubscribeArg[FormFields]]
  }
}

