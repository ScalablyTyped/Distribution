package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMsgProtoBufHeader extends StObject {
  
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
  
  inline def apply(): CMsgProtoBufHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CMsgProtoBufHeader]
  }
  
  extension [Self <: CMsgProtoBufHeader](x: Self) {
    
    inline def setAdmin_spoofing_user(value: Boolean): Self = StObject.set(x, "admin_spoofing_user", value.asInstanceOf[js.Any])
    
    inline def setAdmin_spoofing_userUndefined: Self = StObject.set(x, "admin_spoofing_user", js.undefined)
    
    inline def setAuth_account_flags(value: Double): Self = StObject.set(x, "auth_account_flags", value.asInstanceOf[js.Any])
    
    inline def setAuth_account_flagsUndefined: Self = StObject.set(x, "auth_account_flags", js.undefined)
    
    inline def setClient_sessionid(value: Double): Self = StObject.set(x, "client_sessionid", value.asInstanceOf[js.Any])
    
    inline def setClient_sessionidUndefined: Self = StObject.set(x, "client_sessionid", js.undefined)
    
    inline def setEresult(value: Double): Self = StObject.set(x, "eresult", value.asInstanceOf[js.Any])
    
    inline def setEresultUndefined: Self = StObject.set(x, "eresult", js.undefined)
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
    
    inline def setForward_to_sysid(value: js.Array[Double]): Self = StObject.set(x, "forward_to_sysid", value.asInstanceOf[js.Any])
    
    inline def setForward_to_sysidUndefined: Self = StObject.set(x, "forward_to_sysid", js.undefined)
    
    inline def setForward_to_sysidVarargs(value: Double*): Self = StObject.set(x, "forward_to_sysid", js.Array(value :_*))
    
    inline def setIp(value: Double): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setIs_from_external_source(value: Boolean): Self = StObject.set(x, "is_from_external_source", value.asInstanceOf[js.Any])
    
    inline def setIs_from_external_sourceUndefined: Self = StObject.set(x, "is_from_external_source", js.undefined)
    
    inline def setJobid_source(value: String): Self = StObject.set(x, "jobid_source", value.asInstanceOf[js.Any])
    
    inline def setJobid_sourceUndefined: Self = StObject.set(x, "jobid_source", js.undefined)
    
    inline def setJobid_target(value: String): Self = StObject.set(x, "jobid_target", value.asInstanceOf[js.Any])
    
    inline def setJobid_targetUndefined: Self = StObject.set(x, "jobid_target", js.undefined)
    
    inline def setMessageid(value: String): Self = StObject.set(x, "messageid", value.asInstanceOf[js.Any])
    
    inline def setMessageidUndefined: Self = StObject.set(x, "messageid", js.undefined)
    
    inline def setPublisher_group_id(value: Double): Self = StObject.set(x, "publisher_group_id", value.asInstanceOf[js.Any])
    
    inline def setPublisher_group_idUndefined: Self = StObject.set(x, "publisher_group_id", js.undefined)
    
    inline def setRouting_appid(value: Double): Self = StObject.set(x, "routing_appid", value.asInstanceOf[js.Any])
    
    inline def setRouting_appidUndefined: Self = StObject.set(x, "routing_appid", js.undefined)
    
    inline def setSeq_num(value: Double): Self = StObject.set(x, "seq_num", value.asInstanceOf[js.Any])
    
    inline def setSeq_numUndefined: Self = StObject.set(x, "seq_num", js.undefined)
    
    inline def setSteamid(value: String): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
    
    inline def setSteamidUndefined: Self = StObject.set(x, "steamid", js.undefined)
    
    inline def setSysid(value: Double): Self = StObject.set(x, "sysid", value.asInstanceOf[js.Any])
    
    inline def setSysidUndefined: Self = StObject.set(x, "sysid", js.undefined)
    
    inline def setTarget_job_name(value: String): Self = StObject.set(x, "target_job_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_job_nameUndefined: Self = StObject.set(x, "target_job_name", js.undefined)
    
    inline def setToken_source(value: Double): Self = StObject.set(x, "token_source", value.asInstanceOf[js.Any])
    
    inline def setToken_sourceUndefined: Self = StObject.set(x, "token_source", js.undefined)
    
    inline def setTrace_tag(value: String): Self = StObject.set(x, "trace_tag", value.asInstanceOf[js.Any])
    
    inline def setTrace_tagUndefined: Self = StObject.set(x, "trace_tag", js.undefined)
    
    inline def setTransport_error(value: Double): Self = StObject.set(x, "transport_error", value.asInstanceOf[js.Any])
    
    inline def setTransport_errorUndefined: Self = StObject.set(x, "transport_error", js.undefined)
    
    inline def setWebapi_key_id(value: Double): Self = StObject.set(x, "webapi_key_id", value.asInstanceOf[js.Any])
    
    inline def setWebapi_key_idUndefined: Self = StObject.set(x, "webapi_key_id", js.undefined)
  }
}
