package typings.shopifyPrime

import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.DateOptions
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import typings.shopifyPrime.webhookMod.Webhook
import typings.shopifyPrime.webhooksMod.WebhookOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/webhooks", JSImport.Namespace)
@js.native
object servicesWebhooksMod extends js.Object {
  @js.native
  class Webhooks protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Gets a count of all of the shop's webhooks.
      * @param options Options for filtering the results.
      */
    def count(): js.Promise[Double] = js.native
    def count(options: WebhookOptions): js.Promise[Double] = js.native
    /**
      * Creates a new webhook.
      */
    def create(webhook: Webhook): js.Promise[Webhook] = js.native
    /**
      * Deletes the webhook with the given id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Retrieves the webhook with the given id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[Webhook] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Webhook] = js.native
    /**
      * Gets a list of up to 250 of the shop's webhooks.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Webhook]] = js.native
    def list(options: WebhookOptions with ListOptions with DateOptions with FieldOptions): js.Promise[js.Array[Webhook]] = js.native
    /**
      * Updates the webhook with the given id.
      * @param webhook The updated webhook.
      */
    def update(id: Double, webhook: Webhook): js.Promise[Webhook] = js.native
  }
  
  @js.native
  class default protected () extends Webhooks {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

