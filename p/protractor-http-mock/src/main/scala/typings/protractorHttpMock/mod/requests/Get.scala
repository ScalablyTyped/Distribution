package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GET request mock.
  */
trait Get[TResponse] extends js.Object {
  var request: Headers
  var response: Data[TResponse]
}

object Get {
  @scala.inline
  def apply[TResponse](request: Headers, response: Data[TResponse]): Get[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get[TResponse]]
  }
}

