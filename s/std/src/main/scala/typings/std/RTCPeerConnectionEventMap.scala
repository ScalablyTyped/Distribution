package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionEventMap extends js.Object {
  var connectionstatechange: Event
  var datachannel: RTCDataChannelEvent
  var icecandidate: RTCPeerConnectionIceEvent
  var icecandidateerror: RTCPeerConnectionIceErrorEvent
  var iceconnectionstatechange: Event
  var icegatheringstatechange: Event
  var negotiationneeded: Event
  var signalingstatechange: Event
  var statsended: RTCStatsEvent
  var track: RTCTrackEvent
}

object RTCPeerConnectionEventMap {
  @scala.inline
  def apply(
    connectionstatechange: Event,
    datachannel: RTCDataChannelEvent,
    icecandidate: RTCPeerConnectionIceEvent,
    icecandidateerror: RTCPeerConnectionIceErrorEvent,
    iceconnectionstatechange: Event,
    icegatheringstatechange: Event,
    negotiationneeded: Event,
    signalingstatechange: Event,
    statsended: RTCStatsEvent,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange, datachannel = datachannel, icecandidate = icecandidate, icecandidateerror = icecandidateerror, iceconnectionstatechange = iceconnectionstatechange, icegatheringstatechange = icegatheringstatechange, negotiationneeded = negotiationneeded, signalingstatechange = signalingstatechange, statsended = statsended, track = track)
  
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
}

