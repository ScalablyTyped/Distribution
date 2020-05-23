package typings.steamClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMsgProtoBufHeader extends js.Object {
  var admin_spoofing_user: js.UndefOr[Boolean] = js.undefined
  var auth_account_flags: js.UndefOr[Double] = js.undefined
  var client_sessionid: js.UndefOr[Double] = js.undefined
  var eresult: js.UndefOr[Double] = js.undefined
  var error_message: js.UndefOr[String] = js.undefined
  var forward_to_sysid: js.UndefOr[js.Array[Double]] = js.undefined
  var ip: js.UndefOr[Double] = js.undefined
  var is_from_external_source: js.UndefOr[Boolean] = js.undefined
  var jobid_source: js.UndefOr[String] = js.undefined
  var jobid_target: js.UndefOr[String] = js.undefined
  var messageid: js.UndefOr[String] = js.undefined
  var publisher_group_id: js.UndefOr[Double] = js.undefined
  var routing_appid: js.UndefOr[Double] = js.undefined
  var seq_num: js.UndefOr[Double] = js.undefined
  var steamid: js.UndefOr[String] = js.undefined
  var sysid: js.UndefOr[Double] = js.undefined
  var target_job_name: js.UndefOr[String] = js.undefined
  var token_source: js.UndefOr[Double] = js.undefined
  var trace_tag: js.UndefOr[String] = js.undefined
  var transport_error: js.UndefOr[Double] = js.undefined
  var webapi_key_id: js.UndefOr[Double] = js.undefined
}

object CMsgProtoBufHeader {
  @scala.inline
  def apply(
    admin_spoofing_user: js.UndefOr[Boolean] = js.undefined,
    auth_account_flags: js.UndefOr[Double] = js.undefined,
    client_sessionid: js.UndefOr[Double] = js.undefined,
    eresult: js.UndefOr[Double] = js.undefined,
    error_message: String = null,
    forward_to_sysid: js.Array[Double] = null,
    ip: js.UndefOr[Double] = js.undefined,
    is_from_external_source: js.UndefOr[Boolean] = js.undefined,
    jobid_source: String = null,
    jobid_target: String = null,
    messageid: String = null,
    publisher_group_id: js.UndefOr[Double] = js.undefined,
    routing_appid: js.UndefOr[Double] = js.undefined,
    seq_num: js.UndefOr[Double] = js.undefined,
    steamid: String = null,
    sysid: js.UndefOr[Double] = js.undefined,
    target_job_name: String = null,
    token_source: js.UndefOr[Double] = js.undefined,
    trace_tag: String = null,
    transport_error: js.UndefOr[Double] = js.undefined,
    webapi_key_id: js.UndefOr[Double] = js.undefined
  ): CMsgProtoBufHeader = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin_spoofing_user)) __obj.updateDynamic("admin_spoofing_user")(admin_spoofing_user.get.asInstanceOf[js.Any])
    if (!js.isUndefined(auth_account_flags)) __obj.updateDynamic("auth_account_flags")(auth_account_flags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_sessionid)) __obj.updateDynamic("client_sessionid")(client_sessionid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eresult)) __obj.updateDynamic("eresult")(eresult.get.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    if (forward_to_sysid != null) __obj.updateDynamic("forward_to_sysid")(forward_to_sysid.asInstanceOf[js.Any])
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_from_external_source)) __obj.updateDynamic("is_from_external_source")(is_from_external_source.get.asInstanceOf[js.Any])
    if (jobid_source != null) __obj.updateDynamic("jobid_source")(jobid_source.asInstanceOf[js.Any])
    if (jobid_target != null) __obj.updateDynamic("jobid_target")(jobid_target.asInstanceOf[js.Any])
    if (messageid != null) __obj.updateDynamic("messageid")(messageid.asInstanceOf[js.Any])
    if (!js.isUndefined(publisher_group_id)) __obj.updateDynamic("publisher_group_id")(publisher_group_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(routing_appid)) __obj.updateDynamic("routing_appid")(routing_appid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seq_num)) __obj.updateDynamic("seq_num")(seq_num.get.asInstanceOf[js.Any])
    if (steamid != null) __obj.updateDynamic("steamid")(steamid.asInstanceOf[js.Any])
    if (!js.isUndefined(sysid)) __obj.updateDynamic("sysid")(sysid.get.asInstanceOf[js.Any])
    if (target_job_name != null) __obj.updateDynamic("target_job_name")(target_job_name.asInstanceOf[js.Any])
    if (!js.isUndefined(token_source)) __obj.updateDynamic("token_source")(token_source.get.asInstanceOf[js.Any])
    if (trace_tag != null) __obj.updateDynamic("trace_tag")(trace_tag.asInstanceOf[js.Any])
    if (!js.isUndefined(transport_error)) __obj.updateDynamic("transport_error")(transport_error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webapi_key_id)) __obj.updateDynamic("webapi_key_id")(webapi_key_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgProtoBufHeader]
  }
}

