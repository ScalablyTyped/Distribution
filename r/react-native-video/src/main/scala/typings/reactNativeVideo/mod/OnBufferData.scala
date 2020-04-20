package typings.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBufferData extends js.Object {
  var isBuffering: Boolean
}

object OnBufferData {
  @scala.inline
  def apply(isBuffering: Boolean): OnBufferData = {
    val __obj = js.Dynamic.literal(isBuffering = isBuffering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBufferData]
  }
}

