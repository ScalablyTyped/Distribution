package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoadEventData extends ImageLoadEventDataAndroid {
  var source: reactDashNativeLib.Anon_HeightUrl
}

object ImageLoadEventData {
  @scala.inline
  def apply(source: reactDashNativeLib.Anon_HeightUrl, uri: java.lang.String = null): ImageLoadEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ImageLoadEventData]
  }
}

