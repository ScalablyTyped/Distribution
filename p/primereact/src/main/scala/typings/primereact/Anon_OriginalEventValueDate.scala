package typings.primereact

import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalEventValueDate extends js.Object {
  var originalEvent: Event
  var value: Date
}

object Anon_OriginalEventValueDate {
  @scala.inline
  def apply(originalEvent: Event, value: Date): Anon_OriginalEventValueDate = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, value = value)
  
    __obj.asInstanceOf[Anon_OriginalEventValueDate]
  }
}

