package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobFetchRepsonse extends js.Object {
  var bodyUsed: Boolean
  var headers: js.Any
  var ok: Boolean
  var resp: FetchBlobResponse
  var rnfbResp: FetchBlobResponse
  var rnfbRespInfo: RNFetchBlobResponseInfo
  var status: Double
  var `type`: String
  def arrayBuffer(): js.Promise[js.Array[_]]
  def blob(): js.Promise[PolyfillBlob]
  def json(): js.Promise[_]
  def rawResp(): js.Promise[FetchBlobResponse]
  def text(): js.Promise[String]
}

object RNFetchBlobFetchRepsonse {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.Array[_]],
    blob: () => js.Promise[PolyfillBlob],
    bodyUsed: Boolean,
    headers: js.Any,
    json: () => js.Promise[_],
    ok: Boolean,
    rawResp: () => js.Promise[FetchBlobResponse],
    resp: FetchBlobResponse,
    rnfbResp: FetchBlobResponse,
    rnfbRespInfo: RNFetchBlobResponseInfo,
    status: Double,
    text: () => js.Promise[String],
    `type`: String
  ): RNFetchBlobFetchRepsonse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], rawResp = js.Any.fromFunction0(rawResp), resp = resp.asInstanceOf[js.Any], rnfbResp = rnfbResp.asInstanceOf[js.Any], rnfbRespInfo = rnfbRespInfo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobFetchRepsonse]
  }
}

