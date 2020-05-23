package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountSubscriptions extends js.Object {
  def countSubscriptions(token: js.Any): Double
}

object CountSubscriptions {
  @scala.inline
  def apply(countSubscriptions: js.Any => Double): CountSubscriptions = {
    val __obj = js.Dynamic.literal(countSubscriptions = js.Any.fromFunction1(countSubscriptions))
    __obj.asInstanceOf[CountSubscriptions]
  }
}

