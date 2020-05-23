package typings.std

import typings.std.stdStrings.connectionstatechange
import typings.std.stdStrings.datachannel
import typings.std.stdStrings.icecandidate
import typings.std.stdStrings.icecandidateerror
import typings.std.stdStrings.iceconnectionstatechange
import typings.std.stdStrings.icegatheringstatechange
import typings.std.stdStrings.negotiationneeded
import typings.std.stdStrings.signalingstatechange
import typings.std.stdStrings.statsended
import typings.std.stdStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed. */
@js.native
trait RTCPeerConnection extends EventTarget {
  val canTrickleIceCandidates: scala.Boolean | Null = js.native
  val connectionState: RTCPeerConnectionState = js.native
  val currentLocalDescription: RTCSessionDescription | Null = js.native
  val currentRemoteDescription: RTCSessionDescription | Null = js.native
  val iceConnectionState: RTCIceConnectionState = js.native
  val iceGatheringState: RTCIceGatheringState = js.native
  val idpErrorInfo: java.lang.String | Null = js.native
  val idpLoginUrl: java.lang.String | Null = js.native
  val localDescription: RTCSessionDescription | Null = js.native
  var onconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var ondatachannel: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _]) | Null = js.native
  var onicecandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]) | Null = js.native
  var onicecandidateerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]) | Null = js.native
  var oniceconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onicegatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onnegotiationneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onsignalingstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onstatsended: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]) | Null = js.native
  var ontrack: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]) | Null = js.native
  val peerIdentity: js.Promise[RTCIdentityAssertion] = js.native
  val pendingLocalDescription: RTCSessionDescription | Null = js.native
  val pendingRemoteDescription: RTCSessionDescription | Null = js.native
  val remoteDescription: RTCSessionDescription | Null = js.native
  val sctp: RTCSctpTransport | Null = js.native
  val signalingState: RTCSignalingState = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(`type`: connectionstatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(`type`: negotiationneeded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(`type`: signalingstatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(`type`: statsended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidateInit): js.Promise[Unit] = js.native
  def addTrack(track: MediaStreamTrack, streams: MediaStream*): RTCRtpSender = js.native
  def addTransceiver(trackOrKind: java.lang.String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def close(): Unit = js.native
  def createAnswer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  def createDataChannel(label: java.lang.String): RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  def createOffer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  def getConfiguration(): RTCConfiguration = js.native
  def getIdentityAssertion(): js.Promise[java.lang.String] = js.native
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  def getSenders(): js.Array[RTCRtpSender] = js.native
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def getStats(selector: MediaStreamTrack): js.Promise[RTCStatsReport] = js.native
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(`type`: connectionstatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(`type`: negotiationneeded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(`type`: signalingstatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(`type`: statsended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def removeTrack(sender: RTCRtpSender): Unit = js.native
  def setConfiguration(configuration: RTCConfiguration): Unit = js.native
  def setIdentityProvider(provider: java.lang.String): Unit = js.native
  def setIdentityProvider(provider: java.lang.String, options: RTCIdentityProviderOptions): Unit = js.native
  def setLocalDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  def setRemoteDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
}

