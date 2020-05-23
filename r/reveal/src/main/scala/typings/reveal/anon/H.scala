package typings.reveal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H extends js.Object {
  var h: Double
  var v: Double
}

object H {
  @scala.inline
  def apply(h: Double, v: Double): H = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
}

