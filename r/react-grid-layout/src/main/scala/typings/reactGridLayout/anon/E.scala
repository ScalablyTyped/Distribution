package typings.reactGridLayout.anon

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait E extends js.Object {
  var e: Event
  var x: Double
  var y: Double
}

object E {
  @scala.inline
  def apply(e: Event, x: Double, y: Double): E = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
}

