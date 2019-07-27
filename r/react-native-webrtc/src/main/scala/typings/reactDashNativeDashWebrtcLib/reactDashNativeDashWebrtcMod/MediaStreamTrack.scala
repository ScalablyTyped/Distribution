package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-webrtc", "MediaStreamTrack")
@js.native
class MediaStreamTrack () extends js.Object {
  var _enabled: scala.Boolean = js.native
  var enabled: scala.Boolean = js.native
  var id: java.lang.String = js.native
  var kind: java.lang.String = js.native
  var label: java.lang.String = js.native
  var muted: scala.Boolean = js.native
  var readonly: scala.Boolean = js.native
  var readyState: MediaStreamTrackState = js.native
  var remote: scala.Boolean = js.native
  /* private */ def _switchCamera(): scala.Unit = js.native
  def applyConstraints(): scala.Unit = js.native
  def getCapabilities(): scala.Unit = js.native
  def getConstraints(): scala.Unit = js.native
  def getSettings(): scala.Unit = js.native
  def onended(): js.UndefOr[scala.Unit] = js.native
  def onmute(): js.UndefOr[scala.Unit] = js.native
  def onunmute(): js.UndefOr[scala.Unit] = js.native
  def overconstrained(): js.UndefOr[scala.Unit] = js.native
  def release(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

