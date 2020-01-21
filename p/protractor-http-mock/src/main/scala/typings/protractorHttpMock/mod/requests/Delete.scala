package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonDELETE
import typings.protractorHttpMock.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP Delete request mock.
  */
trait Delete[TResponse] extends js.Object {
  var request: AnonDELETE
  var response: AnonData[TResponse]
}

object Delete {
  @scala.inline
  def apply[TResponse](request: AnonDELETE, response: AnonData[TResponse]): Delete[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delete[TResponse]]
  }
}

