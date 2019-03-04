package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedTouches extends js.Object {
  var changedTouches: js.Array[_]
  var identifier: scala.Double
  var locationX: scala.Double
  var locationY: scala.Double
  var pageX: scala.Double
  var pageY: scala.Double
  var target: scala.Double
  var timestamp: scala.Double
  var touches: js.Array[_]
}

object Anon_ChangedTouches {
  @scala.inline
  def apply(
    changedTouches: js.Array[_],
    identifier: scala.Double,
    locationX: scala.Double,
    locationY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    target: scala.Double,
    timestamp: scala.Double,
    touches: js.Array[_]
  ): Anon_ChangedTouches = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, identifier = identifier, locationX = locationX, locationY = locationY, pageX = pageX, pageY = pageY, target = target, timestamp = timestamp, touches = touches)
  
    __obj.asInstanceOf[Anon_ChangedTouches]
  }
}

