package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartBodyParser extends js.Object {
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var keepExtensions: js.UndefOr[scala.Boolean] = js.undefined
  var mapFiles: js.UndefOr[scala.Boolean] = js.undefined
  var mapParams: js.UndefOr[scala.Boolean] = js.undefined
  var maxFieldsSize: js.UndefOr[scala.Double] = js.undefined
  var multipartFileHandler: js.UndefOr[js.Any] = js.undefined
  var multipartHandler: js.UndefOr[js.Any] = js.undefined
  var multiples: js.UndefOr[scala.Boolean] = js.undefined
  var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
  var uploadDir: js.UndefOr[java.lang.String] = js.undefined
}

object MultipartBodyParser {
  @scala.inline
  def apply(
    hash: java.lang.String = null,
    keepExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    mapFiles: js.UndefOr[scala.Boolean] = js.undefined,
    mapParams: js.UndefOr[scala.Boolean] = js.undefined,
    maxFieldsSize: scala.Int | scala.Double = null,
    multipartFileHandler: js.Any = null,
    multipartHandler: js.Any = null,
    multiples: js.UndefOr[scala.Boolean] = js.undefined,
    overrideParams: js.UndefOr[scala.Boolean] = js.undefined,
    uploadDir: java.lang.String = null
  ): MultipartBodyParser = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (!js.isUndefined(keepExtensions)) __obj.updateDynamic("keepExtensions")(keepExtensions)
    if (!js.isUndefined(mapFiles)) __obj.updateDynamic("mapFiles")(mapFiles)
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams)
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (multipartFileHandler != null) __obj.updateDynamic("multipartFileHandler")(multipartFileHandler)
    if (multipartHandler != null) __obj.updateDynamic("multipartHandler")(multipartHandler)
    if (!js.isUndefined(multiples)) __obj.updateDynamic("multiples")(multiples)
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams)
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir)
    __obj.asInstanceOf[MultipartBodyParser]
  }
}

