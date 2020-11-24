package typings.steamClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMsgProtoBufHeader extends js.Object {
  
  var admin_spoofing_user: js.UndefOr[Boolean] = js.native
  
  var auth_account_flags: js.UndefOr[Double] = js.native
  
  var client_sessionid: js.UndefOr[Double] = js.native
  
  var eresult: js.UndefOr[Double] = js.native
  
  var error_message: js.UndefOr[String] = js.native
  
  var forward_to_sysid: js.UndefOr[js.Array[Double]] = js.native
  
  var ip: js.UndefOr[Double] = js.native
  
  var is_from_external_source: js.UndefOr[Boolean] = js.native
  
  var jobid_source: js.UndefOr[String] = js.native
  
  var jobid_target: js.UndefOr[String] = js.native
  
  var messageid: js.UndefOr[String] = js.native
  
  var publisher_group_id: js.UndefOr[Double] = js.native
  
  var routing_appid: js.UndefOr[Double] = js.native
  
  var seq_num: js.UndefOr[Double] = js.native
  
  var steamid: js.UndefOr[String] = js.native
  
  var sysid: js.UndefOr[Double] = js.native
  
  var target_job_name: js.UndefOr[String] = js.native
  
  var token_source: js.UndefOr[Double] = js.native
  
  var trace_tag: js.UndefOr[String] = js.native
  
  var transport_error: js.UndefOr[Double] = js.native
  
  var webapi_key_id: js.UndefOr[Double] = js.native
}
object CMsgProtoBufHeader {
  
  @scala.inline
  def apply(): CMsgProtoBufHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CMsgProtoBufHeader]
  }
  
  @scala.inline
  implicit class CMsgProtoBufHeaderOps[Self <: CMsgProtoBufHeader] (val x: Self) extends AnyVal {
    
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
    def setAdmin_spoofing_user(value: Boolean): Self = this.set("admin_spoofing_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmin_spoofing_user: Self = this.set("admin_spoofing_user", js.undefined)
    
    @scala.inline
    def setAuth_account_flags(value: Double): Self = this.set("auth_account_flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth_account_flags: Self = this.set("auth_account_flags", js.undefined)
    
    @scala.inline
    def setClient_sessionid(value: Double): Self = this.set("client_sessionid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_sessionid: Self = this.set("client_sessionid", js.undefined)
    
    @scala.inline
    def setEresult(value: Double): Self = this.set("eresult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEresult: Self = this.set("eresult", js.undefined)
    
    @scala.inline
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_message: Self = this.set("error_message", js.undefined)
    
    @scala.inline
    def setForward_to_sysidVarargs(value: Double*): Self = this.set("forward_to_sysid", js.Array(value :_*))
    
    @scala.inline
    def setForward_to_sysid(value: js.Array[Double]): Self = this.set("forward_to_sysid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward_to_sysid: Self = this.set("forward_to_sysid", js.undefined)
    
    @scala.inline
    def setIp(value: Double): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setIs_from_external_source(value: Boolean): Self = this.set("is_from_external_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_from_external_source: Self = this.set("is_from_external_source", js.undefined)
    
    @scala.inline
    def setJobid_source(value: String): Self = this.set("jobid_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobid_source: Self = this.set("jobid_source", js.undefined)
    
    @scala.inline
    def setJobid_target(value: String): Self = this.set("jobid_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobid_target: Self = this.set("jobid_target", js.undefined)
    
    @scala.inline
    def setMessageid(value: String): Self = this.set("messageid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageid: Self = this.set("messageid", js.undefined)
    
    @scala.inline
    def setPublisher_group_id(value: Double): Self = this.set("publisher_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher_group_id: Self = this.set("publisher_group_id", js.undefined)
    
    @scala.inline
    def setRouting_appid(value: Double): Self = this.set("routing_appid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouting_appid: Self = this.set("routing_appid", js.undefined)
    
    @scala.inline
    def setSeq_num(value: Double): Self = this.set("seq_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeq_num: Self = this.set("seq_num", js.undefined)
    
    @scala.inline
    def setSteamid(value: String): Self = this.set("steamid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteamid: Self = this.set("steamid", js.undefined)
    
    @scala.inline
    def setSysid(value: Double): Self = this.set("sysid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSysid: Self = this.set("sysid", js.undefined)
    
    @scala.inline
    def setTarget_job_name(value: String): Self = this.set("target_job_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_job_name: Self = this.set("target_job_name", js.undefined)
    
    @scala.inline
    def setToken_source(value: Double): Self = this.set("token_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_source: Self = this.set("token_source", js.undefined)
    
    @scala.inline
    def setTrace_tag(value: String): Self = this.set("trace_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace_tag: Self = this.set("trace_tag", js.undefined)
    
    @scala.inline
    def setTransport_error(value: Double): Self = this.set("transport_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport_error: Self = this.set("transport_error", js.undefined)
    
    @scala.inline
    def setWebapi_key_id(value: Double): Self = this.set("webapi_key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebapi_key_id: Self = this.set("webapi_key_id", js.undefined)
  }
}
