package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounter extends js.Object {
  var counter: String
  var limit: Double
  var timeout: Double
}

object AnonCounter {
  @scala.inline
  def apply(counter: String, limit: Double, timeout: Double): AnonCounter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounter]
  }
}

