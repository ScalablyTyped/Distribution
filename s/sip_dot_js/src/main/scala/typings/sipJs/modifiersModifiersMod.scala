package typings.sipJs

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersModifiersMod {
  
  @JSImport("sip.js/lib/platform/web/modifiers/modifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addMidLines")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanJitsiSdpImageattr")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("holdModifier")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripG722")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stripRtpPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[SessionDescriptionHandlerModifier]
  
  @scala.inline
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTcpCandidates")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTelephoneEvent")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripVideo")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
}
