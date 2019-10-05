package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matched request.
  */
trait ReceivedRequest extends js.Object {
  var method: Method
  var url: String
}

object ReceivedRequest {
  @scala.inline
  def apply(method: Method, url: String): ReceivedRequest = {
    val __obj = js.Dynamic.literal(method = method, url = url)
  
    __obj.asInstanceOf[ReceivedRequest]
  }
}

