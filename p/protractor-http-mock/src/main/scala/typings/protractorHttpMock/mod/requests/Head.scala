package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonData
import typings.protractorHttpMock.AnonHEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HEAD request mock.
  */
trait Head[TResponse] extends js.Object {
  var request: AnonHEAD
  var response: AnonData[TResponse]
}

object Head {
  @scala.inline
  def apply[TResponse](request: AnonHEAD, response: AnonData[TResponse]): Head[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Head[TResponse]]
  }
}

