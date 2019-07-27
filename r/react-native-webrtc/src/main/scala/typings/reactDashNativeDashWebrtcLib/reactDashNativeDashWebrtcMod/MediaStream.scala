package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-webrtc", "MediaStream")
@js.native
class MediaStream protected () extends js.Object {
  def this(arg: js.Any) = this()
  var _reactTag: java.lang.String = js.native
  var _tracks: js.Array[MediaStreamTrack] = js.native
  var active: scala.Boolean = js.native
  var id: java.lang.String = js.native
  def addTrack(track: MediaStreamTrack): scala.Unit = js.native
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  def getTrackById(trackId: java.lang.String): js.UndefOr[MediaStreamTrack] = js.native
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  def onactive(): js.UndefOr[scala.Unit] = js.native
  def onaddtrack(): js.UndefOr[scala.Unit] = js.native
  def oninactive(): js.UndefOr[scala.Unit] = js.native
  def onremovetrack(): js.UndefOr[scala.Unit] = js.native
  def release(): scala.Unit = js.native
  def removeTrack(track: MediaStreamTrack): scala.Unit = js.native
  def toURL(): java.lang.String = js.native
}

