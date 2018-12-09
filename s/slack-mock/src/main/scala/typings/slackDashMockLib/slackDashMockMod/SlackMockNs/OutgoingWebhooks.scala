package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OutgoingWebhooks[T] extends js.Object {
  var calls: js.Array[OutgoingWebhookCall[T]]
  def reset(): scala.Unit
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[scala.Unit]
}

