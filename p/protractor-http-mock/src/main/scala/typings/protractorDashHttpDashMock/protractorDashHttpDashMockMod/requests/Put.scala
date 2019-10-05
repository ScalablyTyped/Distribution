package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typings.protractorDashHttpDashMock.Anon_Data
import typings.protractorDashHttpDashMock.Anon_Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PUT request mock.
  */
trait Put[TResponse]
  extends AllRequests[TResponse, js.Any] {
  var request: Anon_Method
  var response: Anon_Data[TResponse]
}

object Put {
  @scala.inline
  def apply[TResponse](request: Anon_Method, response: Anon_Data[TResponse]): Put[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Put[TResponse]]
  }
}

