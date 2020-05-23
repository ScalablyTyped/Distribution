package typings.storybookNodeLogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: String
  var time: js.Tuple2[Double, Double]
}

object Message {
  @scala.inline
  def apply(message: String, time: js.Tuple2[Double, Double]): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

