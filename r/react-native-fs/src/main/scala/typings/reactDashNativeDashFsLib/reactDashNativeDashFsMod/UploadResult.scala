package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadResult extends js.Object {
  // The HTTP response body
  var body: java.lang.String
  // The HTTP response headers from the server
  var headers: Headers
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var jobId: scala.Double
  // The HTTP status code
  var statusCode: scala.Double
}

