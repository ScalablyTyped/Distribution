package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobResponseInfo extends js.Object {
  var headers: js.Any
  var respType: rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.text | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.blob | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.Empty | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.json
  var rnfbEncode: rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.path | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.base64 | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.ascii | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.utf8
  var state: scala.Double
  var status: scala.Double
  var taskId: java.lang.String
}

object RNFetchBlobResponseInfo {
  @scala.inline
  def apply(
    headers: js.Any,
    respType: rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.text | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.blob | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.Empty | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.json,
    rnfbEncode: rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.path | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.base64 | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.ascii | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.utf8,
    state: scala.Double,
    status: scala.Double,
    taskId: java.lang.String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("respType")(respType.asInstanceOf[js.Any])
    __obj.updateDynamic("rnfbEncode")(rnfbEncode.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
}

