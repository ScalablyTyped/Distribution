package typings.shopifyPrime.webhookMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.json
import typings.shopifyPrime.shopifyPrimeStrings.xml
import typings.shopifyPrime.webhookTopicMod.WebhookTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends ShopifyObject {
  /**
    * The URL where the webhook should send the POST request when the event occurs.
    */
  var address: String
  /**
    * The date and time when the webhook was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * An optional array of fields which should be included in webhooks.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The format in which the webhook should send the data. Valid values are json and xml.
    */
  var format: js.UndefOr[json | xml] = js.undefined
  /**
    * An optional array of namespaces for metafields that should be included in webhooks.
    */
  var metafield_namespaces: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The event that will trigger the webhook.
    */
  var topic: WebhookTopic
  /**
    * The date and time when the webhook was updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
}

object Webhook {
  @scala.inline
  def apply(
    address: String,
    topic: WebhookTopic,
    admin_graphql_api_id: String = null,
    created_at: String = null,
    fields: js.Array[String] = null,
    format: json | xml = null,
    id: js.UndefOr[Double] = js.undefined,
    metafield_namespaces: js.Array[String] = null,
    updated_at: String = null
  ): Webhook = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (metafield_namespaces != null) __obj.updateDynamic("metafield_namespaces")(metafield_namespaces.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
}

