package typings.reactAdal.anon

import typings.reactAdal.reactAdalStrings.adalDotaccessDottokenDotkey
import typings.reactAdal.reactAdalStrings.adalDoterror
import typings.reactAdal.reactAdalStrings.adalDoterrorDotdescription
import typings.reactAdal.reactAdalStrings.adalDotexpirationDotkey
import typings.reactAdal.reactAdalStrings.adalDotidtoken
import typings.reactAdal.reactAdalStrings.adalDotloginDoterror
import typings.reactAdal.reactAdalStrings.adalDotloginDotrequest
import typings.reactAdal.reactAdalStrings.adalDotnonceDotidtoken
import typings.reactAdal.reactAdalStrings.adalDotsessionDotstate
import typings.reactAdal.reactAdalStrings.adalDotstateDotlogin
import typings.reactAdal.reactAdalStrings.adalDotstateDotrenew
import typings.reactAdal.reactAdalStrings.adalDottokenDotkeys
import typings.reactAdal.reactAdalStrings.adalDottokenDotrenewDotstatus
import typings.reactAdal.reactAdalStrings.adalDotusername
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ACCESSTOKENKEY extends js.Object {
  
  var ACCESS_TOKEN_KEY: adalDotaccessDottokenDotkey = js.native
  
  var ERROR: adalDoterror = js.native
  
  var ERROR_DESCRIPTION: adalDoterrorDotdescription = js.native
  
  var EXPIRATION_KEY: adalDotexpirationDotkey = js.native
  
  var IDTOKEN: adalDotidtoken = js.native
  
  var LOGIN_ERROR: adalDotloginDoterror = js.native
  
  var LOGIN_REQUEST: adalDotloginDotrequest = js.native
  
  var NONCE_IDTOKEN: adalDotnonceDotidtoken = js.native
  
  var RENEW_STATUS: adalDottokenDotrenewDotstatus = js.native
  
  var SESSION_STATE: adalDotsessionDotstate = js.native
  
  var STATE_LOGIN: adalDotstateDotlogin = js.native
  
  var STATE_RENEW: adalDotstateDotrenew = js.native
  
  var TOKEN_KEYS: adalDottokenDotkeys = js.native
  
  var USERNAME: adalDotusername = js.native
}
object ACCESSTOKENKEY {
  
  @scala.inline
  def apply(
    ACCESS_TOKEN_KEY: adalDotaccessDottokenDotkey,
    ERROR: adalDoterror,
    ERROR_DESCRIPTION: adalDoterrorDotdescription,
    EXPIRATION_KEY: adalDotexpirationDotkey,
    IDTOKEN: adalDotidtoken,
    LOGIN_ERROR: adalDotloginDoterror,
    LOGIN_REQUEST: adalDotloginDotrequest,
    NONCE_IDTOKEN: adalDotnonceDotidtoken,
    RENEW_STATUS: adalDottokenDotrenewDotstatus,
    SESSION_STATE: adalDotsessionDotstate,
    STATE_LOGIN: adalDotstateDotlogin,
    STATE_RENEW: adalDotstateDotrenew,
    TOKEN_KEYS: adalDottokenDotkeys,
    USERNAME: adalDotusername
  ): ACCESSTOKENKEY = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN_KEY = ACCESS_TOKEN_KEY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRATION_KEY = EXPIRATION_KEY.asInstanceOf[js.Any], IDTOKEN = IDTOKEN.asInstanceOf[js.Any], LOGIN_ERROR = LOGIN_ERROR.asInstanceOf[js.Any], LOGIN_REQUEST = LOGIN_REQUEST.asInstanceOf[js.Any], NONCE_IDTOKEN = NONCE_IDTOKEN.asInstanceOf[js.Any], RENEW_STATUS = RENEW_STATUS.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STATE_LOGIN = STATE_LOGIN.asInstanceOf[js.Any], STATE_RENEW = STATE_RENEW.asInstanceOf[js.Any], TOKEN_KEYS = TOKEN_KEYS.asInstanceOf[js.Any], USERNAME = USERNAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACCESSTOKENKEY]
  }
  
  @scala.inline
  implicit class ACCESSTOKENKEYOps[Self <: ACCESSTOKENKEY] (val x: Self) extends AnyVal {
    
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
    def setACCESS_TOKEN_KEY(value: adalDotaccessDottokenDotkey): Self = this.set("ACCESS_TOKEN_KEY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: adalDoterror): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR_DESCRIPTION(value: adalDoterrorDotdescription): Self = this.set("ERROR_DESCRIPTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXPIRATION_KEY(value: adalDotexpirationDotkey): Self = this.set("EXPIRATION_KEY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDTOKEN(value: adalDotidtoken): Self = this.set("IDTOKEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOGIN_ERROR(value: adalDotloginDoterror): Self = this.set("LOGIN_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOGIN_REQUEST(value: adalDotloginDotrequest): Self = this.set("LOGIN_REQUEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONCE_IDTOKEN(value: adalDotnonceDotidtoken): Self = this.set("NONCE_IDTOKEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRENEW_STATUS(value: adalDottokenDotrenewDotstatus): Self = this.set("RENEW_STATUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSESSION_STATE(value: adalDotsessionDotstate): Self = this.set("SESSION_STATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTATE_LOGIN(value: adalDotstateDotlogin): Self = this.set("STATE_LOGIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTATE_RENEW(value: adalDotstateDotrenew): Self = this.set("STATE_RENEW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOKEN_KEYS(value: adalDottokenDotkeys): Self = this.set("TOKEN_KEYS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSERNAME(value: adalDotusername): Self = this.set("USERNAME", value.asInstanceOf[js.Any])
  }
}
