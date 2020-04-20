package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.AnonData
import typings.protractorHttpMock.AnonPathString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONP request mock.
  */
trait Jsonp[TResponse] extends js.Object {
  var request: AnonPathString
  var response: AnonData[TResponse]
}

object Jsonp {
  @scala.inline
  def apply[TResponse](request: AnonPathString, response: AnonData[TResponse]): Jsonp[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jsonp[TResponse]]
  }
}

