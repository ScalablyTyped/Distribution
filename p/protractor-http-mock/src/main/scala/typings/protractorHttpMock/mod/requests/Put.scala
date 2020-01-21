package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonData
import typings.protractorHttpMock.AnonMethodPUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PUT request mock.
  */
trait Put[TResponse] extends js.Object {
  var request: AnonMethodPUT
  var response: AnonData[TResponse]
}

object Put {
  @scala.inline
  def apply[TResponse](request: AnonMethodPUT, response: AnonData[TResponse]): Put[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Put[TResponse]]
  }
}

