package typings.schedule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends js.Object {
  var timeout: Double
}

object Timeout {
  @scala.inline
  def apply(timeout: Double): Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
}

