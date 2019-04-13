package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock.
  */
trait Post[TResponse]
  extends AllRequests[TResponse, js.Any] {
  var request: protractorDashHttpDashMockLib.Anon_Method
  var response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
}

object Post {
  @scala.inline
  def apply[TResponse](
    request: protractorDashHttpDashMockLib.Anon_Method,
    response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
  ): Post[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Post[TResponse]]
  }
}

