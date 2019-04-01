package typings
package primereactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataOriginalEvent extends js.Object {
  var data: js.Any
  var originalEvent: stdLib.Event
  var `type`: java.lang.String
}

object Anon_DataOriginalEvent {
  @scala.inline
  def apply(data: js.Any, originalEvent: stdLib.Event, `type`: java.lang.String): Anon_DataOriginalEvent = {
    val __obj = js.Dynamic.literal(data = data, originalEvent = originalEvent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DataOriginalEvent]
  }
}

