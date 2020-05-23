package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighWaterMark extends js.Object {
  var highWaterMark: Double
}

object HighWaterMark {
  @scala.inline
  def apply(highWaterMark: Double): HighWaterMark = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighWaterMark]
  }
}

