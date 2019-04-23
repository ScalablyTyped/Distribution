package typings
package sipDotJsLib.libConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Constants", "C")
@js.native
object CNs extends js.Object {
  @js.native
  sealed trait causes extends js.Object
  
  @js.native
  sealed trait dtmfType extends js.Object
  
  @js.native
  sealed trait supported extends js.Object
  
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
    @js.native
    sealed trait ADDRESS_INCOMPLETE
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait AUTHENTICATION_ERROR
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait BAD_MEDIA_DESCRIPTION
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait BUSY
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait CANCELED
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait CONNECTION_ERROR
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait DIALOG_ERROR
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait EXPIRES
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait INCOMPATIBLE_SDP
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait NOT_FOUND
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait NO_ACK
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait NO_ANSWER
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait NO_PRACK
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait REDIRECTED
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait REJECTED
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait REQUEST_TIMEOUT
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait RTP_TIMEOUT
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait SIP_FAILURE_CODE
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait UNAVAILABLE
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait USER_DENIED_MEDIA_ACCESS
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait WEBRTC_ERROR
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    @js.native
    sealed trait WEBRTC_NOT_SUPPORTED
      extends sipDotJsLib.libConstantsMod.CNs.causes
    
    /* "Address Incomplete" */ val ADDRESS_INCOMPLETE: ADDRESS_INCOMPLETE with java.lang.String = js.native
    /* "Authentication Error" */ val AUTHENTICATION_ERROR: AUTHENTICATION_ERROR with java.lang.String = js.native
    /* "Bad Media Description" */ val BAD_MEDIA_DESCRIPTION: BAD_MEDIA_DESCRIPTION with java.lang.String = js.native
    /* "Busy" */ val BUSY: BUSY with java.lang.String = js.native
    /* "Canceled" */ val CANCELED: CANCELED with java.lang.String = js.native
    /* "Connection Error" */ val CONNECTION_ERROR: CONNECTION_ERROR with java.lang.String = js.native
    /* "Dialog Error" */ val DIALOG_ERROR: DIALOG_ERROR with java.lang.String = js.native
    /* "Expires" */ val EXPIRES: EXPIRES with java.lang.String = js.native
    /* "Incompatible SDP" */ val INCOMPATIBLE_SDP: INCOMPATIBLE_SDP with java.lang.String = js.native
    /* "Internal Error" */ val INTERNAL_ERROR: INTERNAL_ERROR with java.lang.String = js.native
    /* "Not Found" */ val NOT_FOUND: NOT_FOUND with java.lang.String = js.native
    /* "No ACK" */ val NO_ACK: NO_ACK with java.lang.String = js.native
    /* "No Answer" */ val NO_ANSWER: NO_ANSWER with java.lang.String = js.native
    /* "No PRACK" */ val NO_PRACK: NO_PRACK with java.lang.String = js.native
    /* "Redirected" */ val REDIRECTED: REDIRECTED with java.lang.String = js.native
    /* "Rejected" */ val REJECTED: REJECTED with java.lang.String = js.native
    /* "Request Timeout" */ val REQUEST_TIMEOUT: REQUEST_TIMEOUT with java.lang.String = js.native
    /* "RTP Timeout" */ val RTP_TIMEOUT: RTP_TIMEOUT with java.lang.String = js.native
    /* "SIP Failure Code" */ val SIP_FAILURE_CODE: SIP_FAILURE_CODE with java.lang.String = js.native
    /* "Unavailable" */ val UNAVAILABLE: UNAVAILABLE with java.lang.String = js.native
    /* "User Denied Media Access" */ val USER_DENIED_MEDIA_ACCESS: USER_DENIED_MEDIA_ACCESS with java.lang.String = js.native
    /* "WebRTC Error" */ val WEBRTC_ERROR: WEBRTC_ERROR with java.lang.String = js.native
    /* "WebRTC Not Supported" */ val WEBRTC_NOT_SUPPORTED: WEBRTC_NOT_SUPPORTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes with java.lang.String] = js.native
  }
  
  @js.native
  object dtmfType extends js.Object {
    @js.native
    sealed trait INFO
      extends sipDotJsLib.libConstantsMod.CNs.dtmfType
    
    @js.native
    sealed trait RTP
      extends sipDotJsLib.libConstantsMod.CNs.dtmfType
    
    /* "info" */ val INFO: INFO with java.lang.String = js.native
    /* "rtp" */ val RTP: RTP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libConstantsMod.CNs.dtmfType with java.lang.String] = js.native
  }
  
  @js.native
  object supported extends js.Object {
    @js.native
    sealed trait REQUIRED
      extends sipDotJsLib.libConstantsMod.CNs.supported
    
    @js.native
    sealed trait SUPPORTED
      extends sipDotJsLib.libConstantsMod.CNs.supported
    
    @js.native
    sealed trait UNSUPPORTED
      extends sipDotJsLib.libConstantsMod.CNs.supported
    
    /* "required" */ val REQUIRED: REQUIRED with java.lang.String = js.native
    /* "supported" */ val SUPPORTED: SUPPORTED with java.lang.String = js.native
    /* "none" */ val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libConstantsMod.CNs.supported with java.lang.String] = js.native
  }
  
}

