package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IncomingWebhookCall[T] extends js.Object {
  var headers: IncomingWebhookHttpHeaders
  var params: T
  var url: IncomingWebhookUrl
}

