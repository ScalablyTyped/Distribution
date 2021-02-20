package typings.sparkpost.anon

import typings.sparkpost.mod.Callback
import typings.sparkpost.mod.Response
import typings.sparkpost.mod.ResultsCallback
import typings.sparkpost.mod.ResultsPromise
import typings.sparkpost.mod.UpdateWebhook
import typings.sparkpost.mod.Webhook
import typings.sparkpost.mod.WebhookLinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBatchStatus extends StObject {
  
  /**
    * Create a new webhook
    *
    * @param options a hash of [webhook attributes]{@link https://developers.sparkpost.com/api/webhooks#header-webhooks-object-properties}
    * @returns The webhook id results
    */
  def create(options: Webhook): ResultsPromise[WebhookLinksidstring] = js.native
  /**
    * Create a new webhook
    *
    * @param options a hash of [webhook attributes]{@link https://developers.sparkpost.com/api/webhooks#header-webhooks-object-properties}
    * @param callback The request callback with webhook id results
    */
  def create(options: Webhook, callback: ResultsCallback[WebhookLinksidstring]): Unit = js.native
  
  /**
    * Delete an existing webhook.
    *
    * @param id The id of the webhook to delete
    */
  def delete(id: String): js.Promise[Unit] = js.native
  /**
    * Delete an existing webhook
    * @param id The webhook id
    * @param callback The request callback
    */
  def delete(id: String, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Retrieve details about a specified webhook by its id
    *
    * @param id The id of the webhook to get
    * @param [options] the timezone to use for the last_successful and last_failure properties
    * @returns The RelayWebhook results
    */
  def get(id: String): ResultsPromise[WebhookLinks with Webhook] = js.native
  /**
    * Retrieve details about a specified webhook by its id
    *
    * @param id The id of the webhook to get
    * @param callback The request callback with RelayWebhook results
    */
  def get(id: String, callback: ResultsCallback[WebhookLinks with Webhook]): Unit = js.native
  def get(id: String, options: Timezone): ResultsPromise[WebhookLinks with Webhook] = js.native
  /**
    * Retrieve details about a specified webhook by its id
    *
    * @param id The id of the webhook to get
    * @param options Object containing id and optional timezone
    * @param callback The request callback with RelayWebhook results
    */
  def get(id: String, options: Timezone, callback: ResultsCallback[WebhookLinks with Webhook]): Unit = js.native
  
  /**
    * Gets recent status information about a webhook.
    *
    * @param id The id of the webhook
    * @param callback The request callback with status results
    */
  def getBatchStatus(id: String, callback: ResultsCallback[js.Array[Attempts]]): Unit = js.native
  /**
    * Gets recent status information about a webhook.
    *
    * @param id The id of the webhook
    * @param Maximum number of results to return. Defaults to 1000
    * @returns The status results
    */
  def getBatchStatus(id: String, options: Limit): ResultsPromise[js.Array[Attempts]] = js.native
  /**
    * Gets recent status information about a webhook.
    *
    * @param id The id of the webhook
    * @param options  An optional limit that specifies the maximum number of results to return. Defaults to 1000
    * @param callback The request callback with status results
    */
  def getBatchStatus(id: String, options: Limit, callback: ResultsCallback[js.Array[Attempts]]): Unit = js.native
  
  /**
    * Lists descriptions of the events, event types, and event fields that could be included in a Webhooks post to your target URL.
    *
    * @returns The documentation results
    */
  def getDocumentation(): ResultsPromise[_] = js.native
  /**
    * Lists descriptions of the events, event types, and event fields that could be included in a Webhooks post to your target URL.
    * @param callback The request callback containing documentation results
    */
  def getDocumentation(callback: ResultsCallback[_]): Unit = js.native
  
  /**
    * List an example of the event data that will be posted by a Webhook for the specified events.
    *
    * @param options [event types]{@link https://support.sparkpost.com/customer/portal/articles/1976204} for which to get a sample payload
    * Default: all event types returned
    */
  def getSamples(): js.Promise[Response[_]] = js.native
  /**
    * List an example of the event data that will be posted by a Webhook for the specified events.
    * @param callback The request callback containing examples
    */
  def getSamples(callback: Callback[_]): Unit = js.native
  def getSamples(options: Events): js.Promise[Response[_]] = js.native
  /**
    * List an example of the event data that will be posted by a Webhook for the specified events.
    * @param options The optional event name
    * @param callback The request callback containing examples
    */
  def getSamples(options: Events, callback: Callback[_]): Unit = js.native
  
  /**
    * List currently existing webhooks.the timezone to use for the last_successful and last_failure properties | Default: UTC
    *
    */
  def list(): ResultsPromise[js.Array[WebhookLinks with Webhook]] = js.native
  /**
    * List currently existing webhooks.
    * @param callback The request callback with RelayWebhook results array
    */
  def list(callback: ResultsCallback[js.Array[WebhookLinks with Webhook]]): Unit = js.native
  def list(options: Timezone): ResultsPromise[js.Array[WebhookLinks with Webhook]] = js.native
  /**
    * List currently existing webhooks.
    * @param options Object containing optional timezone
    * @param callback The request callback with RelayWebhook results array
    */
  def list(options: Timezone, callback: ResultsCallback[js.Array[WebhookLinks with Webhook]]): Unit = js.native
  
  /**
    * Update an existing webhook
    *
    */
  def update(id: String, options: UpdateWebhook): ResultsPromise[WebhookLinksidstring] = js.native
  /**
    * Update an existing webhook
    * @param id the id of the webhook to update
    * @param options A hash of [webhook attribues]{@link https://developers.sparkpost.com/api/webhooks#header-webhooks-object-properties}
    * @param callback The request callback with webhook id results
    */
  def update(id: String, options: UpdateWebhook, callback: ResultsCallback[WebhookLinksidstring]): Unit = js.native
  
  /**
    * Sends an example message event batch from the Webhook API to the target URL.
    *
    * @param id The id of the webhook to validate
    * @param options The message (payload) to send to the webhook consumer
    * @returns The validation results
    */
  def validate(id: String, options: MessageAny): ResultsPromise[Msg] = js.native
  /**
    * Sends an example message event batch from the Webhook API to the target URL
    *
    * @param id The id of the webhook to validate
    * @param options the message (payload) to send to the webhook consumer
    * @param callback The request callback with validation results
    */
  def validate(id: String, options: MessageAny, callback: ResultsCallback[Msg]): Unit = js.native
}
