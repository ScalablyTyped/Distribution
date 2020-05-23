package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock.
  */
trait Post[TResponse] extends js.Object {
  var request: Path
  var response: Data[TResponse]
}

object Post {
  @scala.inline
  def apply[TResponse](request: Path, response: Data[TResponse]): Post[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post[TResponse]]
  }
}

