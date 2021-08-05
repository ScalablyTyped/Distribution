package typings.reactNativeIncallManager

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-incall-manager", JSImport.Default)
  @js.native
  val default: InCallManager = js.native
  
  @js.native
  trait InCallManager extends StObject {
    
    def checkCameraPermission(): js.Promise[String] = js.native
    
    def checkRecordPermission(): js.Promise[String] = js.native
    
    def chooseAudioRoute(route: js.Any): js.Any = js.native
    
    def getAudioUri(audioType: String, fileType: String): js.Any = js.native
    
    def getIsWiredHeadsetPluggedIn(): js.Promise[js.Any] = js.native
    
    def pokeScreen(): Unit = js.native
    def pokeScreen(_timeout: Double): Unit = js.native
    
    def requestCameraPermission(): js.Promise[String] = js.native
    
    def requestRecordPermission(): js.Promise[String] = js.native
    
    def setFlashOn(): Double = js.native
    def setFlashOn(enable: Boolean): Double = js.native
    def setFlashOn(enable: Boolean, brightness: Double): Double = js.native
    def setFlashOn(enable: Unit, brightness: Double): Double = js.native
    
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
    def startRingtone(ringtone: String): Unit = js.native
    def startRingtone(ringtone: String, vibrate_pattern: js.Array[js.Any]): Unit = js.native
    def startRingtone(ringtone: String, vibrate_pattern: js.Array[js.Any], ios_category: String): Unit = js.native
    def startRingtone(ringtone: String, vibrate_pattern: js.Array[js.Any], ios_category: String, seconds: Double): Unit = js.native
    def startRingtone(ringtone: String, vibrate_pattern: js.Array[js.Any], ios_category: Unit, seconds: Double): Unit = js.native
    def startRingtone(ringtone: String, vibrate_pattern: Unit, ios_category: String): Unit = js.native
    def startRingtone(ringtone: String, vibrate_pattern: Unit, ios_category: String, seconds: Double): Unit = js.native
    def startRingtone(ringtone: String, vibrate_pattern: Unit, ios_category: Unit, seconds: Double): Unit = js.native
    def startRingtone(ringtone: Unit, vibrate_pattern: js.Array[js.Any]): Unit = js.native
    def startRingtone(ringtone: Unit, vibrate_pattern: js.Array[js.Any], ios_category: String): Unit = js.native
    def startRingtone(ringtone: Unit, vibrate_pattern: js.Array[js.Any], ios_category: String, seconds: Double): Unit = js.native
    def startRingtone(ringtone: Unit, vibrate_pattern: js.Array[js.Any], ios_category: Unit, seconds: Double): Unit = js.native
    def startRingtone(ringtone: Unit, vibrate_pattern: Unit, ios_category: String): Unit = js.native
    def startRingtone(ringtone: Unit, vibrate_pattern: Unit, ios_category: String, seconds: Double): Unit = js.native
    def startRingtone(ringtone: Unit, vibrate_pattern: Unit, ios_category: Unit, seconds: Double): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(setup: StopSetup): Unit = js.native
    
    def stopRingback(): Unit = js.native
    
    def stopRingtone(): Unit = js.native
    
    def turnScreenOff(): Unit = js.native
    
    def turnScreenOn(): Unit = js.native
  }
  
  trait StartSetup extends StObject {
    
    var auto: js.UndefOr[Boolean] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var ringback: js.UndefOr[String] = js.undefined
  }
  object StartSetup {
    
    inline def apply(): StartSetup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartSetup]
    }
    
    extension [Self <: StartSetup](x: Self) {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setRingback(value: String): Self = StObject.set(x, "ringback", value.asInstanceOf[js.Any])
      
      inline def setRingbackUndefined: Self = StObject.set(x, "ringback", js.undefined)
    }
  }
  
  trait StopSetup extends StObject {
    
    var busytone: js.UndefOr[String] = js.undefined
  }
  object StopSetup {
    
    inline def apply(): StopSetup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopSetup]
    }
    
    extension [Self <: StopSetup](x: Self) {
      
      inline def setBusytone(value: String): Self = StObject.set(x, "busytone", value.asInstanceOf[js.Any])
      
      inline def setBusytoneUndefined: Self = StObject.set(x, "busytone", js.undefined)
    }
  }
  
  type _To = InCallManager
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: InCallManager = default
}
