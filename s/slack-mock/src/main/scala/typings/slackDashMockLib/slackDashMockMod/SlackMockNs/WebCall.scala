package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebCall[T] extends js.Object {
  var headers: WebHttpHeaders
  var params: T
  var url: WebUrl
}

object WebCall {
  @scala.inline
  def apply[T](headers: WebHttpHeaders, params: T, url: WebUrl): WebCall[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebCall[T]]
  }
}

