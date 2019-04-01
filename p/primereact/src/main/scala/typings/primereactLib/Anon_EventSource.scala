package typings
package primereactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventSource extends js.Object {
  var event: stdLib.Event
  var source: js.Any
  var target: js.Any
}

object Anon_EventSource {
  @scala.inline
  def apply(event: stdLib.Event, source: js.Any, target: js.Any): Anon_EventSource = {
    val __obj = js.Dynamic.literal(event = event, source = source, target = target)
  
    __obj.asInstanceOf[Anon_EventSource]
  }
}

