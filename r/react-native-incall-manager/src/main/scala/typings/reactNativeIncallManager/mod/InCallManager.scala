package typings.reactNativeIncallManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InCallManager extends js.Object {
  
  def checkCameraPermission(): js.Promise[String] = js.native
  
  def checkRecordPermission(): js.Promise[String] = js.native
  
  def chooseAudioRoute(route: js.Any): js.Any = js.native
  
  def getAudioUri(audioType: String, fileType: String): js.Any = js.native
  
  def getIsWiredHeadsetPluggedIn(): js.Promise[_] = js.native
  
  def pokeScreen(): Unit = js.native
  def pokeScreen(_timeout: Double): Unit = js.native
  
  def requestCameraPermission(): js.Promise[String] = js.native
  
  def requestRecordPermission(): js.Promise[String] = js.native
  
  def setFlashOn(): Double = js.native
  def setFlashOn(enable: js.UndefOr[scala.Nothing], brightness: Double): Double = js.native
  def setFlashOn(enable: Boolean): Double = js.native
  def setFlashOn(enable: Boolean, brightness: Double): Double = js.native
  
  def setForceSpeakerphoneOn(): Unit = js.native
  def setForceSpeakerphoneOn(_flag: Boolean): Unit = js.native
  
  def setKeepScreenOn(): Unit = js.native
  def setKeepScreenOn(enable: Boolean): Unit = js.native
  
  def setMicrophoneMute(): Unit = js.native
  def setMicrophoneMute(enable: Boolean): Unit = js.native
  
  def setSpeakerphoneOn(): Unit = js.native
  def setSpeakerphoneOn(enable: Boolean): Unit = js.native
  
  def start(): Unit = js.native
  def start(setup: StartSetup): Unit = js.native
  
  def startRingback(): Unit = js.native
  def startRingback(ringback: String): Unit = js.native
  
  def startRingtone(): Unit = js.native
  def startRingtone(
    ringtone: js.UndefOr[scala.Nothing],
    vibrate_pattern: js.UndefOr[scala.Nothing],
    ios_category: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Unit = js.native
  def startRingtone(
    ringtone: js.UndefOr[scala.Nothing],
    vibrate_pattern: js.UndefOr[scala.Nothing],
    ios_category: String
  ): Unit = js.native
  def startRingtone(
    ringtone: js.UndefOr[scala.Nothing],
    vibrate_pattern: js.UndefOr[scala.Nothing],
    ios_category: String,
    seconds: Double
  ): Unit = js.native
  def startRingtone(ringtone: js.UndefOr[scala.Nothing], vibrate_pattern: js.Array[_]): Unit = js.native
  def startRingtone(
    ringtone: js.UndefOr[scala.Nothing],
    vibrate_pattern: js.Array[_],
    ios_category: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Unit = js.native
  def startRingtone(ringtone: js.UndefOr[scala.Nothing], vibrate_pattern: js.Array[_], ios_category: String): Unit = js.native
  def startRingtone(
    ringtone: js.UndefOr[scala.Nothing],
    vibrate_pattern: js.Array[_],
    ios_category: String,
    seconds: Double
  ): Unit = js.native
  def startRingtone(ringtone: String): Unit = js.native
  def startRingtone(
    ringtone: String,
    vibrate_pattern: js.UndefOr[scala.Nothing],
    ios_category: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Unit = js.native
  def startRingtone(ringtone: String, vibrate_pattern: js.UndefOr[scala.Nothing], ios_category: String): Unit = js.native
  def startRingtone(
    ringtone: String,
    vibrate_pattern: js.UndefOr[scala.Nothing],
    ios_category: String,
    seconds: Double
  ): Unit = js.native
  def startRingtone(ringtone: String, vibrate_pattern: js.Array[_]): Unit = js.native
  def startRingtone(
    ringtone: String,
    vibrate_pattern: js.Array[_],
    ios_category: js.UndefOr[scala.Nothing],
    seconds: Double
  ): Unit = js.native
  def startRingtone(ringtone: String, vibrate_pattern: js.Array[_], ios_category: String): Unit = js.native
  def startRingtone(ringtone: String, vibrate_pattern: js.Array[_], ios_category: String, seconds: Double): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(setup: StopSetup): Unit = js.native
  
  def stopRingback(): Unit = js.native
  
  def stopRingtone(): Unit = js.native
  
  def turnScreenOff(): Unit = js.native
  
  def turnScreenOn(): Unit = js.native
}
