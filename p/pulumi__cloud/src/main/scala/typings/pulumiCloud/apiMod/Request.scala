package typings.pulumiCloud.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  /**
    * The base url on which this http request was served.
    */
  var baseUrl: String = js.native
  
  /**
    * The body of the HTTP request.
    */
  var body: Buffer = js.native
  
  /**
    * The headers of the HTTP request.
    */
  var headers: StringDictionary[String | js.Array[String]] = js.native
  
  /**
    * The hostname of the request.
    */
  var hostname: String = js.native
  
  /**
    * The method of the HTTP request.
    */
  var method: String = js.native
  
  /**
    * The path parameters of the HTTP request. Each `{param}` in the matched
    * route is available as a property of this oject.
    */
  var params: StringDictionary[String] = js.native
  
  /**
    * The raw path from the HTTP request.
    */
  var path: String = js.native
  
  /**
    * The protocol of the request (e.g. HTTP/HTTPS).
    */
  var protocol: String = js.native
  
  /**
    * The query parameters parsed from the query string of the request URL.
    */
  var query: StringDictionary[String | js.Array[String]] = js.native
  
  /**
    * The headers of the HTTP request.
    */
  var rawHeaders: js.Array[String] = js.native
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
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[String | js.Array[String]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: StringDictionary[String | js.Array[String]]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawHeadersVarargs(value: String*): Self = this.set("rawHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRawHeaders(value: js.Array[String]): Self = this.set("rawHeaders", value.asInstanceOf[js.Any])
  }
}
