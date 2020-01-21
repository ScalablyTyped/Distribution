package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionEventMap extends js.Object {
  var connectionstatechange: Event_
  var datachannel: RTCDataChannelEvent
  var icecandidate: RTCPeerConnectionIceEvent
  var icecandidateerror: RTCPeerConnectionIceErrorEvent
  var iceconnectionstatechange: Event_
  var icegatheringstatechange: Event_
  var negotiationneeded: Event_
  var signalingstatechange: Event_
  var statsended: RTCStatsEvent
  var track: RTCTrackEvent
}

object RTCPeerConnectionEventMap {
  @scala.inline
  def apply(
    connectionstatechange: Event_,
    datachannel: RTCDataChannelEvent,
    icecandidate: RTCPeerConnectionIceEvent,
    icecandidateerror: RTCPeerConnectionIceErrorEvent,
    iceconnectionstatechange: Event_,
    icegatheringstatechange: Event_,
    negotiationneeded: Event_,
    signalingstatechange: Event_,
    statsended: RTCStatsEvent,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange.asInstanceOf[js.Any], datachannel = datachannel.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], icecandidateerror = icecandidateerror.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any], statsended = statsended.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
}

