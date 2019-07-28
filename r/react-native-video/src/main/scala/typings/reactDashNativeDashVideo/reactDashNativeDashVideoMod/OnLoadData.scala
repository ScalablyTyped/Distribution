package typings.reactDashNativeDashVideo.reactDashNativeDashVideoMod

import typings.reactDashNativeDashVideo.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLoadData extends js.Object {
  var canPlayFastForward: Boolean
  var canPlayReverse: Boolean
  var canPlaySlowForward: Boolean
  var canPlaySlowReverse: Boolean
  var canStepBackward: Boolean
  var canStepForward: Boolean
  var currentTime: Double
  var duration: Double
  var naturalSize: Anon_Height
}

object OnLoadData {
  @scala.inline
  def apply(
    canPlayFastForward: Boolean,
    canPlayReverse: Boolean,
    canPlaySlowForward: Boolean,
    canPlaySlowReverse: Boolean,
    canStepBackward: Boolean,
    canStepForward: Boolean,
    currentTime: Double,
    duration: Double,
    naturalSize: Anon_Height
  ): OnLoadData = {
    val __obj = js.Dynamic.literal(canPlayFastForward = canPlayFastForward, canPlayReverse = canPlayReverse, canPlaySlowForward = canPlaySlowForward, canPlaySlowReverse = canPlaySlowReverse, canStepBackward = canStepBackward, canStepForward = canStepForward, currentTime = currentTime, duration = duration, naturalSize = naturalSize)
  
    __obj.asInstanceOf[OnLoadData]
  }
}

