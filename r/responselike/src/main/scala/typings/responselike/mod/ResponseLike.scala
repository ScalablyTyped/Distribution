package typings.responselike.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a streamable response object similar to a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage).
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream.Readable * / any */ @js.native
trait ResponseLike extends js.Object {
  var body: Buffer = js.native
  var headers: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
  var statusCode: Double = js.native
  var url: String = js.native
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
  @scala.inline
  implicit class ResponseLikeOps[Self <: ResponseLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

