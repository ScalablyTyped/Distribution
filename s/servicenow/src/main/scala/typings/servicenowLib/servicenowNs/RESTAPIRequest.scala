package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequest[T] extends js.Object {
  val body: RESTAPIRequestBody[T]
  val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  val pathParams: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  val queryParams: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  val queryString: java.lang.String
  val url: java.lang.String
  def getHeader(header: java.lang.String): java.lang.String
  def getSupportedResponseContentTypes(): js.Array[java.lang.String]
}

object RESTAPIRequest {
  @scala.inline
  def apply[T](
    body: RESTAPIRequestBody[T],
    getHeader: js.Function1[java.lang.String, java.lang.String],
    getSupportedResponseContentTypes: js.Function0[js.Array[java.lang.String]],
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    pathParams: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queryParams: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    queryString: java.lang.String,
    url: java.lang.String
  ): RESTAPIRequest[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("getHeader")(getHeader)
    __obj.updateDynamic("getSupportedResponseContentTypes")(getSupportedResponseContentTypes)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("pathParams")(pathParams)
    __obj.updateDynamic("queryParams")(queryParams)
    __obj.updateDynamic("queryString")(queryString)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RESTAPIRequest[T]]
  }
}

