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

object Webhook {
  @scala.inline
  def apply(
    address: java.lang.String,
    topic: shopifyDashPrimeLib.distEnumsWebhookUnderscoreTopicMod.WebhookTopic,
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    fields: js.Array[java.lang.String] = null,
    format: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.json | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.xml = null,
    id: scala.Int | scala.Double = null,
    metafield_namespaces: js.Array[java.lang.String] = null,
    updated_at: java.lang.String = null
  ): Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metafield_namespaces != null) __obj.updateDynamic("metafield_namespaces")(metafield_namespaces)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[Webhook]
  }
}

