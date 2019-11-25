package typings.restifyDashPlugins.restifyDashPluginsMod

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartBodyParser extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var keepExtensions: js.UndefOr[Boolean] = js.undefined
  var mapFiles: js.UndefOr[Boolean] = js.undefined
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var maxFieldsSize: js.UndefOr[Double] = js.undefined
  var multipartFileHandler: js.UndefOr[js.Any] = js.undefined
  var multipartHandler: js.UndefOr[js.Any] = js.undefined
  var multiples: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  var uploadDir: js.UndefOr[String] = js.undefined
}

object MultipartBodyParser {
  @scala.inline
  def apply(
    hash: String = null,
    keepExtensions: js.UndefOr[Boolean] = js.undefined,
    mapFiles: js.UndefOr[Boolean] = js.undefined,
    mapParams: js.UndefOr[Boolean] = js.undefined,
    maxFieldsSize: Int | Double = null,
    multipartFileHandler: js.Any = null,
    multipartHandler: js.Any = null,
    multiples: js.UndefOr[Boolean] = js.undefined,
    overrideParams: js.UndefOr[Boolean] = js.undefined,
    uploadDir: String = null
  ): MultipartBodyParser = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(keepExtensions)) __obj.updateDynamic("keepExtensions")(keepExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(mapFiles)) __obj.updateDynamic("mapFiles")(mapFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.asInstanceOf[js.Any])
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (multipartFileHandler != null) __obj.updateDynamic("multipartFileHandler")(multipartFileHandler.asInstanceOf[js.Any])
    if (multipartHandler != null) __obj.updateDynamic("multipartHandler")(multipartHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(multiples)) __obj.updateDynamic("multiples")(multiples.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartBodyParser]
  }
}

@JSImport("restify-plugins", "multipartBodyParser")
@js.native
object multipartBodyParser extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: MultipartBodyParser): RequestHandler = js.native
}

