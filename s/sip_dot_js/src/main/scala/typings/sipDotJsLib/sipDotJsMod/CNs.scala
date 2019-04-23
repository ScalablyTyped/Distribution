package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "C")
@js.native
object CNs extends js.Object {
  val ACK: sipDotJsLib.sipDotJsLibStrings.ACK = js.native
  val BYE: sipDotJsLib.sipDotJsLibStrings.BYE = js.native
  val CANCEL: sipDotJsLib.sipDotJsLibStrings.CANCEL = js.native
  val INFO: sipDotJsLib.sipDotJsLibStrings.INFO = js.native
  val INVITE: sipDotJsLib.sipDotJsLibStrings.INVITE = js.native
  val MESSAGE: sipDotJsLib.sipDotJsLibStrings.MESSAGE = js.native
  val NOTIFY: sipDotJsLib.sipDotJsLibStrings.NOTIFY = js.native
  val OPTIONS: sipDotJsLib.sipDotJsLibStrings.OPTIONS = js.native
  val PRACK: sipDotJsLib.sipDotJsLibStrings.PRACK = js.native
  val PUBLISH: sipDotJsLib.sipDotJsLibStrings.PUBLISH = js.native
  val REFER: sipDotJsLib.sipDotJsLibStrings.REFER = js.native
  val REGISTER: sipDotJsLib.sipDotJsLibStrings.REGISTER = js.native
  val SIP: sipDotJsLib.sipDotJsLibStrings.sip = js.native
  val SIPS: sipDotJsLib.sipDotJsLibStrings.sips = js.native
  val SUBSCRIBE: sipDotJsLib.sipDotJsLibStrings.SUBSCRIBE = js.native
  val UPDATE: sipDotJsLib.sipDotJsLibStrings.UPDATE = js.native
  val USER_AGENT: java.lang.String = js.native
  @js.native
  object OPTION_TAGS
    extends /* option */ org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  @js.native
  object REASON_PHRASE
    extends /* code */ org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  
  @js.native
  object SIP_ERROR_CAUSES
    extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  
  @js.native
  object causes extends js.Object {
    /* "Address Incomplete" */ val ADDRESS_INCOMPLETE: sipDotJsLib.libConstantsMod.CNs.causes.ADDRESS_INCOMPLETE with java.lang.String = js.native
    /* "Authentication Error" */ val AUTHENTICATION_ERROR: sipDotJsLib.libConstantsMod.CNs.causes.AUTHENTICATION_ERROR with java.lang.String = js.native
    /* "Bad Media Description" */ val BAD_MEDIA_DESCRIPTION: sipDotJsLib.libConstantsMod.CNs.causes.BAD_MEDIA_DESCRIPTION with java.lang.String = js.native
    /* "Busy" */ val BUSY: sipDotJsLib.libConstantsMod.CNs.causes.BUSY with java.lang.String = js.native
    /* "Canceled" */ val CANCELED: sipDotJsLib.libConstantsMod.CNs.causes.CANCELED with java.lang.String = js.native
    /* "Connection Error" */ val CONNECTION_ERROR: sipDotJsLib.libConstantsMod.CNs.causes.CONNECTION_ERROR with java.lang.String = js.native
    /* "Dialog Error" */ val DIALOG_ERROR: sipDotJsLib.libConstantsMod.CNs.causes.DIALOG_ERROR with java.lang.String = js.native
    /* "Expires" */ val EXPIRES: sipDotJsLib.libConstantsMod.CNs.causes.EXPIRES with java.lang.String = js.native
    /* "Incompatible SDP" */ val INCOMPATIBLE_SDP: sipDotJsLib.libConstantsMod.CNs.causes.INCOMPATIBLE_SDP with java.lang.String = js.native
    /* "Internal Error" */ val INTERNAL_ERROR: sipDotJsLib.libConstantsMod.CNs.causes.INTERNAL_ERROR with java.lang.String = js.native
    /* "Not Found" */ val NOT_FOUND: sipDotJsLib.libConstantsMod.CNs.causes.NOT_FOUND with java.lang.String = js.native
    /* "No ACK" */ val NO_ACK: sipDotJsLib.libConstantsMod.CNs.causes.NO_ACK with java.lang.String = js.native
    /* "No Answer" */ val NO_ANSWER: sipDotJsLib.libConstantsMod.CNs.causes.NO_ANSWER with java.lang.String = js.native
    /* "No PRACK" */ val NO_PRACK: sipDotJsLib.libConstantsMod.CNs.causes.NO_PRACK with java.lang.String = js.native
    /* "Redirected" */ val REDIRECTED: sipDotJsLib.libConstantsMod.CNs.causes.REDIRECTED with java.lang.String = js.native
    /* "Rejected" */ val REJECTED: sipDotJsLib.libConstantsMod.CNs.causes.REJECTED with java.lang.String = js.native
    /* "Request Timeout" */ val REQUEST_TIMEOUT: sipDotJsLib.libConstantsMod.CNs.causes.REQUEST_TIMEOUT with java.lang.String = js.native
    /* "RTP Timeout" */ val RTP_TIMEOUT: sipDotJsLib.libConstantsMod.CNs.causes.RTP_TIMEOUT with java.lang.String = js.native
    /* "SIP Failure Code" */ val SIP_FAILURE_CODE: sipDotJsLib.libConstantsMod.CNs.causes.SIP_FAILURE_CODE with java.lang.String = js.native
    /* "Unavailable" */ val UNAVAILABLE: sipDotJsLib.libConstantsMod.CNs.causes.UNAVAILABLE with java.lang.String = js.native
    /* "User Denied Media Access" */ val USER_DENIED_MEDIA_ACCESS: sipDotJsLib.libConstantsMod.CNs.causes.USER_DENIED_MEDIA_ACCESS with java.lang.String = js.native
    /* "WebRTC Error" */ val WEBRTC_ERROR: sipDotJsLib.libConstantsMod.CNs.causes.WEBRTC_ERROR with java.lang.String = js.native
    /* "WebRTC Not Supported" */ val WEBRTC_NOT_SUPPORTED: sipDotJsLib.libConstantsMod.CNs.causes.WEBRTC_NOT_SUPPORTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes with java.lang.String] = js.native
  }
  
  @js.native
  object dtmfType extends js.Object {
    /* "info" */ val INFO: sipDotJsLib.libConstantsMod.CNs.dtmfType.INFO with java.lang.String = js.native
    /* "rtp" */ val RTP: sipDotJsLib.libConstantsMod.CNs.dtmfType.RTP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libConstantsMod.CNs.dtmfType with java.lang.String] = js.native
  }
  
  @js.native
  object supported extends js.Object {
    /* "required" */ val REQUIRED: sipDotJsLib.libConstantsMod.CNs.supported.REQUIRED with java.lang.String = js.native
    /* "supported" */ val SUPPORTED: sipDotJsLib.libConstantsMod.CNs.supported.SUPPORTED with java.lang.String = js.native
    /* "none" */ val UNSUPPORTED: sipDotJsLib.libConstantsMod.CNs.supported.UNSUPPORTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libConstantsMod.CNs.supported with java.lang.String] = js.native
  }
  
}

