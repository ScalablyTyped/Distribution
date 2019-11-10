package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests

import typings.protractorDashHttpDashMock.Anon_Data
import typings.protractorDashHttpDashMock.Anon_JSONP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONP request mock.
  */
trait Jsonp[TResponse] extends js.Object {
  var request: Anon_JSONP
  var response: Anon_Data[TResponse]
}

object Jsonp {
  @scala.inline
  def apply[TResponse](request: Anon_JSONP, response: Anon_Data[TResponse]): Jsonp[TResponse] = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[Jsonp[TResponse]]
  }
}

