package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOptions extends js.Object {
  var begin: js.UndefOr[UploadCallbackBegin] = js.undefined
  // An object of fields to be passed to the server
  var fields: js.UndefOr[Fields] = js.undefined
  // An array of objects with the file information to be uploaded.
  var files: js.Array[UploadFileItem]
  // An object of headers to be passed to the server
  var headers: js.UndefOr[Headers] = js.undefined
  // Default is 'POST', supports 'POST' and 'PUT'
  var method: js.UndefOr[java.lang.String] = js.undefined
  var progress: js.UndefOr[UploadCallbackProgress] = js.undefined
  // URL to upload file to
  var toUrl: java.lang.String
}

object UploadFileOptions {
  @scala.inline
  def apply(
    files: js.Array[UploadFileItem],
    toUrl: java.lang.String,
    begin: UploadCallbackBegin = null,
    fields: Fields = null,
    headers: Headers = null,
    method: java.lang.String = null,
    progress: UploadCallbackProgress = null
  ): UploadFileOptions = {
    val __obj = js.Dynamic.literal(files = files, toUrl = toUrl)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[UploadFileOptions]
  }
}

