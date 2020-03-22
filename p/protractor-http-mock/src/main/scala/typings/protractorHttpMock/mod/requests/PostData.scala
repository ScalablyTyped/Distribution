package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonData
import typings.protractorHttpMock.AnonMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock with payload.
  */
trait PostData[TResponse, TPayload] extends js.Object {
  var request: AnonMethod[TPayload]
  var response: AnonData[TResponse]
}

object PostData {
  @scala.inline
  def apply[TResponse, TPayload](request: AnonMethod[TPayload], response: AnonData[TResponse]): PostData[TResponse, TPayload] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostData[TResponse, TPayload]]
  }
}

