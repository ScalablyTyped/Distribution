package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matched request.
  */
trait ReceivedRequest extends js.Object {
  var method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs.Method
  var url: java.lang.String
}

object ReceivedRequest {
  @scala.inline
  def apply(
    method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs.Method,
    url: java.lang.String
  ): ReceivedRequest = {
    val __obj = js.Dynamic.literal(method = method, url = url)
  
    __obj.asInstanceOf[ReceivedRequest]
  }
}

