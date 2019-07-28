package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.mapboxDashGl.mapboxDashGlMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLoadEvent extends js.Object {
  var target: Map
  var `type`: String
}

object MapLoadEvent {
  @scala.inline
  def apply(target: Map, `type`: String): MapLoadEvent = {
    val __obj = js.Dynamic.literal(target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapLoadEvent]
  }
}

