package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  /** Classification code for a given message (see [Bounce Classification Codes](https://support.sparkpost.com/customer/portal/articles/1929896)) */
  var bounce_class: java.lang.String
  /** Campaign of which this message was a part */
  var campaign_id: java.lang.String
  /** SparkPost-customer identifier through which this message was sent */
  var customer_id: java.lang.String
  /** Protocol by which SparkPost delivered this message */
  var delv_method: java.lang.String
  /** Token of the device / application targeted by this PUSH notification message. Applies only when delv_method is gcm or apn. */
  var device_token: java.lang.String
  /** Error code by which the remote server described a failed delivery attempt */
  var error_code: java.lang.String
  /** IP address of the host to which SparkPost delivered this message; in engagement events, the IP address of the host where the HTTP request originated */
  var ip_address: java.lang.String
  /** SparkPost-cluster-wide unique identifier for this message */
  var message_id: java.lang.String
  /** Sender address used on this message"s SMTP envelope */
  var msg_from: java.lang.String
  /** Message"s size in bytes */
  var msg_size: java.lang.String
  /** Number of failed attempts before this message was successfully delivered; when the first attempt succeeds, zero */
  var num_retries: java.lang.String
  /** Unmodified, exact response returned by the remote server due to a failed delivery attempt */
  var raw_reason: java.lang.String
  /** Metadata describing the message recipient */
  var rcpt_meta: js.Any
  /** Tags applied to the message which generated this event */
  var rcpt_tags: js.Array[java.lang.String]
  /** Recipient address used on this message"s SMTP envelope */
  var rcpt_to: java.lang.String
  /** Indicates that a recipient address appeared in the Cc or Bcc header or the archive JSON array */
  var rcpt_type: java.lang.String
  /** Canonicalized text of the response returned by the remote server due to a failed delivery attempt */
  var reason: java.lang.String
  /** Domain receiving this message */
  var routing_domain: java.lang.String
  /** Subject line from the email header */
  var subject: java.lang.String
  /** Slug of the template used to construct this message */
  var template_id: java.lang.String
  /** Version of the template used to construct this message */
  var template_version: java.lang.String
  /** Event date and time formatted as: YYYY-MM-DDTHH:MM:SS.SSS±hh:mm */
  var timestamp: java.lang.String
  /** Transmission which originated this message */
  var transmission_id: java.lang.String
  /** Type of event this record describes */
  var `type`: java.lang.String
}

object MessageEvent {
  @scala.inline
  def apply(
    bounce_class: java.lang.String,
    campaign_id: java.lang.String,
    customer_id: java.lang.String,
    delv_method: java.lang.String,
    device_token: java.lang.String,
    error_code: java.lang.String,
    ip_address: java.lang.String,
    message_id: java.lang.String,
    msg_from: java.lang.String,
    msg_size: java.lang.String,
    num_retries: java.lang.String,
    raw_reason: java.lang.String,
    rcpt_meta: js.Any,
    rcpt_tags: js.Array[java.lang.String],
    rcpt_to: java.lang.String,
    rcpt_type: java.lang.String,
    reason: java.lang.String,
    routing_domain: java.lang.String,
    subject: java.lang.String,
    template_id: java.lang.String,
    template_version: java.lang.String,
    timestamp: java.lang.String,
    transmission_id: java.lang.String,
    `type`: java.lang.String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(bounce_class = bounce_class, campaign_id = campaign_id, customer_id = customer_id, delv_method = delv_method, device_token = device_token, error_code = error_code, ip_address = ip_address, message_id = message_id, msg_from = msg_from, msg_size = msg_size, num_retries = num_retries, raw_reason = raw_reason, rcpt_meta = rcpt_meta, rcpt_tags = rcpt_tags, rcpt_to = rcpt_to, rcpt_type = rcpt_type, reason = reason, routing_domain = routing_domain, subject = subject, template_id = template_id, template_version = template_version, timestamp = timestamp, transmission_id = transmission_id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageEvent]
  }
}

