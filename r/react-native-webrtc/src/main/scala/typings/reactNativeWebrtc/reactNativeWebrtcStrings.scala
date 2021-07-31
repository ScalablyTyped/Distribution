package typings.reactNativeWebrtc

import typings.reactNativeWebrtc.mod.MediaStreamTrackState
import typings.reactNativeWebrtc.mod.RTCIceConnectionState
import typings.reactNativeWebrtc.mod.RTCIceGatheringState
import typings.reactNativeWebrtc.mod.RTCPeerConnectionState
import typings.reactNativeWebrtc.mod.RTCSignalingState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeWebrtcStrings {
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait checking
    extends StObject
       with RTCIceConnectionState
  @scala.inline
  def checking: checking = "checking".asInstanceOf[checking]
  
  @js.native
  sealed trait closed
    extends StObject
       with RTCIceConnectionState
       with RTCPeerConnectionState
       with RTCSignalingState
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait complete
    extends StObject
       with RTCIceGatheringState
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait completed
    extends StObject
       with RTCIceConnectionState
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait connected
    extends StObject
       with RTCIceConnectionState
       with RTCPeerConnectionState
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with RTCPeerConnectionState
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait contain extends StObject
  @scala.inline
  def contain: contain = "contain".asInstanceOf[contain]
  
  @js.native
  sealed trait cover extends StObject
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with RTCIceConnectionState
       with RTCPeerConnectionState
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait ended
    extends StObject
       with MediaStreamTrackState
  @scala.inline
  def ended: ended = "ended".asInstanceOf[ended]
  
  @js.native
  sealed trait environment extends StObject
  @scala.inline
  def environment: environment = "environment".asInstanceOf[environment]
  
  @js.native
  sealed trait failed
    extends StObject
       with RTCIceConnectionState
       with RTCPeerConnectionState
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait gathering
    extends StObject
       with RTCIceGatheringState
  @scala.inline
  def gathering: gathering = "gathering".asInstanceOf[gathering]
  
  @js.native
  sealed trait `have-local-offer`
    extends StObject
       with RTCSignalingState
  @scala.inline
  def `have-local-offer`: `have-local-offer` = "have-local-offer".asInstanceOf[`have-local-offer`]
  
  @js.native
  sealed trait `have-local-pranswer`
    extends StObject
       with RTCSignalingState
  @scala.inline
  def `have-local-pranswer`: `have-local-pranswer` = "have-local-pranswer".asInstanceOf[`have-local-pranswer`]
  
  @js.native
  sealed trait `have-remote-offer`
    extends StObject
       with RTCSignalingState
  @scala.inline
  def `have-remote-offer`: `have-remote-offer` = "have-remote-offer".asInstanceOf[`have-remote-offer`]
  
  @js.native
  sealed trait `have-remote-pranswer`
    extends StObject
       with RTCSignalingState
  @scala.inline
  def `have-remote-pranswer`: `have-remote-pranswer` = "have-remote-pranswer".asInstanceOf[`have-remote-pranswer`]
  
  @js.native
  sealed trait live
    extends StObject
       with MediaStreamTrackState
  @scala.inline
  def live: live = "live".asInstanceOf[live]
  
  @js.native
  sealed trait `new`
    extends StObject
       with RTCIceConnectionState
       with RTCIceGatheringState
       with RTCPeerConnectionState
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait public extends StObject
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait relay extends StObject
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  
  @js.native
  sealed trait stable
    extends StObject
       with RTCSignalingState
  @scala.inline
  def stable: stable = "stable".asInstanceOf[stable]
  
  @js.native
  sealed trait user extends StObject
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}
