package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matched request.
  */
trait ReceivedRequest extends js.Object {
  var method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method
  var url: java.lang.String
}

object ReceivedRequest {
  @scala.inline
  def apply(
    method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method,
    url: java.lang.String
  ): ReceivedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ReceivedRequest]
  }
}

