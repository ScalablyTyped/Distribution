package typings.responselike.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
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
  def this(
    statusCode: Double,
    headers: StringDictionary[js.UndefOr[String | js.Array[String]]],
    body: Buffer,
    url: String
  ) = this()
  /* CompleteClass */
  override var body: Buffer = js.native
  /* CompleteClass */
  override var headers: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
  /* CompleteClass */
  override var statusCode: Double = js.native
  /* CompleteClass */
  override var url: String = js.native
}

