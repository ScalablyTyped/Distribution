package typings.storybookNodeLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: String
  var time: js.Tuple2[Double, Double]
}

object AnonMessage {
  @scala.inline
  def apply(message: String, time: js.Tuple2[Double, Double]): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessage]
  }
}

