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
  def arrayBuffer(): stdLib.Promise[js.Array[_]]
  def blob(): stdLib.Promise[PolyfillBlob]
  def json(): stdLib.Promise[_]
  def rawResp(): stdLib.Promise[FetchBlobResponse]
  def text(): stdLib.Promise[java.lang.String]
}

