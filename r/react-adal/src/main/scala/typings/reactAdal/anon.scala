package typings.reactAdal

import typings.reactAdal.reactAdalInts.`1`
import typings.reactAdal.reactAdalInts.`2`
import typings.reactAdal.reactAdalInts.`3`
import typings.reactAdal.reactAdalStrings.ERRORColon
import typings.reactAdal.reactAdalStrings.INFOColon
import typings.reactAdal.reactAdalStrings.VERBOSEColon
import typings.reactAdal.reactAdalStrings.WARNINGColon
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `0`: ERRORColon
    
    var `1`: WARNINGColon
    
    var `2`: INFOColon
    
    var `3`: VERBOSEColon
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")("ERROR:")
      __obj.updateDynamic("1")("WARNING:")
      __obj.updateDynamic("2")("INFO:")
      __obj.updateDynamic("3")("VERBOSE:")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def set0(value: ERRORColon): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: WARNINGColon): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: INFOColon): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: VERBOSEColon): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    }
  }
  
  trait ACCESSTOKENKEY extends StObject {
    
    var ACCESS_TOKEN_KEY: adalDotaccessDottokenDotkey
    
    var ERROR: adalDoterror
    
    var ERROR_DESCRIPTION: adalDoterrorDotdescription
    
    var EXPIRATION_KEY: adalDotexpirationDotkey
    
    var IDTOKEN: adalDotidtoken
    
    var LOGIN_ERROR: adalDotloginDoterror
    
    var LOGIN_REQUEST: adalDotloginDotrequest
    
    var NONCE_IDTOKEN: adalDotnonceDotidtoken
    
    var RENEW_STATUS: adalDottokenDotrenewDotstatus
    
    var SESSION_STATE: adalDotsessionDotstate
    
    var STATE_LOGIN: adalDotstateDotlogin
    
    var STATE_RENEW: adalDotstateDotrenew
    
    var TOKEN_KEYS: adalDottokenDotkeys
    
    var USERNAME: adalDotusername
  }
  object ACCESSTOKENKEY {
    
    inline def apply(): ACCESSTOKENKEY = {
      val __obj = js.Dynamic.literal(ACCESS_TOKEN_KEY = "adal.access.token.key", ERROR = "adal.error", ERROR_DESCRIPTION = "adal.error.description", EXPIRATION_KEY = "adal.expiration.key", IDTOKEN = "adal.idtoken", LOGIN_ERROR = "adal.login.error", LOGIN_REQUEST = "adal.login.request", NONCE_IDTOKEN = "adal.nonce.idtoken", RENEW_STATUS = "adal.token.renew.status", SESSION_STATE = "adal.session.state", STATE_LOGIN = "adal.state.login", STATE_RENEW = "adal.state.renew", TOKEN_KEYS = "adal.token.keys", USERNAME = "adal.username")
      __obj.asInstanceOf[ACCESSTOKENKEY]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ACCESSTOKENKEY] (val x: Self) extends AnyVal {
      
      inline def setACCESS_TOKEN_KEY(value: adalDotaccessDottokenDotkey): Self = StObject.set(x, "ACCESS_TOKEN_KEY", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: adalDoterror): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setERROR_DESCRIPTION(value: adalDoterrorDotdescription): Self = StObject.set(x, "ERROR_DESCRIPTION", value.asInstanceOf[js.Any])
      
      inline def setEXPIRATION_KEY(value: adalDotexpirationDotkey): Self = StObject.set(x, "EXPIRATION_KEY", value.asInstanceOf[js.Any])
      
      inline def setIDTOKEN(value: adalDotidtoken): Self = StObject.set(x, "IDTOKEN", value.asInstanceOf[js.Any])
      
      inline def setLOGIN_ERROR(value: adalDotloginDoterror): Self = StObject.set(x, "LOGIN_ERROR", value.asInstanceOf[js.Any])
      
      inline def setLOGIN_REQUEST(value: adalDotloginDotrequest): Self = StObject.set(x, "LOGIN_REQUEST", value.asInstanceOf[js.Any])
      
      inline def setNONCE_IDTOKEN(value: adalDotnonceDotidtoken): Self = StObject.set(x, "NONCE_IDTOKEN", value.asInstanceOf[js.Any])
      
      inline def setRENEW_STATUS(value: adalDottokenDotrenewDotstatus): Self = StObject.set(x, "RENEW_STATUS", value.asInstanceOf[js.Any])
      
      inline def setSESSION_STATE(value: adalDotsessionDotstate): Self = StObject.set(x, "SESSION_STATE", value.asInstanceOf[js.Any])
      
      inline def setSTATE_LOGIN(value: adalDotstateDotlogin): Self = StObject.set(x, "STATE_LOGIN", value.asInstanceOf[js.Any])
      
      inline def setSTATE_RENEW(value: adalDotstateDotrenew): Self = StObject.set(x, "STATE_RENEW", value.asInstanceOf[js.Any])
      
      inline def setTOKEN_KEYS(value: adalDottokenDotkeys): Self = StObject.set(x, "TOKEN_KEYS", value.asInstanceOf[js.Any])
      
      inline def setUSERNAME(value: adalDotusername): Self = StObject.set(x, "USERNAME", value.asInstanceOf[js.Any])
    }
  }
  
  trait ERROR extends StObject {
    
    var ERROR: typings.reactAdal.reactAdalInts.`0`
    
    var INFO: `2`
    
    var VERBOSE: `3`
    
    var WARN: `1`
  }
  object ERROR {
    
    inline def apply(): ERROR = {
      val __obj = js.Dynamic.literal(ERROR = 0, INFO = 2, VERBOSE = 3, WARN = 1)
      __obj.asInstanceOf[ERROR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ERROR] (val x: Self) extends AnyVal {
      
      inline def setERROR(value: typings.reactAdal.reactAdalInts.`0`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: `2`): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setVERBOSE(value: `3`): Self = StObject.set(x, "VERBOSE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: `1`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
}
