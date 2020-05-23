package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.MethodPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP Delete request mock.
  */
trait Delete[TResponse] extends js.Object {
  var request: MethodPath
  var response: Data[TResponse]
}

object Delete {
  @scala.inline
  def apply[TResponse](request: MethodPath, response: Data[TResponse]): Delete[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete[TResponse]]
  }
}

