package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackEventMap extends js.Object {
  var cuechange: Event
  var error: Event
  var load: Event
}

object TextTrackEventMap {
  @scala.inline
  def apply(cuechange: Event, error: Event, load: Event): TextTrackEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cuechange")(cuechange)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("load")(load)
    __obj.asInstanceOf[TextTrackEventMap]
  }
}

