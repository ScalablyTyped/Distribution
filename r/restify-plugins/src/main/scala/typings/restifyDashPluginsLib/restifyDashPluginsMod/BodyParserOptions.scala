package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyParserOptions extends js.Object {
  /**
    * If you want checksums calculated for incoming files, set this to either sha1 or md5.
    */
  var hash: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If you want the uploaded files to include the extensions of the original files (multipart uploads only). Does nothing if multipartFileHandler is defined.
    */
  var keepExtensions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If req.params should be filled with the contents of files sent through a multipart request.
    * Formidable is used internally for parsing, and a file is denoted as a multipart part with the filename option set in its Content-Disposition.
    * This will only be performed if mapParams is true.
    */
  var mapFiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If req.params should be filled with parsed parameters from HTTP body.
    */
  var mapParams: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum size in bytes allowed in the HTTP body. Useful for limiting clients from hogging server memory.
    */
  var maxBodySize: js.UndefOr[scala.Double] = js.undefined
  var maxFieldsSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A callback to handle any multipart file.
    * It will be a file if the part have a Content-Disposition with the filename parameter set.
    * This typically happens when a browser sends a form and there is a parameter similar to <input type="file" />.
    * If this is not provided, the default behaviour is to map the contents into req.params.
    */
  var multipartFileHandler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A callback to handle any multipart part which is not a file.
    * If this is omitted, the default handler is invoked which may or may not map the parts into req.params, depending on the mapParams-option.
    */
  var multipartHandler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * If you want to support html5 multiple attribute in upload fields.
    */
  var multiples: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If an entry in req.params should be overwritten by the value in the body if the names are the same.
    * For instance, if you have the route /:someval, and someone posts an x-www-form-urlencoded Content-Type with the body someval=happy to /sad,
    * the value will be happy if overrideParams is true, sad otherwise.
    */
  var overrideParams: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true if you want to end the request with a UnsupportedMediaTypeError when none of the supported content types was given.
    */
  var rejectUnknown: js.UndefOr[scala.Boolean] = js.undefined
  var reviver: js.UndefOr[js.Any] = js.undefined
  /**
    * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
    */
  var uploadDir: js.UndefOr[java.lang.String] = js.undefined
}

object BodyParserOptions {
  @scala.inline
  def apply(
    hash: java.lang.String = null,
    keepExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    mapFiles: js.UndefOr[scala.Boolean] = js.undefined,
    mapParams: js.UndefOr[scala.Boolean] = js.undefined,
    maxBodySize: scala.Int | scala.Double = null,
    maxFieldsSize: scala.Int | scala.Double = null,
    multipartFileHandler: () => scala.Unit = null,
    multipartHandler: () => scala.Unit = null,
    multiples: js.UndefOr[scala.Boolean] = js.undefined,
    overrideParams: js.UndefOr[scala.Boolean] = js.undefined,
    rejectUnknown: js.UndefOr[scala.Boolean] = js.undefined,
    reviver: js.Any = null,
    uploadDir: java.lang.String = null
  ): BodyParserOptions = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (!js.isUndefined(keepExtensions)) __obj.updateDynamic("keepExtensions")(keepExtensions)
    if (!js.isUndefined(mapFiles)) __obj.updateDynamic("mapFiles")(mapFiles)
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams)
    if (maxBodySize != null) __obj.updateDynamic("maxBodySize")(maxBodySize.asInstanceOf[js.Any])
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (multipartFileHandler != null) __obj.updateDynamic("multipartFileHandler")(js.Any.fromFunction0(multipartFileHandler))
    if (multipartHandler != null) __obj.updateDynamic("multipartHandler")(js.Any.fromFunction0(multipartHandler))
    if (!js.isUndefined(multiples)) __obj.updateDynamic("multiples")(multiples)
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams)
    if (!js.isUndefined(rejectUnknown)) __obj.updateDynamic("rejectUnknown")(rejectUnknown)
    if (reviver != null) __obj.updateDynamic("reviver")(reviver)
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir)
    __obj.asInstanceOf[BodyParserOptions]
  }
}

