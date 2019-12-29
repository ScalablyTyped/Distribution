package typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobMod

import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings._empty
import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.ascii
import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.base64
import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.blob
import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.json
import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.path
import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.text
import typings.reactDashNativeDashFetchDashBlob.reactDashNativeDashFetchDashBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any
  var respType: text | blob | _empty | json
  var rnfbEncode: path | base64 | ascii | utf8
  var state: Double
  var status: Double
  var taskId: String
}

object RNFetchBlobResponseInfo {
  @scala.inline
  def apply(
    headers: js.Any,
    respType: text | blob | _empty | json,
    rnfbEncode: path | base64 | ascii | utf8,
    state: Double,
    status: Double,
    taskId: String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
}

