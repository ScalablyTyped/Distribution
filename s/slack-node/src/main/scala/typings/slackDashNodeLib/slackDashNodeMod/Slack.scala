package typings
package slackDashNodeLib.slackDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slack extends js.Object {
  var apiMode: scala.Boolean = js.native
  var domain: java.lang.String = js.native
  var maxAttempts: scala.Double = js.native
  var timeout: scala.Double = js.native
  var token: java.lang.String = js.native
  var url: java.lang.String = js.native
  def api(
    method: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, scala.Unit]
  ): this.type = js.native
  def api(
    method: java.lang.String,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, scala.Unit]
  ): this.type = js.native
  def composeUrl(): java.lang.String = js.native
  def detectEmoji(emoji: java.lang.String): slackDashNodeLib.Anon_Iconemoji = js.native
  def setWebhook(url: java.lang.String): this.type = js.native
  def webhook(
    options: WebhookOptions,
    callback: js.Function2[/* err */ js.Any, /* response */ WebhookResponse, scala.Unit]
  ): scala.Unit = js.native
}

