package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IncomingWebhooks[T] extends js.Object {
  var calls: js.Array[IncomingWebhookCall[T]]
  def addResponse(opts: IncomingWebhookOptions[T]): scala.Unit
  def reset(): scala.Unit
}

