package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  /** Classification code for a given message (see [Bounce Classification Codes](https://support.sparkpost.com/customer/portal/articles/1929896)) */
  var bounce_class: String
  /** Campaign of which this message was a part */
  var campaign_id: String
  /** SparkPost-customer identifier through which this message was sent */
  var customer_id: String
  /** Protocol by which SparkPost delivered this message */
  var delv_method: String
  /** Token of the device / application targeted by this PUSH notification message. Applies only when delv_method is gcm or apn. */
  var device_token: String
  /** Error code by which the remote server described a failed delivery attempt */
  var error_code: String
  /** IP address of the host to which SparkPost delivered this message; in engagement events, the IP address of the host where the HTTP request originated */
  var ip_address: String
  /** SparkPost-cluster-wide unique identifier for this message */
  var message_id: String
  /** Sender address used on this message"s SMTP envelope */
  var msg_from: String
  /** Message"s size in bytes */
  var msg_size: String
  /** Number of failed attempts before this message was successfully delivered; when the first attempt succeeds, zero */
  var num_retries: String
  /** Unmodified, exact response returned by the remote server due to a failed delivery attempt */
  var raw_reason: String
  /** Metadata describing the message recipient */
  var rcpt_meta: js.Any
  /** Tags applied to the message which generated this event */
  var rcpt_tags: js.Array[String]
  /** Recipient address used on this message"s SMTP envelope */
  var rcpt_to: String
  /** Indicates that a recipient address appeared in the Cc or Bcc header or the archive JSON array */
  var rcpt_type: String
  /** Canonicalized text of the response returned by the remote server due to a failed delivery attempt */
  var reason: String
  /** Domain receiving this message */
  var routing_domain: String
  /** Subject line from the email header */
  var subject: String
  /** Slug of the template used to construct this message */
  var template_id: String
  /** Version of the template used to construct this message */
  var template_version: String
  /** Event date and time formatted as: YYYY-MM-DDTHH:MM:SS.SSS±hh:mm */
  var timestamp: String
  /** Transmission which originated this message */
  var transmission_id: String
  /** Type of event this record describes */
  var `type`: String
}

object MessageEvent {
  @scala.inline
  def apply(
    bounce_class: String,
    campaign_id: String,
    customer_id: String,
    delv_method: String,
    device_token: String,
    error_code: String,
    ip_address: String,
    message_id: String,
    msg_from: String,
    msg_size: String,
    num_retries: String,
    raw_reason: String,
    rcpt_meta: js.Any,
    rcpt_tags: js.Array[String],
    rcpt_to: String,
    rcpt_type: String,
    reason: String,
    routing_domain: String,
    subject: String,
    template_id: String,
    template_version: String,
    timestamp: String,
    transmission_id: String,
    `type`: String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(bounce_class = bounce_class, campaign_id = campaign_id, customer_id = customer_id, delv_method = delv_method, device_token = device_token, error_code = error_code, ip_address = ip_address, message_id = message_id, msg_from = msg_from, msg_size = msg_size, num_retries = num_retries, raw_reason = raw_reason, rcpt_meta = rcpt_meta, rcpt_tags = rcpt_tags, rcpt_to = rcpt_to, rcpt_type = rcpt_type, reason = reason, routing_domain = routing_domain, subject = subject, template_id = template_id, template_version = template_version, timestamp = timestamp, transmission_id = transmission_id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageEvent]
  }
}

