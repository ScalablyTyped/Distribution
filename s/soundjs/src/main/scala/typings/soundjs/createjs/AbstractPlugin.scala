package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractPlugin extends js.Object {
  // methods
  def create(src: String, startTime: Double, duration: Double): AbstractSoundInstance
  def getVolume(): Double
  def isPreloadComplete(src: String): Boolean
  def isPreloadStarted(src: String): Boolean
  def isSupported(): Boolean
  def preload(loader: js.Object): Unit
  def register(loadItem: String, instances: Double): js.Object
  def removeAllSounds(src: String): Unit
  def removeSound(src: String): Unit
  def setMute(value: Boolean): Boolean
  def setVolume(value: Double): Boolean
}

object AbstractPlugin {
  @scala.inline
  def apply(
    create: (String, Double, Double) => AbstractSoundInstance,
    getVolume: () => Double,
    isPreloadComplete: String => Boolean,
    isPreloadStarted: String => Boolean,
    isSupported: () => Boolean,
    preload: js.Object => Unit,
    register: (String, Double) => js.Object,
    removeAllSounds: String => Unit,
    removeSound: String => Unit,
    setMute: Boolean => Boolean,
    setVolume: Double => Boolean
  ): AbstractPlugin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume))
    __obj.asInstanceOf[AbstractPlugin]
  }
}

