package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock with payload.
  */
trait PostData[TResponse, TPayload] extends AllRequests[TResponse, TPayload] {
  var request: protractorDashHttpDashMockLib.Anon_DataMethod[TPayload]
  var response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
}

object PostData {
  @scala.inline
  def apply[TResponse, TPayload](
    request: protractorDashHttpDashMockLib.Anon_DataMethod[TPayload],
    response: protractorDashHttpDashMockLib.Anon_Data[TResponse]
  ): PostData[TResponse, TPayload] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[PostData[TResponse, TPayload]]
  }
}

