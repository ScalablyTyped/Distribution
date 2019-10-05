package typings.servicenowDashLondon.sn_ws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequest extends js.Object {
  val body: RESTAPIRequestBody
  val headers: StringDictionary[String]
  val pathParams: StringDictionary[String]
  val queryParams: StringDictionary[js.Array[String]]
  val queryString: String
  val uri: String
  val url: String
  def getHeader(header: String): String
  def getSupportedResponseContentTypes(): js.Array[String]
}

object RESTAPIRequest {
  @scala.inline
  def apply(
    body: RESTAPIRequestBody,
    getHeader: String => String,
    getSupportedResponseContentTypes: () => js.Array[String],
    headers: StringDictionary[String],
    pathParams: StringDictionary[String],
    queryParams: StringDictionary[js.Array[String]],
    queryString: String,
    uri: String,
    url: String
  ): RESTAPIRequest = {
    val __obj = js.Dynamic.literal(body = body, getHeader = js.Any.fromFunction1(getHeader), getSupportedResponseContentTypes = js.Any.fromFunction0(getSupportedResponseContentTypes), headers = headers, pathParams = pathParams, queryParams = queryParams, queryString = queryString, uri = uri, url = url)
  
    __obj.asInstanceOf[RESTAPIRequest]
  }
}

