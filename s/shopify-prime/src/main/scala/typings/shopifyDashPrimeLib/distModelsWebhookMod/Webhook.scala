package typings
package shopifyDashPrimeLib.distModelsWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The URL where the webhook should send the POST request when the event occurs.
    */
  var address: java.lang.String
  /**
    * The date and time when the webhook was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional array of fields which should be included in webhooks.
    */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The format in which the webhook should send the data. Valid values are json and xml.
    */
  var format: js.UndefOr[
    shopifyDashPrimeLib.shopifyDashPrimeLibStrings.json | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.xml
  ] = js.undefined
  /**
    * An optional array of namespaces for metafields that should be included in webhooks.
    */
  var metafield_namespaces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The event that will trigger the webhook.
    */
  var topic: shopifyDashPrimeLib.distEnumsWebhookUnderscoreTopicMod.WebhookTopic
  /**
    * The date and time when the webhook was updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

