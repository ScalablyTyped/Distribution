package typings
package reactDashNativeDashVideoLib.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLoadData extends js.Object {
  var canPlayFastForward: scala.Boolean
  var canPlayReverse: scala.Boolean
  var canPlaySlowForward: scala.Boolean
  var canPlaySlowReverse: scala.Boolean
  var canStepBackward: scala.Boolean
  var canStepForward: scala.Boolean
  var currentTime: scala.Double
  var duration: scala.Double
  var naturalSize: reactDashNativeDashVideoLib.Anon_Height
}

object OnLoadData {
  @scala.inline
  def apply(
    canPlayFastForward: scala.Boolean,
    canPlayReverse: scala.Boolean,
    canPlaySlowForward: scala.Boolean,
    canPlaySlowReverse: scala.Boolean,
    canStepBackward: scala.Boolean,
    canStepForward: scala.Boolean,
    currentTime: scala.Double,
    duration: scala.Double,
    naturalSize: reactDashNativeDashVideoLib.Anon_Height
  ): OnLoadData = {
    val __obj = js.Dynamic.literal(canPlayFastForward = canPlayFastForward, canPlayReverse = canPlayReverse, canPlaySlowForward = canPlaySlowForward, canPlaySlowReverse = canPlaySlowReverse, canStepBackward = canStepBackward, canStepForward = canStepForward, currentTime = currentTime, duration = duration, naturalSize = naturalSize)
  
    __obj.asInstanceOf[OnLoadData]
  }
}

