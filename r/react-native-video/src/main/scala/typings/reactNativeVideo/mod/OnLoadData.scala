package typings.reactNativeVideo.mod

import typings.reactNativeVideo.AnonHeight
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
  var naturalSize: AnonHeight
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
    naturalSize: AnonHeight
  ): OnLoadData = {
    val __obj = js.Dynamic.literal(canPlayFastForward = canPlayFastForward.asInstanceOf[js.Any], canPlayReverse = canPlayReverse.asInstanceOf[js.Any], canPlaySlowForward = canPlaySlowForward.asInstanceOf[js.Any], canPlaySlowReverse = canPlaySlowReverse.asInstanceOf[js.Any], canStepBackward = canStepBackward.asInstanceOf[js.Any], canStepForward = canStepForward.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], naturalSize = naturalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLoadData]
  }
}

