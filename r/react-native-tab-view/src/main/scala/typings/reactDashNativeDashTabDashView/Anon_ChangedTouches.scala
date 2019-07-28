package typings.reactDashNativeDashTabDashView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedTouches extends js.Object {
  var changedTouches: js.Array[_]
  var identifier: Double
  var locationX: Double
  var locationY: Double
  var pageX: Double
  var pageY: Double
  var target: Double
  var timestamp: Double
  var touches: js.Array[_]
}

object Anon_ChangedTouches {
  @scala.inline
  def apply(
    changedTouches: js.Array[_],
    identifier: Double,
    locationX: Double,
    locationY: Double,
    pageX: Double,
    pageY: Double,
    target: Double,
    timestamp: Double,
    touches: js.Array[_]
  ): Anon_ChangedTouches = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, identifier = identifier, locationX = locationX, locationY = locationY, pageX = pageX, pageY = pageY, target = target, timestamp = timestamp, touches = touches)
  
    __obj.asInstanceOf[Anon_ChangedTouches]
  }
}

