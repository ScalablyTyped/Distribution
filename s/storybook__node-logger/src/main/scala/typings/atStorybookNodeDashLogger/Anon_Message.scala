package typings.atStorybookNodeDashLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: String
  var time: js.Tuple2[Double, Double]
}

object Anon_Message {
  @scala.inline
  def apply(message: String, time: js.Tuple2[Double, Double]): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Message]
  }
}

