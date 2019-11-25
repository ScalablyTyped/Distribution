package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventSource extends js.Object {
  var event: Event
  var source: js.Any
  var target: js.Any
}

object Anon_EventSource {
  @scala.inline
  def apply(event: Event, source: js.Any, target: js.Any): Anon_EventSource = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventSource]
  }
}

