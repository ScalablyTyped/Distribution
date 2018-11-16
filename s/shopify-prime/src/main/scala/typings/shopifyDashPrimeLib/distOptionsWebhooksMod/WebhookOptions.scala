package typings
package shopifyDashPrimeLib.distOptionsWebhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebhookOptions extends js.Object {
  /**
       * Retrieve only webhooks that possess the URI where the webhook sends the POST request when the event occurs.
       */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Retrieve only webhooks with a given topic.
       */
  var topic: js.UndefOr[shopifyDashPrimeLib.distEnumsWebhookUnderscoreTopicMod.WebhookTopic] = js.undefined
}

