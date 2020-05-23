package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartBodyParser_ extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var keepExtensions: js.UndefOr[Boolean] = js.undefined
  var mapFiles: js.UndefOr[Boolean] = js.undefined
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var maxFieldsSize: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var multipartFileHandler: js.UndefOr[js.Any] = js.undefined
  var multipartHandler: js.UndefOr[js.Any] = js.undefined
  var multiples: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  var uploadDir: js.UndefOr[String] = js.undefined
}

object MultipartBodyParser_ {
  @scala.inline
  def apply(
    hash: String = null,
    keepExtensions: js.UndefOr[Boolean] = js.undefined,
    mapFiles: js.UndefOr[Boolean] = js.undefined,
    mapParams: js.UndefOr[Boolean] = js.undefined,
    maxFieldsSize: js.UndefOr[Double] = js.undefined,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    multipartFileHandler: js.Any = null,
    multipartHandler: js.Any = null,
    multiples: js.UndefOr[Boolean] = js.undefined,
    overrideParams: js.UndefOr[Boolean] = js.undefined,
    uploadDir: String = null
  ): MultipartBodyParser_ = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(keepExtensions)) __obj.updateDynamic("keepExtensions")(keepExtensions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapFiles)) __obj.updateDynamic("mapFiles")(mapFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFieldsSize)) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (multipartFileHandler != null) __obj.updateDynamic("multipartFileHandler")(multipartFileHandler.asInstanceOf[js.Any])
    if (multipartHandler != null) __obj.updateDynamic("multipartHandler")(multipartHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(multiples)) __obj.updateDynamic("multiples")(multiples.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.get.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartBodyParser_]
  }
}

