package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RESTAPIRequest[T] extends js.Object {
  val body: RESTAPIRequestBody[T]
  val headers: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  val pathParams: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  val queryParams: ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]
  val queryString: java.lang.String
  val url: java.lang.String
  def getHeader(header: java.lang.String): java.lang.String
  def getSupportedResponseContentTypes(): js.Array[java.lang.String]
}

