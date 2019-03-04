package typings
package responselikeLib.responselikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a streamable response object similar to a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage).
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ResponseLike extends js.Object {
  var body: nodeLib.Buffer
  var headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  var statusCode: scala.Double
  var url: java.lang.String
}

object ResponseLike {
  @scala.inline
  def apply(
    body: nodeLib.Buffer,
    headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]],
    statusCode: scala.Double,
    url: java.lang.String
  ): ResponseLike = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode, url = url)
  
    __obj.asInstanceOf[ResponseLike]
  }
}

