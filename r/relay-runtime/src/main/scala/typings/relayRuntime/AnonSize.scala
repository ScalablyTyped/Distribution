package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var size: Double
  var ttl: Double
}

object AnonSize {
  @scala.inline
  def apply(size: Double, ttl: Double): AnonSize = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

