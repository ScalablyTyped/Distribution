package typings.shopifyPrime.webhookMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.json
import typings.shopifyPrime.shopifyPrimeStrings.xml
import typings.shopifyPrime.webhookTopicMod.WebhookTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends ShopifyObject {
  /**
    * The URL where the webhook should send the POST request when the event occurs.
    */
  var address: String = js.native
  /**
    * The date and time when the webhook was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * An optional array of fields which should be included in webhooks.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * The format in which the webhook should send the data. Valid values are json and xml.
    */
  var format: js.UndefOr[json | xml] = js.native
  /**
    * An optional array of namespaces for metafields that should be included in webhooks.
    */
  var metafield_namespaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * The event that will trigger the webhook.
    */
  var topic: WebhookTopic = js.native
  /**
    * The date and time when the webhook was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Webhook {
  @scala.inline
  def apply(address: String, topic: WebhookTopic): Webhook = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: WebhookTopic): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormat(value: json | xml): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMetafield_namespacesVarargs(value: String*): Self = this.set("metafield_namespaces", js.Array(value :_*))
    @scala.inline
    def setMetafield_namespaces(value: js.Array[String]): Self = this.set("metafield_namespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetafield_namespaces: Self = this.set("metafield_namespaces", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

