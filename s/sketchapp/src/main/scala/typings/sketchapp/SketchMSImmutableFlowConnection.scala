package typings.sketchapp

import typings.sketchapp.sketchappStrings.back
import typings.sketchapp.sketchappStrings.immutableFlowConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImmutableFlowConnection extends js.Object {
  var _class: immutableFlowConnection
  var animationType: Double
  var destinationArtboardID: js.UndefOr[String | back] = js.undefined
}

object SketchMSImmutableFlowConnection {
  @scala.inline
  def apply(
    _class: immutableFlowConnection,
    animationType: Double,
    destinationArtboardID: String | back = null
  ): SketchMSImmutableFlowConnection = {
    val __obj = js.Dynamic.literal(_class = _class, animationType = animationType)
    if (destinationArtboardID != null) __obj.updateDynamic("destinationArtboardID")(destinationArtboardID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImmutableFlowConnection]
  }
}

