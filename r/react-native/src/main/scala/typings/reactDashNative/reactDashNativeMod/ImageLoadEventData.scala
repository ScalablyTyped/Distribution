package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_HeightUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoadEventData extends ImageLoadEventDataAndroid {
  var source: Anon_HeightUrl
}

object ImageLoadEventData {
  @scala.inline
  def apply(source: Anon_HeightUrl, uri: String = null): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ImageLoadEventData]
  }
}

