package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProgressEventDataIOS extends js.Object {
  var loaded: scala.Double
  var total: scala.Double
}

object ImageProgressEventDataIOS {
  @scala.inline
  def apply(loaded: scala.Double, total: scala.Double): ImageProgressEventDataIOS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[ImageProgressEventDataIOS]
  }
}

