package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-webrtc", "MediaStream")
@js.native
class MediaStream protected () extends js.Object {
  def this(arg: js.Any) = this()
  
  var _reactTag: String = js.native
  
  var _tracks: js.Array[MediaStreamTrack] = js.native
  
  var active: Boolean = js.native
  
  def addTrack(track: MediaStreamTrack): Unit = js.native
  
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  
  def getTrackById(trackId: String): js.UndefOr[MediaStreamTrack] = js.native
  
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  
  var id: String = js.native
  
  def onactive(): js.UndefOr[Unit] = js.native
  
  def onaddtrack(): js.UndefOr[Unit] = js.native
  
  def oninactive(): js.UndefOr[Unit] = js.native
  
  def onremovetrack(): js.UndefOr[Unit] = js.native
  
  def release(): Unit = js.native
  
  def removeTrack(track: MediaStreamTrack): Unit = js.native
  
  def toURL(): String = js.native
}
