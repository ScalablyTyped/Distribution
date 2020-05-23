package typings.redisInfo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calls extends js.Object {
  var calls: Double
  var usec: Double
  var usec_per_call: Double
}

object Calls {
  @scala.inline
  def apply(calls: Double, usec: Double, usec_per_call: Double): Calls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], usec = usec.asInstanceOf[js.Any], usec_per_call = usec_per_call.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls]
  }
}

