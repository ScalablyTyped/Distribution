package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maximized extends js.Object {
  var maximized: Boolean
  var originalEvent: typings.std.Event
}

object Maximized {
  @scala.inline
  def apply(maximized: Boolean, originalEvent: typings.std.Event): Maximized = {
    val __obj = js.Dynamic.literal(maximized = maximized.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maximized]
  }
}

