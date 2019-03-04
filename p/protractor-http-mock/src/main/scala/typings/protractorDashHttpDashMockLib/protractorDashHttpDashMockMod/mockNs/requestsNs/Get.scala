package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GET request mock.
  */
trait Get[TResponse]
  extends AllRequests[TResponse, js.Any] {
  var request: protractorDashHttpDashMockLib.Anon_Headers
  var response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
}

object Get {
  @scala.inline
  def apply[TResponse](
    request: protractorDashHttpDashMockLib.Anon_Headers,
    response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
  ): Get[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Get[TResponse]]
  }
}

