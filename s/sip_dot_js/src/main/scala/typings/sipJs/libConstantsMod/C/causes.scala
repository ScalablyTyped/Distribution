package typings.sipJs.libConstantsMod.C

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait causes extends js.Object

@JSImport("sip.js/lib/Constants", "C.causes")
@js.native
object causes extends js.Object {
  @js.native
  sealed trait ADDRESS_INCOMPLETE extends causes
  
  @js.native
  sealed trait AUTHENTICATION_ERROR extends causes
  
  @js.native
  sealed trait BAD_MEDIA_DESCRIPTION extends causes
  
  @js.native
  sealed trait BUSY extends causes
  
  @js.native
  sealed trait CANCELED extends causes
  
  @js.native
  sealed trait CONNECTION_ERROR extends causes
  
  @js.native
  sealed trait DIALOG_ERROR extends causes
  
  @js.native
  sealed trait EXPIRES extends causes
  
  @js.native
  sealed trait INCOMPATIBLE_SDP extends causes
  
  @js.native
  sealed trait INTERNAL_ERROR extends causes
  
  @js.native
  sealed trait NOT_FOUND extends causes
  
  @js.native
  sealed trait NO_ACK extends causes
  
  @js.native
  sealed trait NO_ANSWER extends causes
  
  @js.native
  sealed trait NO_PRACK extends causes
  
  @js.native
  sealed trait REDIRECTED extends causes
  
  @js.native
  sealed trait REJECTED extends causes
  
  @js.native
  sealed trait REQUEST_TIMEOUT extends causes
  
  @js.native
  sealed trait RTP_TIMEOUT extends causes
  
  @js.native
  sealed trait SIP_FAILURE_CODE extends causes
  
  @js.native
  sealed trait UNAVAILABLE extends causes
  
  @js.native
  sealed trait USER_DENIED_MEDIA_ACCESS extends causes
  
  @js.native
  sealed trait WEBRTC_ERROR extends causes
  
  @js.native
  sealed trait WEBRTC_NOT_SUPPORTED extends causes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[causes with String] = js.native
  /* "Address Incomplete" */ @js.native
  object ADDRESS_INCOMPLETE extends TopLevel[ADDRESS_INCOMPLETE with String]
  
  /* "Authentication Error" */ @js.native
  object AUTHENTICATION_ERROR extends TopLevel[AUTHENTICATION_ERROR with String]
  
  /* "Bad Media Description" */ @js.native
  object BAD_MEDIA_DESCRIPTION extends TopLevel[BAD_MEDIA_DESCRIPTION with String]
  
  /* "Busy" */ @js.native
  object BUSY extends TopLevel[BUSY with String]
  
  /* "Canceled" */ @js.native
  object CANCELED extends TopLevel[CANCELED with String]
  
  /* "Connection Error" */ @js.native
  object CONNECTION_ERROR extends TopLevel[CONNECTION_ERROR with String]
  
  /* "Dialog Error" */ @js.native
  object DIALOG_ERROR extends TopLevel[DIALOG_ERROR with String]
  
  /* "Expires" */ @js.native
  object EXPIRES extends TopLevel[EXPIRES with String]
  
  /* "Incompatible SDP" */ @js.native
  object INCOMPATIBLE_SDP extends TopLevel[INCOMPATIBLE_SDP with String]
  
  /* "Internal Error" */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with String]
  
  /* "Not Found" */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with String]
  
  /* "No ACK" */ @js.native
  object NO_ACK extends TopLevel[NO_ACK with String]
  
  /* "No Answer" */ @js.native
  object NO_ANSWER extends TopLevel[NO_ANSWER with String]
  
  /* "No PRACK" */ @js.native
  object NO_PRACK extends TopLevel[NO_PRACK with String]
  
  /* "Redirected" */ @js.native
  object REDIRECTED extends TopLevel[REDIRECTED with String]
  
  /* "Rejected" */ @js.native
  object REJECTED extends TopLevel[REJECTED with String]
  
  /* "Request Timeout" */ @js.native
  object REQUEST_TIMEOUT extends TopLevel[REQUEST_TIMEOUT with String]
  
  /* "RTP Timeout" */ @js.native
  object RTP_TIMEOUT extends TopLevel[RTP_TIMEOUT with String]
  
  /* "SIP Failure Code" */ @js.native
  object SIP_FAILURE_CODE extends TopLevel[SIP_FAILURE_CODE with String]
  
  /* "Unavailable" */ @js.native
  object UNAVAILABLE extends TopLevel[UNAVAILABLE with String]
  
  /* "User Denied Media Access" */ @js.native
  object USER_DENIED_MEDIA_ACCESS extends TopLevel[USER_DENIED_MEDIA_ACCESS with String]
  
  /* "WebRTC Error" */ @js.native
  object WEBRTC_ERROR extends TopLevel[WEBRTC_ERROR with String]
  
  /* "WebRTC Not Supported" */ @js.native
  object WEBRTC_NOT_SUPPORTED extends TopLevel[WEBRTC_NOT_SUPPORTED with String]
  
}

