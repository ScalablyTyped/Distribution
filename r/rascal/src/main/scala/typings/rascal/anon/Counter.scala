package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  var counter: String
  var limit: Double
  var timeout: Double
}

object Counter {
  @scala.inline
  def apply(counter: String, limit: Double, timeout: Double): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

