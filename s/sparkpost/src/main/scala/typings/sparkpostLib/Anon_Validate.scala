package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Validate extends js.Object {
  /**
           * Create a new webhook
           *
           * @param options a hash of [webhook attributes]{@link https://developers.sparkpost.com/api/webhooks#header-webhooks-object-properties}
           * @returns The webhook id results
           */
  def create(options: sparkpostLib.sparkpostMod.SparkPostNs.Webhook): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with Anon_Id] = js.native
  /**
           * Create a new webhook
           *
           * @param options a hash of [webhook attributes]{@link https://developers.sparkpost.com/api/webhooks#header-webhooks-object-properties}
           * @param callback The request callback with webhook id results
           */
  def create(
    options: sparkpostLib.sparkpostMod.SparkPostNs.Webhook,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with Anon_Id]
  ): scala.Unit = js.native
  /**
           * Delete an existing webhook.
           *
           * @param id The id of the webhook to delete
           */
  def delete(id: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
           * Delete an existing webhook
           * @param id The webhook id
           * @param callback The request callback
           */
  def delete(id: java.lang.String, callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[scala.Unit]): scala.Unit = js.native
  /**
           * Retrieve details about a specified webhook by its id
           *
           * @param id The id of the webhook to get
           * @param [options] the timezone to use for the last_successful and last_failure properties
           * @returns The RelayWebhook results
           */
  def get(id: java.lang.String): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[
    sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
  ] = js.native
  /**
           * Retrieve details about a specified webhook by its id
           *
           * @param id The id of the webhook to get
           * @param callback The request callback with RelayWebhook results
           */
  def get(
    id: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[
      sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
    ]
  ): scala.Unit = js.native
  /**
           * Retrieve details about a specified webhook by its id
           *
           * @param id The id of the webhook to get
           * @param [options] the timezone to use for the last_successful and last_failure properties
           * @returns The RelayWebhook results
           */
  def get(id: java.lang.String, options: Anon_Timezone): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[
    sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
  ] = js.native
  /**
           * Retrieve details about a specified webhook by its id
           *
           * @param id The id of the webhook to get
           * @param options Object containing id and optional timezone
           * @param callback The request callback with RelayWebhook results
           */
  def get(
    id: java.lang.String,
    options: Anon_Timezone,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[
      sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
    ]
  ): scala.Unit = js.native
  /**
           * Gets recent status information about a webhook.
           *
           * @param id The id of the webhook
           * @param callback The request callback with status results
           */
  def getBatchStatus(
    id: java.lang.String,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[Anon_Attempts]]
  ): scala.Unit = js.native
  /**
           * Gets recent status information about a webhook.
           *
           * @param id The id of the webhook
           * @param Maximum number of results to return. Defaults to 1000
           * @returns The status results
           */
  def getBatchStatus(id: java.lang.String, options: Anon_Limit): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[js.Array[Anon_Attempts]] = js.native
  /**
           * Gets recent status information about a webhook.
           *
           * @param id The id of the webhook
           * @param options  An optional limit that specifies the maximum number of results to return. Defaults to 1000
           * @param callback The request callback with status results
           */
  def getBatchStatus(
    id: java.lang.String,
    options: Anon_Limit,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[js.Array[Anon_Attempts]]
  ): scala.Unit = js.native
  /**
           * Lists descriptions of the events, event types, and event fields that could be included in a Webhooks post to your target URL.
           *
           * @returns The documentation results
           */
  def getDocumentation(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[_] = js.native
  /**
           * Lists descriptions of the events, event types, and event fields that could be included in a Webhooks post to your target URL.
           * @param callback The request callback containing documentation results
           */
  def getDocumentation(callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[_]): scala.Unit = js.native
  /**
           * List an example of the event data that will be posted by a Webhook for the specified events.
           *
           * @param options [event types]{@link https://support.sparkpost.com/customer/portal/articles/1976204} for which to get a sample payload
           * Default: all event types returned
           */
  def getSamples(): stdLib.Promise[sparkpostLib.sparkpostMod.SparkPostNs.Response[_]] = js.native
  /**
           * List an example of the event data that will be posted by a Webhook for the specified events.
           * @param callback The request callback containing examples
           */
  def getSamples(callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[_]): scala.Unit = js.native
  /**
           * List an example of the event data that will be posted by a Webhook for the specified events.
           *
           * @param options [event types]{@link https://support.sparkpost.com/customer/portal/articles/1976204} for which to get a sample payload
           * Default: all event types returned
           */
  def getSamples(options: Anon_Events): stdLib.Promise[sparkpostLib.sparkpostMod.SparkPostNs.Response[_]] = js.native
  /**
           * List an example of the event data that will be posted by a Webhook for the specified events.
           * @param options The optional event name
           * @param callback The request callback containing examples
           */
  def getSamples(options: Anon_Events, callback: sparkpostLib.sparkpostMod.SparkPostNs.Callback[_]): scala.Unit = js.native
  /**
           * List currently existing webhooks.the timezone to use for the last_successful and last_failure properties | Default: UTC
           *
           */
  def list(): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[
    js.Array[
      sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
    ]
  ] = js.native
  /**
           * List currently existing webhooks.
           * @param callback The request callback with RelayWebhook results array
           */
  def list(
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[
      js.Array[
        sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
      ]
    ]
  ): scala.Unit = js.native
  /**
           * List currently existing webhooks.the timezone to use for the last_successful and last_failure properties | Default: UTC
           *
           */
  def list(options: Anon_Timezone): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[
    js.Array[
      sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
    ]
  ] = js.native
  /**
           * List currently existing webhooks.
           * @param options Object containing optional timezone
           * @param callback The request callback with RelayWebhook results array
           */
  def list(
    options: Anon_Timezone,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[
      js.Array[
        sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with sparkpostLib.sparkpostMod.SparkPostNs.Webhook
      ]
    ]
  ): scala.Unit = js.native
  /**
           * Update an existing webhook
           *
           */
  def update(id: java.lang.String, options: sparkpostLib.sparkpostMod.SparkPostNs.UpdateWebhook): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with Anon_Id] = js.native
  /**
           * Update an existing webhook
           * @param id the id of the webhook to update
           * @param options A hash of [webhook attribues]{@link https://developers.sparkpost.com/api/webhooks#header-webhooks-object-properties}
           * @param callback The request callback with webhook id results
           */
  def update(
    id: java.lang.String,
    options: sparkpostLib.sparkpostMod.SparkPostNs.UpdateWebhook,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[sparkpostLib.sparkpostMod.SparkPostNs.WebhookLinks with Anon_Id]
  ): scala.Unit = js.native
  /**
           * Sends an example message event batch from the Webhook API to the target URL.
           *
           * @param id The id of the webhook to validate
           * @param options The message (payload) to send to the webhook consumer
           * @returns The validation results
           */
  def validate(id: java.lang.String, options: Anon_Message): sparkpostLib.sparkpostMod.SparkPostNs.ResultsPromise[Anon_Msg] = js.native
  /**
           * Sends an example message event batch from the Webhook API to the target URL
           *
           * @param id The id of the webhook to validate
           * @param options the message (payload) to send to the webhook consumer
           * @param callback The request callback with validation results
           */
  def validate(
    id: java.lang.String,
    options: Anon_Message,
    callback: sparkpostLib.sparkpostMod.SparkPostNs.ResultsCallback[Anon_Msg]
  ): scala.Unit = js.native
}

