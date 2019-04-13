package typings
package servicenowDashLondonLib.snUnderscoreWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequest extends js.Object {
  val body: RESTAPIRequestBody
  val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  val pathParams: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  val queryParams: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
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
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    pathParams: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queryParams: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    queryString: java.lang.String,
    uri: java.lang.String,
    url: java.lang.String
  ): RESTAPIRequest = {
    val __obj = js.Dynamic.literal(body = body, getHeader = js.Any.fromFunction1(getHeader), getSupportedResponseContentTypes = js.Any.fromFunction0(getSupportedResponseContentTypes), headers = headers, pathParams = pathParams, queryParams = queryParams, queryString = queryString, uri = uri, url = url)
  
    __obj.asInstanceOf[RESTAPIRequest]
  }
}

