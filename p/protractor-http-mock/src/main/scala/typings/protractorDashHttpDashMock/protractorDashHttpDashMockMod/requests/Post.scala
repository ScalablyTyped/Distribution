package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typings.protractorDashHttpDashMock.Anon_Data
import typings.protractorDashHttpDashMock.Anon_Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock.
  */
trait Post[TResponse] extends js.Object {
  var request: Anon_Method
  var response: Anon_Data[TResponse]
}

object Post {
  @scala.inline
  def apply[TResponse](request: Anon_Method, response: Anon_Data[TResponse]): Post[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Post[TResponse]]
  }
}

