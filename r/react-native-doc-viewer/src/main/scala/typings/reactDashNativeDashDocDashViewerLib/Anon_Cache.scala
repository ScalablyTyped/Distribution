package typings
package reactDashNativeDashDocDashViewerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var fileNameOptional: js.UndefOr[java.lang.String] = js.undefined
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Anon_Cache {
  @scala.inline
  def apply(
    url: java.lang.String,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    fileName: java.lang.String = null,
    fileNameOptional: java.lang.String = null,
    fileType: java.lang.String = null
  ): Anon_Cache = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (fileNameOptional != null) __obj.updateDynamic("fileNameOptional")(fileNameOptional)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    __obj.asInstanceOf[Anon_Cache]
  }
}

