package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Option extends js.Object {
  var option: js.Object
  var originalEvent: Event
}

object Anon_Option {
  @scala.inline
  def apply(option: js.Object, originalEvent: Event): Anon_Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Option]
  }
}

