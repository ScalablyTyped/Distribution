package typings.sipJs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "C")
@js.native
object C extends js.Object {
  val ACK: /* "ACK" */ String = js.native
  val BYE: /* "BYE" */ String = js.native
  val CANCEL: /* "CANCEL" */ String = js.native
  val INFO: /* "INFO" */ String = js.native
  val INVITE: /* "INVITE" */ String = js.native
  val MESSAGE: /* "MESSAGE" */ String = js.native
  val NOTIFY: /* "NOTIFY" */ String = js.native
  val OPTIONS: /* "OPTIONS" */ String = js.native
  val PRACK: /* "PRACK" */ String = js.native
  val PUBLISH: /* "PUBLISH" */ String = js.native
  val REFER: /* "REFER" */ String = js.native
  val REGISTER: /* "REGISTER" */ String = js.native
  val SIP: /* "sip" */ String = js.native
  val SIPS: /* "sips" */ String = js.native
  val SUBSCRIBE: /* "SUBSCRIBE" */ String = js.native
  val UPDATE: /* "UPDATE" */ String = js.native
  val USER_AGENT: String = js.native
  val version: /* "0.15.11" */ String = js.native
  @js.native
  object OPTION_TAGS extends /* option */ StringDictionary[Boolean]
  
  @js.native
  object REASON_PHRASE extends /* code */ NumberDictionary[String]
  
  @js.native
  object SIP_ERROR_CAUSES
    extends /* name */ StringDictionary[js.Array[Double]]
  
  @js.native
  object causes extends js.Object {
    /* "Address Incomplete" */ val ADDRESS_INCOMPLETE: typings.sipJs.libConstantsMod.C.causes.ADDRESS_INCOMPLETE with String = js.native
    /* "Authentication Error" */ val AUTHENTICATION_ERROR: typings.sipJs.libConstantsMod.C.causes.AUTHENTICATION_ERROR with String = js.native
    /* "Bad Media Description" */ val BAD_MEDIA_DESCRIPTION: typings.sipJs.libConstantsMod.C.causes.BAD_MEDIA_DESCRIPTION with String = js.native
    /* "Busy" */ val BUSY: typings.sipJs.libConstantsMod.C.causes.BUSY with String = js.native
    /* "Canceled" */ val CANCELED: typings.sipJs.libConstantsMod.C.causes.CANCELED with String = js.native
    /* "Connection Error" */ val CONNECTION_ERROR: typings.sipJs.libConstantsMod.C.causes.CONNECTION_ERROR with String = js.native
    /* "Dialog Error" */ val DIALOG_ERROR: typings.sipJs.libConstantsMod.C.causes.DIALOG_ERROR with String = js.native
    /* "Expires" */ val EXPIRES: typings.sipJs.libConstantsMod.C.causes.EXPIRES with String = js.native
    /* "Incompatible SDP" */ val INCOMPATIBLE_SDP: typings.sipJs.libConstantsMod.C.causes.INCOMPATIBLE_SDP with String = js.native
    /* "Internal Error" */ val INTERNAL_ERROR: typings.sipJs.libConstantsMod.C.causes.INTERNAL_ERROR with String = js.native
    /* "Not Found" */ val NOT_FOUND: typings.sipJs.libConstantsMod.C.causes.NOT_FOUND with String = js.native
    /* "No ACK" */ val NO_ACK: typings.sipJs.libConstantsMod.C.causes.NO_ACK with String = js.native
    /* "No Answer" */ val NO_ANSWER: typings.sipJs.libConstantsMod.C.causes.NO_ANSWER with String = js.native
    /* "No PRACK" */ val NO_PRACK: typings.sipJs.libConstantsMod.C.causes.NO_PRACK with String = js.native
    /* "Redirected" */ val REDIRECTED: typings.sipJs.libConstantsMod.C.causes.REDIRECTED with String = js.native
    /* "Rejected" */ val REJECTED: typings.sipJs.libConstantsMod.C.causes.REJECTED with String = js.native
    /* "Request Timeout" */ val REQUEST_TIMEOUT: typings.sipJs.libConstantsMod.C.causes.REQUEST_TIMEOUT with String = js.native
    /* "RTP Timeout" */ val RTP_TIMEOUT: typings.sipJs.libConstantsMod.C.causes.RTP_TIMEOUT with String = js.native
    /* "SIP Failure Code" */ val SIP_FAILURE_CODE: typings.sipJs.libConstantsMod.C.causes.SIP_FAILURE_CODE with String = js.native
    /* "Unavailable" */ val UNAVAILABLE: typings.sipJs.libConstantsMod.C.causes.UNAVAILABLE with String = js.native
    /* "User Denied Media Access" */ val USER_DENIED_MEDIA_ACCESS: typings.sipJs.libConstantsMod.C.causes.USER_DENIED_MEDIA_ACCESS with String = js.native
    /* "WebRTC Error" */ val WEBRTC_ERROR: typings.sipJs.libConstantsMod.C.causes.WEBRTC_ERROR with String = js.native
    /* "WebRTC Not Supported" */ val WEBRTC_NOT_SUPPORTED: typings.sipJs.libConstantsMod.C.causes.WEBRTC_NOT_SUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.libConstantsMod.C.causes with String] = js.native
  }
  
  @js.native
  object dtmfType extends js.Object {
    /* "info" */ val INFO: typings.sipJs.libConstantsMod.C.dtmfType.INFO with String = js.native
    /* "rtp" */ val RTP: typings.sipJs.libConstantsMod.C.dtmfType.RTP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.libConstantsMod.C.dtmfType with String] = js.native
  }
  
  @js.native
  object supported extends js.Object {
    /* "required" */ val REQUIRED: typings.sipJs.libConstantsMod.C.supported.REQUIRED with String = js.native
    /* "supported" */ val SUPPORTED: typings.sipJs.libConstantsMod.C.supported.SUPPORTED with String = js.native
    /* "none" */ val UNSUPPORTED: typings.sipJs.libConstantsMod.C.supported.UNSUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.libConstantsMod.C.supported with String] = js.native
  }
  
}

