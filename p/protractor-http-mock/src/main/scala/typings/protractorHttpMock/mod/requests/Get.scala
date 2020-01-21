package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonData
import typings.protractorHttpMock.AnonGET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GET request mock.
  */
trait Get[TResponse] extends js.Object {
  var request: AnonGET
  var response: AnonData[TResponse]
}

object Get {
  @scala.inline
  def apply[TResponse](request: AnonGET, response: AnonData[TResponse]): Get[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Get[TResponse]]
  }
}

