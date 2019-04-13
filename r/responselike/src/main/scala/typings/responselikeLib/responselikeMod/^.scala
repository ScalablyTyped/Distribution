package typings
package responselikeLib.responselikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a streamable response object similar to a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage).
  */
@JSImport("responselike", JSImport.Namespace)
@js.native
class ^ protected () extends ResponseLike {
  /**
    * @param statusCode HTTP response status code.
    * @param headers HTTP headers object. Keys will be automatically lowercased.
    * @param body A Buffer containing the response body. The Buffer contents will be streamable but is also exposed directly as `response.body`.
    * @param url Request URL string.
    */
  def this(statusCode: scala.Double, headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]], body: nodeLib.Buffer, url: java.lang.String) = this()
  /* CompleteClass */
  override var body: nodeLib.Buffer = js.native
  /* CompleteClass */
  override var headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]] = js.native
  /* CompleteClass */
  override var statusCode: scala.Double = js.native
  /* CompleteClass */
  override var url: java.lang.String = js.native
}

