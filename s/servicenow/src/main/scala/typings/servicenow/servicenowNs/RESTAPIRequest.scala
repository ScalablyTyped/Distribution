package typings.servicenow.servicenowNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequest[T] extends js.Object {
  val body: RESTAPIRequestBody[T]
  val headers: StringDictionary[String]
  val pathParams: StringDictionary[String]
  val queryParams: StringDictionary[js.Array[String]]
  val queryString: String
  val url: String
  def getHeader(header: String): String
  def getSupportedResponseContentTypes(): js.Array[String]
}

object RESTAPIRequest {
  @scala.inline
  def apply[T](
    body: RESTAPIRequestBody[T],
    getHeader: String => String,
    getSupportedResponseContentTypes: () => js.Array[String],
    headers: StringDictionary[String],
    pathParams: StringDictionary[String],
    queryParams: StringDictionary[js.Array[String]],
    queryString: String,
    url: String
  ): RESTAPIRequest[T] = {
    val __obj = js.Dynamic.literal(body = body, getHeader = js.Any.fromFunction1(getHeader), getSupportedResponseContentTypes = js.Any.fromFunction0(getSupportedResponseContentTypes), headers = headers, pathParams = pathParams, queryParams = queryParams, queryString = queryString, url = url)
  
    __obj.asInstanceOf[RESTAPIRequest[T]]
  }
}

