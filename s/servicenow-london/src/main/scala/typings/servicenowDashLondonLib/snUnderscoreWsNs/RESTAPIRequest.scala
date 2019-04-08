package typings
package servicenowDashLondonLib.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequest extends js.Object {
  val body: RESTAPIRequestBody
  val headers: /* import warning: ImportType.apply Failed type conversion: {[paramName: string] : string, [paramName: string] : string} */ js.Any
  val pathParams: /* import warning: ImportType.apply Failed type conversion: {[paramName: string] : string, [paramName: string] : string} */ js.Any
  val queryParams: /* import warning: ImportType.apply Failed type conversion: {[paramName: string] : std.Array<string>, [paramName: string] : std.Array<string>} */ js.Any
  val queryString: java.lang.String
  val uri: java.lang.String
  val url: java.lang.String
  def getHeader(header: java.lang.String): java.lang.String
  def getSupportedResponseContentTypes(): js.Array[java.lang.String]
}

object RESTAPIRequest {
  @scala.inline
  def apply(
    body: RESTAPIRequestBody,
    getHeader: java.lang.String => java.lang.String,
    getSupportedResponseContentTypes: () => js.Array[java.lang.String],
    headers: /* import warning: ImportType.apply Failed type conversion: {[paramName: string] : string, [paramName: string] : string} */ js.Any,
    pathParams: /* import warning: ImportType.apply Failed type conversion: {[paramName: string] : string, [paramName: string] : string} */ js.Any,
    queryParams: /* import warning: ImportType.apply Failed type conversion: {[paramName: string] : std.Array<string>, [paramName: string] : std.Array<string>} */ js.Any,
    queryString: java.lang.String,
    uri: java.lang.String,
    url: java.lang.String
  ): RESTAPIRequest = {
    val __obj = js.Dynamic.literal(body = body, getHeader = js.Any.fromFunction1(getHeader), getSupportedResponseContentTypes = js.Any.fromFunction0(getSupportedResponseContentTypes), headers = headers, pathParams = pathParams, queryParams = queryParams, queryString = queryString, uri = uri, url = url)
  
    __obj.asInstanceOf[RESTAPIRequest]
  }
}

