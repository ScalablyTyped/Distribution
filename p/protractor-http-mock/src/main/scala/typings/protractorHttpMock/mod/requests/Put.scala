package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.PathRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PUT request mock.
  */
trait Put[TResponse] extends js.Object {
  var request: PathRegex
  var response: Data[TResponse]
}

object Put {
  @scala.inline
  def apply[TResponse](request: PathRegex, response: Data[TResponse]): Put[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Put[TResponse]]
  }
}

