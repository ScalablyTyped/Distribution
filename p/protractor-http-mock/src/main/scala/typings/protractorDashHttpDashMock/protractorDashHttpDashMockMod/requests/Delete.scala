package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typings.protractorDashHttpDashMock.Anon_Data
import typings.protractorDashHttpDashMock.Anon_Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP Delete request mock.
  */
trait Delete[TResponse]
  extends AllRequests[TResponse, js.Any] {
  var request: Anon_Method
  var response: Anon_Data[TResponse]
}

object Delete {
  @scala.inline
  def apply[TResponse](request: Anon_Method, response: Anon_Data[TResponse]): Delete[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Delete[TResponse]]
  }
}

