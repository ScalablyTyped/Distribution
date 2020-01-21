package typings.reactNativeDocViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var fileNameOptional: js.UndefOr[String] = js.undefined
  var fileType: js.UndefOr[String] = js.undefined
  var url: String
}

object AnonCache {
  @scala.inline
  def apply(
    url: String,
    cache: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    fileNameOptional: String = null,
    fileType: String = null
  ): AnonCache = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (fileNameOptional != null) __obj.updateDynamic("fileNameOptional")(fileNameOptional.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

