package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock with payload.
  */
trait PostData[TResponse, TPayload] extends js.Object {
  var request: typings.protractorHttpMock.anon.Method[TPayload]
  var response: Data[TResponse]
}

object PostData {
  @scala.inline
  def apply[TResponse, TPayload](request: typings.protractorHttpMock.anon.Method[TPayload], response: Data[TResponse]): PostData[TResponse, TPayload] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostData[TResponse, TPayload]]
  }
}

