package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCall[T] extends js.Object {
  var headers: EventHttpHeaders
  var params: T
  var statusCode: scala.Double
  var url: EventUrl
}

object EventCall {
  @scala.inline
  def apply[T](headers: EventHttpHeaders, params: T, statusCode: scala.Double, url: EventUrl): EventCall[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCall[T]]
  }
}

