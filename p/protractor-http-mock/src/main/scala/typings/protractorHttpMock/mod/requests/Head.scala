package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonData
import typings.protractorHttpMock.AnonRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HEAD request mock.
  */
trait Head[TResponse] extends js.Object {
  var request: AnonRegex
  var response: AnonData[TResponse]
}

object Head {
  @scala.inline
  def apply[TResponse](request: AnonRegex, response: AnonData[TResponse]): Head[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Head[TResponse]]
  }
}

