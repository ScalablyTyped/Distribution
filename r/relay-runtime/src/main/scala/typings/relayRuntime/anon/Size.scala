package typings.relayRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var size: Double
  var ttl: Double
}

object Size {
  @scala.inline
  def apply(size: Double, ttl: Double): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

