package typings
package reactDashNativeDashVideoLib.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnProgressData extends js.Object {
  var currentTime: scala.Double
  var playableDuration: scala.Double
  var seekableDuration: scala.Double
}

object OnProgressData {
  @scala.inline
  def apply(currentTime: scala.Double, playableDuration: scala.Double, seekableDuration: scala.Double): OnProgressData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime, playableDuration = playableDuration, seekableDuration = seekableDuration)
  
    __obj.asInstanceOf[OnProgressData]
  }
}

