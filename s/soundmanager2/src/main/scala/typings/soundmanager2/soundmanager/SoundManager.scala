package typings.soundmanager2.soundmanager

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundManager extends SoundManagerProps {
  
  var audioFormats: js.UndefOr[StringDictionary[SoundManagerAudioFormat]] = js.native
  
  def canPlayLink(domElement: HTMLElement): Boolean = js.native
  
  def canPlayMIME(MIMEtype: String): Boolean = js.native
  
  def canPlayURL(mediaURL: String): Boolean = js.native
  
  def clearOnPosition(id: String, msecOffset: Double): SMSound = js.native
  def clearOnPosition(id: String, msecOffset: Double, callback: js.Function0[Unit]): SMSound = js.native
  
  /**
    * Creates a sound object, supporting an arbitrary number of optional arguments. Returns a SMSound object instance. At minimum, a url parameter is required.
    */
  def createSound(properties: SoundProperties): SMSound = js.native
  
  def destroySound(id: String): Unit = js.native
  
  def getMemoryUse(): Double = js.native
  
  def getSoundById(id: String): SMSound = js.native
  
  def load(id: String): SMSound = js.native
  def load(id: String, options: js.Object): SMSound = js.native
  
  def mute(): SMSound = js.native
  def mute(id: String): SMSound = js.native
  
  def ok(): Boolean = js.native
  
  def onPosition(id: String, msecOffset: Double, callback: js.Function1[/* eventPosition */ js.Any, Unit]): SMSound = js.native
  
  def pause(id: String): SMSound = js.native
  
  def pauseAll(): Unit = js.native
  
  def play(): SMSound = js.native
  def play(id: js.UndefOr[scala.Nothing], options: DefaultOptions): SMSound = js.native
  def play(id: js.UndefOr[scala.Nothing], options: Flash9Options): SMSound = js.native
  def play(id: String): SMSound = js.native
  def play(id: String, options: DefaultOptions): SMSound = js.native
  def play(id: String, options: Flash9Options): SMSound = js.native
  
  def reboot(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resume(id: String): SMSound = js.native
  
  def resumeAll(): Unit = js.native
  
  def setPan(id: String, volume: Double): SMSound = js.native
  
  def setPlaybackRate(id: String, playbackRate: Double): Unit = js.native
  
  def setPosition(id: String, msecOffset: Double): SMSound = js.native
  
  def setVolume(id: String, volume: Double): SMSound = js.native
  /**
    * Sets the volume of all sound objects. Accepted values: 0-100. Affects volume property.
    * @param volume Volume of all sound objects. Accepted values: 0 - 100
    */
  def setVolume(volume: Double): Unit = js.native
  
  def setup(options: SoundManagerProps): SoundManager = js.native
  
  def stop(id: String): SMSound = js.native
  
  def stopAll(): Unit = js.native
  
  def toggleMute(id: String): SMSound = js.native
  
  def togglePause(id: String): SMSound = js.native
  
  def unload(id: String): SMSound = js.native
  
  def unmute(): SMSound = js.native
  def unmute(id: String): SMSound = js.native
}
