package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundManager extends SoundManagerProps {
  def canPlayLink(domElement: stdLib.HTMLElement): scala.Boolean = js.native
  def canPlayMIME(MIMEtype: java.lang.String): scala.Boolean = js.native
  def canPlayURL(mediaURL: java.lang.String): scala.Boolean = js.native
  def clearOnPosition(id: java.lang.String, msecOffset: scala.Double): SMSound = js.native
  def clearOnPosition(id: java.lang.String, msecOffset: scala.Double, callback: js.Function0[scala.Unit]): SMSound = js.native
  /**
           * Creates a sound object, supporting an arbitrary number of optional arguments. Returns a SMSound object instance. At minimum, a url parameter is required.
           */
  def createSound(properties: SoundProperties): SMSound = js.native
  def destroySound(id: java.lang.String): scala.Unit = js.native
  def getMemoryUse(): scala.Double = js.native
  def getSoundById(id: java.lang.String): SMSound = js.native
  def load(id: java.lang.String): SMSound = js.native
  def load(id: java.lang.String, options: js.Object): SMSound = js.native
  def mute(): SMSound = js.native
  def mute(id: java.lang.String): SMSound = js.native
  def ok(): scala.Boolean = js.native
  def onPosition(
    id: java.lang.String,
    msecOffset: scala.Double,
    callback: js.Function1[/* eventPosition */ js.Any, scala.Unit]
  ): SMSound = js.native
  def pause(id: java.lang.String): SMSound = js.native
  def pauseAll(): scala.Unit = js.native
  def play(): SMSound = js.native
  def play(id: java.lang.String): SMSound = js.native
  def play(id: java.lang.String, options: DefaultOptions): SMSound = js.native
  def play(id: java.lang.String, options: Flash9Options): SMSound = js.native
  def reboot(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resume(id: java.lang.String): SMSound = js.native
  def resumeAll(): scala.Unit = js.native
  def setPan(id: java.lang.String, volume: scala.Double): SMSound = js.native
  def setPlaybackRate(id: java.lang.String, playbackRate: scala.Double): scala.Unit = js.native
  def setPosition(id: java.lang.String, msecOffset: scala.Double): SMSound = js.native
  def setVolume(id: java.lang.String, volume: scala.Double): SMSound = js.native
  /**
           * Sets the volume of all sound objects. Accepted values: 0-100. Affects volume property.
           * @param volume Volume of all sound objects. Accepted values: 0 - 100
           */
  def setVolume(volume: scala.Double): scala.Unit = js.native
  def setup(options: SoundManagerProps): SoundManager = js.native
  def stop(id: java.lang.String): SMSound = js.native
  def stopAll(): scala.Unit = js.native
  def toggleMute(id: java.lang.String): SMSound = js.native
  def togglePause(id: java.lang.String): SMSound = js.native
  def unload(id: java.lang.String): SMSound = js.native
  def unmute(): SMSound = js.native
  def unmute(id: java.lang.String): SMSound = js.native
}

