package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMsgProtoBufHeader extends js.Object {
  var admin_spoofing_user: js.UndefOr[scala.Boolean] = js.undefined
  var auth_account_flags: js.UndefOr[scala.Double] = js.undefined
  var client_sessionid: js.UndefOr[scala.Double] = js.undefined
  var eresult: js.UndefOr[scala.Double] = js.undefined
  var error_message: js.UndefOr[java.lang.String] = js.undefined
  var forward_to_sysid: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var ip: js.UndefOr[scala.Double] = js.undefined
  var is_from_external_source: js.UndefOr[scala.Boolean] = js.undefined
  var jobid_source: js.UndefOr[java.lang.String] = js.undefined
  var jobid_target: js.UndefOr[java.lang.String] = js.undefined
  var messageid: js.UndefOr[java.lang.String] = js.undefined
  var publisher_group_id: js.UndefOr[scala.Double] = js.undefined
  var routing_appid: js.UndefOr[scala.Double] = js.undefined
  var seq_num: js.UndefOr[scala.Double] = js.undefined
  var steamid: js.UndefOr[java.lang.String] = js.undefined
  var sysid: js.UndefOr[scala.Double] = js.undefined
  var target_job_name: js.UndefOr[java.lang.String] = js.undefined
  var token_source: js.UndefOr[scala.Double] = js.undefined
  var trace_tag: js.UndefOr[java.lang.String] = js.undefined
  var transport_error: js.UndefOr[scala.Double] = js.undefined
  var webapi_key_id: js.UndefOr[scala.Double] = js.undefined
}

object CMsgProtoBufHeader {
  @scala.inline
  def apply(
    admin_spoofing_user: js.UndefOr[scala.Boolean] = js.undefined,
    auth_account_flags: scala.Int | scala.Double = null,
    client_sessionid: scala.Int | scala.Double = null,
    eresult: scala.Int | scala.Double = null,
    error_message: java.lang.String = null,
    forward_to_sysid: js.Array[scala.Double] = null,
    ip: scala.Int | scala.Double = null,
    is_from_external_source: js.UndefOr[scala.Boolean] = js.undefined,
    jobid_source: java.lang.String = null,
    jobid_target: java.lang.String = null,
    messageid: java.lang.String = null,
    publisher_group_id: scala.Int | scala.Double = null,
    routing_appid: scala.Int | scala.Double = null,
    seq_num: scala.Int | scala.Double = null,
    steamid: java.lang.String = null,
    sysid: scala.Int | scala.Double = null,
    target_job_name: java.lang.String = null,
    token_source: scala.Int | scala.Double = null,
    trace_tag: java.lang.String = null,
    transport_error: scala.Int | scala.Double = null,
    webapi_key_id: scala.Int | scala.Double = null
  ): CMsgProtoBufHeader = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin_spoofing_user)) __obj.updateDynamic("admin_spoofing_user")(admin_spoofing_user)
    if (auth_account_flags != null) __obj.updateDynamic("auth_account_flags")(auth_account_flags.asInstanceOf[js.Any])
    if (client_sessionid != null) __obj.updateDynamic("client_sessionid")(client_sessionid.asInstanceOf[js.Any])
    if (eresult != null) __obj.updateDynamic("eresult")(eresult.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    if (forward_to_sysid != null) __obj.updateDynamic("forward_to_sysid")(forward_to_sysid)
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (!js.isUndefined(is_from_external_source)) __obj.updateDynamic("is_from_external_source")(is_from_external_source)
    if (jobid_source != null) __obj.updateDynamic("jobid_source")(jobid_source)
    if (jobid_target != null) __obj.updateDynamic("jobid_target")(jobid_target)
    if (messageid != null) __obj.updateDynamic("messageid")(messageid)
    if (publisher_group_id != null) __obj.updateDynamic("publisher_group_id")(publisher_group_id.asInstanceOf[js.Any])
    if (routing_appid != null) __obj.updateDynamic("routing_appid")(routing_appid.asInstanceOf[js.Any])
    if (seq_num != null) __obj.updateDynamic("seq_num")(seq_num.asInstanceOf[js.Any])
    if (steamid != null) __obj.updateDynamic("steamid")(steamid)
    if (sysid != null) __obj.updateDynamic("sysid")(sysid.asInstanceOf[js.Any])
    if (target_job_name != null) __obj.updateDynamic("target_job_name")(target_job_name)
    if (token_source != null) __obj.updateDynamic("token_source")(token_source.asInstanceOf[js.Any])
    if (trace_tag != null) __obj.updateDynamic("trace_tag")(trace_tag)
    if (transport_error != null) __obj.updateDynamic("transport_error")(transport_error.asInstanceOf[js.Any])
    if (webapi_key_id != null) __obj.updateDynamic("webapi_key_id")(webapi_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgProtoBufHeader]
  }
}

