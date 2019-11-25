package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typings.protractorDashHttpDashMock.Anon_Data
import typings.protractorDashHttpDashMock.Anon_HEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HEAD request mock.
  */
trait Head[TResponse] extends js.Object {
  var request: Anon_HEAD
  var response: Anon_Data[TResponse]
}

object Head {
  @scala.inline
  def apply[TResponse](request: Anon_HEAD, response: Anon_Data[TResponse]): Head[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Head[TResponse]]
  }
}

