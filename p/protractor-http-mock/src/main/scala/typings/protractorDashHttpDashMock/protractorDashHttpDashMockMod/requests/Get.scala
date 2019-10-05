package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typings.protractorDashHttpDashMock.Anon_Data
import typings.protractorDashHttpDashMock.Anon_Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GET request mock.
  */
trait Get[TResponse]
  extends AllRequests[TResponse, js.Any] {
  var request: Anon_Headers
  var response: Anon_Data[TResponse]
}

object Get {
  @scala.inline
  def apply[TResponse](request: Anon_Headers, response: Anon_Data[TResponse]): Get[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Get[TResponse]]
  }
}

