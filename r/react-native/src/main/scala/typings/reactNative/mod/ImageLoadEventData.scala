package typings.reactNative.mod

import typings.reactNative.AnonHeightUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoadEventData extends ImageLoadEventDataAndroid {
  var source: AnonHeightUrl
}

object ImageLoadEventData {
  @scala.inline
  def apply(source: AnonHeightUrl, uri: String = null): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadEventData]
  }
}

