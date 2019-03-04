package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any
  var respType: reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.text | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.blob | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.Empty | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.json
  var rnfbEncode: reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.path | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.base64 | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.ascii | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.utf8
  var state: scala.Double
  var status: scala.Double
  var taskId: java.lang.String
}

object RNFetchBlobResponseInfo {
  @scala.inline
  def apply(
    headers: js.Any,
    respType: reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.text | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.blob | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.Empty | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.json,
    rnfbEncode: reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.path | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.base64 | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.ascii | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.utf8,
    state: scala.Double,
    status: scala.Double,
    taskId: java.lang.String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers, respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state, status = status, taskId = taskId)
  
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
}

