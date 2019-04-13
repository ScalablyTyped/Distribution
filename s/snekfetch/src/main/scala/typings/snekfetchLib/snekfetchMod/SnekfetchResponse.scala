package typings
package snekfetchLib.snekfetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnekfetchResponse extends js.Object {
  var body: java.lang.String | js.Object | nodeLib.Buffer
  var headers: org.scalablytyped.runtime.StringDictionary[js.Any]
  var ok: scala.Boolean
  var raw: nodeLib.Buffer
  var request: nodeLib.httpMod.ClientRequest
  var status: scala.Double
  var statusText: java.lang.String
}

object SnekfetchResponse {
  @scala.inline
  def apply(
    body: java.lang.String | js.Object | nodeLib.Buffer,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any],
    ok: scala.Boolean,
    raw: nodeLib.Buffer,
    request: nodeLib.httpMod.ClientRequest,
    status: scala.Double,
    statusText: java.lang.String
  ): SnekfetchResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, ok = ok, raw = raw, request = request, status = status, statusText = statusText)
  
    __obj.asInstanceOf[SnekfetchResponse]
  }
}

