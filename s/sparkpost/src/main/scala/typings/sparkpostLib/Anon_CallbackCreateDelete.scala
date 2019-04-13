package typings
package sparkpostLib

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
  def create(options: sparkpostLib.sparkpostMod.RelayWebhook): sparkpostLib.sparkpostMod.ResultsPromise[Anon_Id] = js.native
  /**
    * Create a relay webhook by providing a relay webhooks object as the POST request body.
    * @param options The create options
    * @param callback The request callback with webhook id results
    */
  def create(
    options: sparkpostLib.sparkpostMod.RelayWebhook,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[Anon_Id]
  ): scala.Unit = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @returns Promise void
    */
  def delete(relayWebhookId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @param callback The request callback
    */
  def delete(relayWebhookId: java.lang.String, callback: sparkpostLib.sparkpostMod.Callback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @returns Promise The RelayWebhook results
    */
  def get(relayWebhookId: java.lang.String): sparkpostLib.sparkpostMod.ResultsPromise[sparkpostLib.sparkpostMod.RelayWebhook] = js.native
  /**
    * Delete a relay webhook by specifying the webhook ID in the URI path.
    * @param relayWebhookId The webhook id
    * @param callback The request callback with RelayWebhook results
    */
  def get(
    relayWebhookId: java.lang.String,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[sparkpostLib.sparkpostMod.RelayWebhook]
  ): scala.Unit = js.native
  /**
    * List all your relay webhooks.
    * @returns Promise The RelayWebhook results array
    */
  def list(): sparkpostLib.sparkpostMod.ResultsPromise[js.Array[sparkpostLib.sparkpostMod.RelayWebhook]] = js.native
  /**
    * List all your relay webhooks.
    * @param callback The request callback with RelayWebhook results array
    */
  def list(
    callback: sparkpostLib.sparkpostMod.ResultsCallback[js.Array[sparkpostLib.sparkpostMod.RelayWebhook]]
  ): scala.Unit = js.native
  /**
    * Update a relay webhook by specifying the webhook ID in the URI path.
    * @param options The update options
    * @returns Promise The webhook id results
    */
  def update(id: java.lang.String, options: sparkpostLib.sparkpostMod.UpdateRelayWebhook): sparkpostLib.sparkpostMod.ResultsPromise[Anon_Id] = js.native
  /**
    * Update a relay webhook by specifying the webhook ID in the URI path.
    * @param options The update options
    * @param callback The request callback with webhook id results
    */
  def update(
    id: java.lang.String,
    options: sparkpostLib.sparkpostMod.UpdateRelayWebhook,
    callback: sparkpostLib.sparkpostMod.ResultsCallback[Anon_Id]
  ): scala.Unit = js.native
}

