package typings.reactPlyr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnVolumeChangeParam extends js.Object {
  var muted: Boolean
  var volume: Double
}

object OnVolumeChangeParam {
  @scala.inline
  def apply(muted: Boolean, volume: Double): OnVolumeChangeParam = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnVolumeChangeParam]
  }
}

