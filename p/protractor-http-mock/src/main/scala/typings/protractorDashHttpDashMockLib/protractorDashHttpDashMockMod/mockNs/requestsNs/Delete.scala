package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP Delete request mock.
  */
trait Delete[TResponse]
  extends AllRequests[TResponse, js.Any] {
  var request: protractorDashHttpDashMockLib.Anon_Method
  var response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
}

object Delete {
  @scala.inline
  def apply[TResponse](
    request: protractorDashHttpDashMockLib.Anon_Method,
    response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
  ): Delete[TResponse] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[Delete[TResponse]]
  }
}

