package typings.reactDashNativeDashVideo.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnProgressData extends js.Object {
  var currentTime: Double
  var playableDuration: Double
  var seekableDuration: Double
}

object OnProgressData {
  @scala.inline
  def apply(currentTime: Double, playableDuration: Double, seekableDuration: Double): OnProgressData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], playableDuration = playableDuration.asInstanceOf[js.Any], seekableDuration = seekableDuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnProgressData]
  }
}

