package typings.sharp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var current: Double
  var max: Double
}

object Max {
  @scala.inline
  def apply(current: Double, max: Double): Max = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

