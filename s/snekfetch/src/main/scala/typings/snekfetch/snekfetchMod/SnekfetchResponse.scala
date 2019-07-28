package typings.snekfetch.snekfetchMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnekfetchResponse extends js.Object {
  var body: String | js.Object | Buffer
  var headers: StringDictionary[js.Any]
  var ok: Boolean
  var raw: Buffer
  var request: ClientRequest
  var status: Double
  var statusText: String
}

object SnekfetchResponse {
  @scala.inline
  def apply(
    body: String | js.Object | Buffer,
    headers: StringDictionary[js.Any],
    ok: Boolean,
    raw: Buffer,
    request: ClientRequest,
    status: Double,
    statusText: String
  ): SnekfetchResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, ok = ok, raw = raw, request = request, status = status, statusText = statusText)
  
    __obj.asInstanceOf[SnekfetchResponse]
  }
}

