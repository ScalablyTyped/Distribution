package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed. */
@js.native
trait RTCPeerConnection
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_connectionstatechange")
  def addEventListener(
    `type`: "connectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icegatheringstatechange")
  def addEventListener(
    `type`: "icegatheringstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_signalingstatechange")
  def addEventListener(
    `type`: "signalingstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icecandidateerror")
  def addEventListener(`type`: "icecandidateerror", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_iceconnectionstatechange")
  def addEventListener(
    `type`: "iceconnectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_datachannel")
  def addEventListener(
    `type`: "datachannel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_negotiationneeded")
  def addEventListener(`type`: "negotiationneeded", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icecandidate")
  def addEventListener(
    `type`: "icecandidate",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_track")
  def addEventListener(`type`: "track", listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_signalingstatechange")
  def addEventListener(
    `type`: "signalingstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_track")
  def addEventListener(
    `type`: "track",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icecandidate")
  def addEventListener(
    `type`: "icecandidate",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_datachannel")
  def addEventListener(
    `type`: "datachannel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icegatheringstatechange")
  def addEventListener(
    `type`: "icegatheringstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_connectionstatechange")
  def addEventListener(
    `type`: "connectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icecandidateerror")
  def addEventListener(
    `type`: "icecandidateerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_negotiationneeded")
  def addEventListener(
    `type`: "negotiationneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_iceconnectionstatechange")
  def addEventListener(
    `type`: "iceconnectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_negotiationneeded")
  def addEventListener(
    `type`: "negotiationneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_track")
  def addEventListener(
    `type`: "track",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icecandidate")
  def addEventListener(
    `type`: "icecandidate",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icegatheringstatechange")
  def addEventListener(
    `type`: "icegatheringstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_signalingstatechange")
  def addEventListener(
    `type`: "signalingstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_icecandidateerror")
  def addEventListener(
    `type`: "icecandidateerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_connectionstatechange")
  def addEventListener(
    `type`: "connectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_iceconnectionstatechange")
  def addEventListener(
    `type`: "iceconnectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_datachannel")
  def addEventListener(
    `type`: "datachannel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def addIceCandidate(): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidateInit): js.Promise[Unit] = js.native
  /** @deprecated */
  /* standard dom */
  def addIceCandidate(
    candidate: RTCIceCandidateInit,
    successCallback: VoidFunction,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  /* standard dom */
  def addTrack(track: MediaStreamTrack, streams: MediaStream*): RTCRtpSender = js.native
  
  def addTransceiver(trackOrKind: java.lang.String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  /* standard dom */
  def addTransceiver(trackOrKind: MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  
  /* standard dom */
  val canTrickleIceCandidates: scala.Boolean | Null = js.native
  
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  val connectionState: RTCPeerConnectionState = js.native
  
  /* standard dom */
  def createAnswer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCAnswerOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  /** @deprecated */
  /* standard dom */
  def createAnswer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  
  /* standard dom */
  def createDataChannel(label: java.lang.String): RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  
  /* standard dom */
  def createOffer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  /** @deprecated */
  /* standard dom */
  def createOffer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  def createOffer(
    successCallback: RTCSessionDescriptionCallback,
    failureCallback: RTCPeerConnectionErrorCallback,
    options: RTCOfferOptions
  ): js.Promise[Unit] = js.native
  
  /* standard dom */
  val currentLocalDescription: RTCSessionDescription | Null = js.native
  
  /* standard dom */
  val currentRemoteDescription: RTCSessionDescription | Null = js.native
  
  /* standard dom */
  def getConfiguration(): RTCConfiguration = js.native
  
  /* standard dom */
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  
  /* standard dom */
  def getSenders(): js.Array[RTCRtpSender] = js.native
  
  /* standard dom */
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def getStats(selector: MediaStreamTrack): js.Promise[RTCStatsReport] = js.native
  
  /* standard dom */
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  
  /* standard dom */
  val iceConnectionState: RTCIceConnectionState = js.native
  
  /* standard dom */
  val iceGatheringState: RTCIceGatheringState = js.native
  
  /* standard dom */
  val localDescription: RTCSessionDescription | Null = js.native
  
  /* standard dom */
  var onconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var ondatachannel: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onicecandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onicecandidateerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var oniceconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onicegatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onnegotiationneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onsignalingstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var ontrack: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]) | Null = js.native
  
  /* standard dom */
  val pendingLocalDescription: RTCSessionDescription | Null = js.native
  
  /* standard dom */
  val pendingRemoteDescription: RTCSessionDescription | Null = js.native
  
  /* standard dom */
  val remoteDescription: RTCSessionDescription | Null = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_signalingstatechange")
  def removeEventListener(
    `type`: "signalingstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_iceconnectionstatechange")
  def removeEventListener(
    `type`: "iceconnectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_connectionstatechange")
  def removeEventListener(
    `type`: "connectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_negotiationneeded")
  def removeEventListener(`type`: "negotiationneeded", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icecandidate")
  def removeEventListener(
    `type`: "icecandidate",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_track")
  def removeEventListener(`type`: "track", listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icegatheringstatechange")
  def removeEventListener(
    `type`: "icegatheringstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icecandidateerror")
  def removeEventListener(`type`: "icecandidateerror", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_datachannel")
  def removeEventListener(
    `type`: "datachannel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_track")
  def removeEventListener(
    `type`: "track",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_signalingstatechange")
  def removeEventListener(
    `type`: "signalingstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icegatheringstatechange")
  def removeEventListener(
    `type`: "icegatheringstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_negotiationneeded")
  def removeEventListener(
    `type`: "negotiationneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_iceconnectionstatechange")
  def removeEventListener(
    `type`: "iceconnectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_datachannel")
  def removeEventListener(
    `type`: "datachannel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_connectionstatechange")
  def removeEventListener(
    `type`: "connectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icecandidateerror")
  def removeEventListener(
    `type`: "icecandidateerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icecandidate")
  def removeEventListener(
    `type`: "icecandidate",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icecandidate")
  def removeEventListener(
    `type`: "icecandidate",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_signalingstatechange")
  def removeEventListener(
    `type`: "signalingstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_connectionstatechange")
  def removeEventListener(
    `type`: "connectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_datachannel")
  def removeEventListener(
    `type`: "datachannel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icegatheringstatechange")
  def removeEventListener(
    `type`: "icegatheringstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_track")
  def removeEventListener(
    `type`: "track",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_iceconnectionstatechange")
  def removeEventListener(
    `type`: "iceconnectionstatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_negotiationneeded")
  def removeEventListener(
    `type`: "negotiationneeded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_icecandidateerror")
  def removeEventListener(
    `type`: "icecandidateerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def removeTrack(sender: RTCRtpSender): Unit = js.native
  
  /* standard dom */
  def restartIce(): Unit = js.native
  
  /* standard dom */
  val sctp: RTCSctpTransport | Null = js.native
  
  /* standard dom */
  def setConfiguration(): Unit = js.native
  def setConfiguration(configuration: RTCConfiguration): Unit = js.native
  
  /* standard dom */
  def setLocalDescription(): js.Promise[Unit] = js.native
  def setLocalDescription(description: RTCLocalSessionDescriptionInit): js.Promise[Unit] = js.native
  /** @deprecated */
  /* standard dom */
  def setLocalDescription(
    description: RTCLocalSessionDescriptionInit,
    successCallback: VoidFunction,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  /* standard dom */
  def setRemoteDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  /** @deprecated */
  /* standard dom */
  def setRemoteDescription(
    description: RTCSessionDescriptionInit,
    successCallback: VoidFunction,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  /* standard dom */
  val signalingState: RTCSignalingState = js.native
}
