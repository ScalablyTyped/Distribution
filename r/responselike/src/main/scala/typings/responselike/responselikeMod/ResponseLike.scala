package typings.responselike.responselikeMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a streamable response object similar to a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage).
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Stream.Readable * / any */ trait ResponseLike extends js.Object {
  var body: Buffer
  var headers: StringDictionary[js.UndefOr[String | js.Array[String]]]
  var statusCode: Double
  var url: String
}

object ResponseLike {
  @scala.inline
  def apply(
    body: Buffer,
    headers: StringDictionary[js.UndefOr[String | js.Array[String]]],
    statusCode: Double,
    url: String
  ): ResponseLike = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseLike]
  }
}

