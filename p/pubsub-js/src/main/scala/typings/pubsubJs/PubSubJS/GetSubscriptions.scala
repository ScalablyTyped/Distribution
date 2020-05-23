package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubscriptions extends js.Object {
  def getSubscriptions(token: js.Any): js.Array[_]
}

object GetSubscriptions {
  @scala.inline
  def apply(getSubscriptions: js.Any => js.Array[_]): GetSubscriptions = {
    val __obj = js.Dynamic.literal(getSubscriptions = js.Any.fromFunction1(getSubscriptions))
    __obj.asInstanceOf[GetSubscriptions]
  }
}

