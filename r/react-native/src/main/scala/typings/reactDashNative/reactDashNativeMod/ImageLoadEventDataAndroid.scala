package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoadEventDataAndroid extends js.Object {
  var uri: js.UndefOr[String] = js.undefined
}

object ImageLoadEventDataAndroid {
  @scala.inline
  def apply(uri: String = null): ImageLoadEventDataAndroid = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ImageLoadEventDataAndroid]
  }
}

