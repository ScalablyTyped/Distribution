package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubaccount extends StObject {
  
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.undefined
  
  /** list of grants to give the subaccount API key */
  var key_grants: js.Array[String]
  
  /** user-friendly identifier for subaccount API key */
  var key_label: String
  
  /** list of IPs the subaccount may be used from */
  var key_valid_ips: js.UndefOr[js.Array[String]] = js.undefined
  
  /** user-friendly name */
  var name: String
}
object CreateSubaccount {
  
  @scala.inline
  def apply(key_grants: js.Array[String], key_label: String, name: String): CreateSubaccount = {
    val __obj = js.Dynamic.literal(key_grants = key_grants.asInstanceOf[js.Any], key_label = key_label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubaccount]
  }
  
  @scala.inline
  implicit class CreateSubaccountMutableBuilder[Self <: CreateSubaccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_poolUndefined: Self = StObject.set(x, "ip_pool", js.undefined)
    
    @scala.inline
    def setKey_grants(value: js.Array[String]): Self = StObject.set(x, "key_grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_grantsVarargs(value: String*): Self = StObject.set(x, "key_grants", js.Array(value :_*))
    
    @scala.inline
    def setKey_label(value: String): Self = StObject.set(x, "key_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_valid_ips(value: js.Array[String]): Self = StObject.set(x, "key_valid_ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_valid_ipsUndefined: Self = StObject.set(x, "key_valid_ips", js.undefined)
    
    @scala.inline
    def setKey_valid_ipsVarargs(value: String*): Self = StObject.set(x, "key_valid_ips", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
