package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProgressEventDataIOS extends js.Object {
  var loaded: Double
  var total: Double
}

object ImageProgressEventDataIOS {
  @scala.inline
  def apply(loaded: Double, total: Double): ImageProgressEventDataIOS = {
    val __obj = js.Dynamic.literal(loaded = loaded, total = total)
  
    __obj.asInstanceOf[ImageProgressEventDataIOS]
  }
}

