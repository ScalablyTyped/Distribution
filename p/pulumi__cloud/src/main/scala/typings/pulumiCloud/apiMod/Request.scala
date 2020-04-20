package typings.pulumiCloud.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * The base url on which this http request was served.
    */
  var baseUrl: String
  /**
    * The body of the HTTP request.
    */
  var body: Buffer
  /**
    * The headers of the HTTP request.
    */
  var headers: StringDictionary[String | js.Array[String]]
  /**
    * The hostname of the request.
    */
  var hostname: String
  /**
    * The method of the HTTP request.
    */
  var method: String
  /**
    * The path parameters of the HTTP request. Each `{param}` in the matched
    * route is available as a property of this oject.
    */
  var params: StringDictionary[String]
  /**
    * The raw path from the HTTP request.
    */
  var path: String
  /**
    * The protocol of the request (e.g. HTTP/HTTPS).
    */
  var protocol: String
  /**
    * The query parameters parsed from the query string of the request URL.
    */
  var query: StringDictionary[String | js.Array[String]]
  /**
    * The headers of the HTTP request.
    */
  var rawHeaders: js.Array[String]
}

object Request {
  @scala.inline
  def apply(
    baseUrl: String,
    body: Buffer,
    headers: StringDictionary[String | js.Array[String]],
    hostname: String,
    method: String,
    params: StringDictionary[String],
    path: String,
    protocol: String,
    query: StringDictionary[String | js.Array[String]],
    rawHeaders: js.Array[String]
  ): Request = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], rawHeaders = rawHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

