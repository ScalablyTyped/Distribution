package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonData
import typings.protractorHttpMock.AnonMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock.
  */
trait Post[TResponse] extends js.Object {
  var request: AnonMethod
  var response: AnonData[TResponse]
}

object Post {
  @scala.inline
  def apply[TResponse](request: AnonMethod, response: AnonData[TResponse]): Post[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Post[TResponse]]
  }
}

