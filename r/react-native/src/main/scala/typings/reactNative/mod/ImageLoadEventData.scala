package typings.reactNative.mod

import typings.reactNative.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoadEventData extends ImageLoadEventDataAndroid {
  var source: AnonUrl
}

object ImageLoadEventData {
  @scala.inline
  def apply(source: AnonUrl, uri: String = null): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadEventData]
  }
}

