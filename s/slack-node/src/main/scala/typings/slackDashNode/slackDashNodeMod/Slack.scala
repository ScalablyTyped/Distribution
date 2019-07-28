package typings.slackDashNode.slackDashNodeMod

import typings.slackDashNode.Anon_Iconemoji
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slack extends js.Object {
  var apiMode: Boolean = js.native
  var domain: String = js.native
  var maxAttempts: Double = js.native
  var timeout: Double = js.native
  var token: String = js.native
  var url: String = js.native
  def api(method: String, callback: js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]): this.type = js.native
  def api(
    method: String,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]
  ): this.type = js.native
  def composeUrl(): String = js.native
  def detectEmoji(emoji: String): Anon_Iconemoji = js.native
  def setWebhook(url: String): this.type = js.native
  def webhook(
    options: WebhookOptions,
    callback: js.Function2[/* err */ js.Any, /* response */ WebhookResponse, Unit]
  ): Unit = js.native
}

