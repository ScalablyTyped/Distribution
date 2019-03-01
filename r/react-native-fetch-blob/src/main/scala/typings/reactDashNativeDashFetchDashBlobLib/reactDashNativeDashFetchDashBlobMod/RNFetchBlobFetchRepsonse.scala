package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobFetchRepsonse extends js.Object {
  var bodyUsed: scala.Boolean
  var headers: js.Any
  var ok: scala.Boolean
  var resp: FetchBlobResponse
  var rnfbResp: FetchBlobResponse
  var rnfbRespInfo: RNFetchBlobResponseInfo
  var status: scala.Double
  var `type`: java.lang.String
  def arrayBuffer(): js.Promise[js.Array[_]]
  def blob(): js.Promise[PolyfillBlob]
  def json(): js.Promise[_]
  def rawResp(): js.Promise[FetchBlobResponse]
  def text(): js.Promise[java.lang.String]
}

object RNFetchBlobFetchRepsonse {
  @scala.inline
  def apply(
    arrayBuffer: js.Function0[js.Promise[js.Array[_]]],
    blob: js.Function0[js.Promise[PolyfillBlob]],
    bodyUsed: scala.Boolean,
    headers: js.Any,
    json: js.Function0[js.Promise[_]],
    ok: scala.Boolean,
    rawResp: js.Function0[js.Promise[FetchBlobResponse]],
    resp: FetchBlobResponse,
    rnfbResp: FetchBlobResponse,
    rnfbRespInfo: RNFetchBlobResponseInfo,
    status: scala.Double,
    text: js.Function0[js.Promise[java.lang.String]],
    `type`: java.lang.String
  ): RNFetchBlobFetchRepsonse = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arrayBuffer")(arrayBuffer)
    __obj.updateDynamic("blob")(blob)
    __obj.updateDynamic("bodyUsed")(bodyUsed)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("rawResp")(rawResp)
    __obj.updateDynamic("resp")(resp)
    __obj.updateDynamic("rnfbResp")(rnfbResp)
    __obj.updateDynamic("rnfbRespInfo")(rnfbRespInfo)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RNFetchBlobFetchRepsonse]
  }
}

