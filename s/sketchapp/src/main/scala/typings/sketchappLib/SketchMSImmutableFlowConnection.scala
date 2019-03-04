package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImmutableFlowConnection extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.immutableFlowConnection
  var animationType: scala.Double
  var destinationArtboardID: js.UndefOr[java.lang.String | sketchappLib.sketchappLibStrings.back] = js.undefined
}

object SketchMSImmutableFlowConnection {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.immutableFlowConnection,
    animationType: scala.Double,
    destinationArtboardID: java.lang.String | sketchappLib.sketchappLibStrings.back = null
  ): SketchMSImmutableFlowConnection = {
    val __obj = js.Dynamic.literal(_class = _class, animationType = animationType)
    if (destinationArtboardID != null) __obj.updateDynamic("destinationArtboardID")(destinationArtboardID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImmutableFlowConnection]
  }
}

