package typings
package reactDashPlyrLib.reactDashPlyrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnVolumeChangeParam extends js.Object {
  var muted: scala.Boolean
  var volume: scala.Double
}

object OnVolumeChangeParam {
  @scala.inline
  def apply(muted: scala.Boolean, volume: scala.Double): OnVolumeChangeParam = {
    val __obj = js.Dynamic.literal(muted = muted, volume = volume)
  
    __obj.asInstanceOf[OnVolumeChangeParam]
  }
}

