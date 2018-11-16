package typings
package stdLib

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

