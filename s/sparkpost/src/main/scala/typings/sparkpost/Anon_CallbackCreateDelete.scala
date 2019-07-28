package typings.sparkpost

import typings.sparkpost.sparkpostMod.Callback
import typings.sparkpost.sparkpostMod.RelayWebhook
import typings.sparkpost.sparkpostMod.ResultsCallback
import typings.sparkpost.sparkpostMod.ResultsPromise
import typings.sparkpost.sparkpostMod.UpdateRelayWebhook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCreateDelete extends js.Object {
  /**
    * Create a relay webhook by providing a relay webhooks object as the POST request body.
    * @param options The create options
    * @returns Promise The webhook id results
    */
  def create(options: RelayWebhook): ResultsPromise[Anon_Id] = js.native
  /**
    * Create a relay webhook by providing a relay webhooks object as the POST request body.
    * @param options The create options
    * @param callback The request callback with webhook id results
    */
  def create(options: RelayWebhook, callback: ResultsCallback[Anon_Id]): Unit = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @returns Promise void
    */
  def delete(relayWebhookId: String): js.Promise[Unit] = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @param callback The request callback
    */
  def delete(relayWebhookId: String, callback: Callback[Unit]): Unit = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @returns Promise The RelayWebhook results
    */
  def get(relayWebhookId: String): ResultsPromise[RelayWebhook] = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @param callback The request callback with RelayWebhook results
    */
  def get(relayWebhookId: String, callback: ResultsCallback[RelayWebhook]): Unit = js.native
  /**
    * List all your relay webhooks.
    * @returns Promise The RelayWebhook results array
    */
  def list(): ResultsPromise[js.Array[RelayWebhook]] = js.native
  /**
    * List all your relay webhooks.
    * @param callback The request callback with RelayWebhook results array
    */
  def list(callback: ResultsCallback[js.Array[RelayWebhook]]): Unit = js.native
  /**
    * Update a relay webhook by specifying the webhook ID in the URI path.
    * @param options The update options
    * @returns Promise The webhook id results
    */
  def update(id: String, options: UpdateRelayWebhook): ResultsPromise[Anon_Id] = js.native
  /**
    * Update a relay webhook by specifying the webhook ID in the URI path.
    * @param options The update options
    * @param callback The request callback with webhook id results
    */
  def update(id: String, options: UpdateRelayWebhook, callback: ResultsCallback[Anon_Id]): Unit = js.native
}

