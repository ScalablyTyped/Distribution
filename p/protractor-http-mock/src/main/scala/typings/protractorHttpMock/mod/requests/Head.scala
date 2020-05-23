package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.Regex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HEAD request mock.
  */
trait Head[TResponse] extends js.Object {
  var request: Regex
  var response: Data[TResponse]
}

object Head {
  @scala.inline
  def apply[TResponse](request: Regex, response: Data[TResponse]): Head[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Head[TResponse]]
  }
}

