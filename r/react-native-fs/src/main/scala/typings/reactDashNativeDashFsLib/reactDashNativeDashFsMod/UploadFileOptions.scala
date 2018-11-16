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

