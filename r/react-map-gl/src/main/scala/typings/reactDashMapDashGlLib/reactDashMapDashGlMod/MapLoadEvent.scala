package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLoadEvent extends js.Object {
  var target: mapboxDashGlLib.mapboxDashGlMod.Map
  var `type`: java.lang.String
}

object MapLoadEvent {
  @scala.inline
  def apply(target: mapboxDashGlLib.mapboxDashGlMod.Map, `type`: java.lang.String): MapLoadEvent = {
    val __obj = js.Dynamic.literal(target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapLoadEvent]
  }
}

