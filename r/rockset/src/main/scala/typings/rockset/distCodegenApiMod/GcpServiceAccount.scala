package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcpServiceAccount extends StObject {
  
  /**
    * Contents of JSON Service Account key file
    * @type {string}
    * @memberof GcpServiceAccount
    */
  var service_account_key_file_json: String
}
object GcpServiceAccount {
  
  inline def apply(service_account_key_file_json: String): GcpServiceAccount = {
    val __obj = js.Dynamic.literal(service_account_key_file_json = service_account_key_file_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcpServiceAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GcpServiceAccount] (val x: Self) extends AnyVal {
    
    inline def setService_account_key_file_json(value: String): Self = StObject.set(x, "service_account_key_file_json", value.asInstanceOf[js.Any])
  }
}
