package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementEventMap extends js.Object {
  var fullscreenchange: Event
  var fullscreenerror: Event
}

object ElementEventMap {
  @scala.inline
  def apply(fullscreenchange: Event, fullscreenerror: Event): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
}

