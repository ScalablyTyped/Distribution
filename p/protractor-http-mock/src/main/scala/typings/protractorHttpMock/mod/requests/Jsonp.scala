package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.PathString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONP request mock.
  */
trait Jsonp[TResponse] extends js.Object {
  var request: PathString
  var response: Data[TResponse]
}

object Jsonp {
  @scala.inline
  def apply[TResponse](request: PathString, response: Data[TResponse]): Jsonp[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jsonp[TResponse]]
  }
}

