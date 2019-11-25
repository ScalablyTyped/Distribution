package typings.rnDashFetchDashBlob.rnDashFetchDashBlobMod

import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.Empty
import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.ascii
import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.base64
import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.blob
import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.json
import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.path
import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.text
import typings.rnDashFetchDashBlob.rnDashFetchDashBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any
  var respType: text | blob | Empty | json
  var rnfbEncode: path | base64 | ascii | utf8
  var state: Double
  var status: Double
  var taskId: String
}

object RNFetchBlobResponseInfo {
  @scala.inline
  def apply(
    headers: js.Any,
    respType: text | blob | Empty | json,
    rnfbEncode: path | base64 | ascii | utf8,
    state: Double,
    status: Double,
    taskId: String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
}

