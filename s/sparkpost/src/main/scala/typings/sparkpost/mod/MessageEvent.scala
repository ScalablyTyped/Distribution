package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent extends js.Object {
  /** Classification code for a given message (see [Bounce Classification Codes](https://support.sparkpost.com/customer/portal/articles/1929896)) */
  var bounce_class: String = js.native
  /** Campaign of which this message was a part */
  var campaign_id: String = js.native
  /** SparkPost-customer identifier through which this message was sent */
  var customer_id: String = js.native
  /** Protocol by which SparkPost delivered this message */
  var delv_method: String = js.native
  /** Token of the device / application targeted by this PUSH notification message. Applies only when delv_method is gcm or apn. */
  var device_token: String = js.native
  /** Error code by which the remote server described a failed delivery attempt */
  var error_code: String = js.native
  /** IP address of the host to which SparkPost delivered this message; in engagement events, the IP address of the host where the HTTP request originated */
  var ip_address: String = js.native
  /** SparkPost-cluster-wide unique identifier for this message */
  var message_id: String = js.native
  /** Sender address used on this message"s SMTP envelope */
  var msg_from: String = js.native
  /** Message"s size in bytes */
  var msg_size: String = js.native
  /** Number of failed attempts before this message was successfully delivered; when the first attempt succeeds, zero */
  var num_retries: String = js.native
  /** Unmodified, exact response returned by the remote server due to a failed delivery attempt */
  var raw_reason: String = js.native
  /** Metadata describing the message recipient */
  var rcpt_meta: js.Any = js.native
  /** Tags applied to the message which generated this event */
  var rcpt_tags: js.Array[String] = js.native
  /** Recipient address used on this message"s SMTP envelope */
  var rcpt_to: String = js.native
  /** Indicates that a recipient address appeared in the Cc or Bcc header or the archive JSON array */
  var rcpt_type: String = js.native
  /** Canonicalized text of the response returned by the remote server due to a failed delivery attempt */
  var reason: String = js.native
  /** Domain receiving this message */
  var routing_domain: String = js.native
  /** Subject line from the email header */
  var subject: String = js.native
  /** Slug of the template used to construct this message */
  var template_id: String = js.native
  /** Version of the template used to construct this message */
  var template_version: String = js.native
  /** Event date and time formatted as: YYYY-MM-DDTHH:MM:SS.SSS±hh:mm */
  var timestamp: String = js.native
  /** Transmission which originated this message */
  var transmission_id: String = js.native
  /** Type of event this record describes */
  var `type`: String = js.native
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
    val __obj = js.Dynamic.literal(bounce_class = bounce_class.asInstanceOf[js.Any], campaign_id = campaign_id.asInstanceOf[js.Any], customer_id = customer_id.asInstanceOf[js.Any], delv_method = delv_method.asInstanceOf[js.Any], device_token = device_token.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], msg_from = msg_from.asInstanceOf[js.Any], msg_size = msg_size.asInstanceOf[js.Any], num_retries = num_retries.asInstanceOf[js.Any], raw_reason = raw_reason.asInstanceOf[js.Any], rcpt_meta = rcpt_meta.asInstanceOf[js.Any], rcpt_tags = rcpt_tags.asInstanceOf[js.Any], rcpt_to = rcpt_to.asInstanceOf[js.Any], rcpt_type = rcpt_type.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], routing_domain = routing_domain.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], template_version = template_version.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transmission_id = transmission_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  implicit class MessageEventOps[Self <: MessageEvent] (val x: Self) extends AnyVal {
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
    def setBounce_class(value: String): Self = this.set("bounce_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCampaign_id(value: String): Self = this.set("campaign_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer_id(value: String): Self = this.set("customer_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelv_method(value: String): Self = this.set("delv_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice_token(value: String): Self = this.set("device_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_code(value: String): Self = this.set("error_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp_address(value: String): Self = this.set("ip_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg_from(value: String): Self = this.set("msg_from", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg_size(value: String): Self = this.set("msg_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum_retries(value: String): Self = this.set("num_retries", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_reason(value: String): Self = this.set("raw_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setRcpt_meta(value: js.Any): Self = this.set("rcpt_meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setRcpt_tagsVarargs(value: String*): Self = this.set("rcpt_tags", js.Array(value :_*))
    @scala.inline
    def setRcpt_tags(value: js.Array[String]): Self = this.set("rcpt_tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setRcpt_to(value: String): Self = this.set("rcpt_to", value.asInstanceOf[js.Any])
    @scala.inline
    def setRcpt_type(value: String): Self = this.set("rcpt_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouting_domain(value: String): Self = this.set("routing_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_version(value: String): Self = this.set("template_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransmission_id(value: String): Self = this.set("transmission_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

