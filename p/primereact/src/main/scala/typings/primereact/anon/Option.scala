package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var option: js.Object
  var originalEvent: typings.std.Event
}

object Option {
  @scala.inline
  def apply(option: js.Object, originalEvent: typings.std.Event): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

