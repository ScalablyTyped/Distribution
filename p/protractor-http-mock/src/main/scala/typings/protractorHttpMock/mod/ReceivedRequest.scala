package typings.protractorHttpMock.mod

import typings.protractorHttpMock.mod.requests.Method
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
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceivedRequest]
  }
}

