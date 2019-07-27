package typings
package reactDashNativeDashIncallDashManagerLib.reactDashNativeDashIncallDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InCallManager extends js.Object {
  def checkCameraPermission(): js.Promise[java.lang.String] = js.native
  def checkRecordPermission(): js.Promise[java.lang.String] = js.native
  def chooseAudioRoute(route: js.Any): js.Any = js.native
  def getAudioUri(audioType: java.lang.String, fileType: java.lang.String): js.Any = js.native
  def getIsWiredHeadsetPluggedIn(): js.Promise[_] = js.native
  def pokeScreen(): scala.Unit = js.native
  def pokeScreen(_timeout: scala.Double): scala.Unit = js.native
  def requestCameraPermission(): js.Promise[java.lang.String] = js.native
  def requestRecordPermission(): js.Promise[java.lang.String] = js.native
  def setFlashOn(): scala.Double = js.native
  def setFlashOn(enable: scala.Boolean): scala.Double = js.native
  def setFlashOn(enable: scala.Boolean, brightness: scala.Double): scala.Double = js.native
  def setForceSpeakerphoneOn(): scala.Unit = js.native
  def setForceSpeakerphoneOn(_flag: scala.Boolean): scala.Unit = js.native
  def setKeepScreenOn(): scala.Unit = js.native
  def setKeepScreenOn(enable: scala.Boolean): scala.Unit = js.native
  def setMicrophoneMute(): scala.Unit = js.native
  def setMicrophoneMute(enable: scala.Boolean): scala.Unit = js.native
  def setSpeakerphoneOn(): scala.Unit = js.native
  def setSpeakerphoneOn(enable: scala.Boolean): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def start(setup: StartSetup): scala.Unit = js.native
  def startRingback(): scala.Unit = js.native
  def startRingback(ringback: java.lang.String): scala.Unit = js.native
  def startRingtone(): scala.Unit = js.native
  def startRingtone(ringtone: java.lang.String): scala.Unit = js.native
  def startRingtone(ringtone: java.lang.String, vibrate_pattern: js.Array[_]): scala.Unit = js.native
  def startRingtone(ringtone: java.lang.String, vibrate_pattern: js.Array[_], ios_category: java.lang.String): scala.Unit = js.native
  def startRingtone(
    ringtone: java.lang.String,
    vibrate_pattern: js.Array[_],
    ios_category: java.lang.String,
    seconds: scala.Double
  ): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stop(setup: StopSetup): scala.Unit = js.native
  def stopRingback(): scala.Unit = js.native
  def stopRingtone(): scala.Unit = js.native
  def turnScreenOff(): scala.Unit = js.native
  def turnScreenOn(): scala.Unit = js.native
}

