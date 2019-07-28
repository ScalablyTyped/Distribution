package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMsgClientLogonResponse extends js.Object {
  /**
    * The logon was successful if equal to EResult.OK
    */
  var eresult: EResult
  /**
    * "loginkey" to be used with WebAPI's AuthenticateUser."
    */
  var webapi_authenticate_user_nonce: String
}

object CMsgClientLogonResponse {
  @scala.inline
  def apply(eresult: EResult, webapi_authenticate_user_nonce: String): CMsgClientLogonResponse = {
    val __obj = js.Dynamic.literal(eresult = eresult, webapi_authenticate_user_nonce = webapi_authenticate_user_nonce)
  
    __obj.asInstanceOf[CMsgClientLogonResponse]
  }
}

