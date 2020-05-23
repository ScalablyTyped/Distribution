package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPlugin extends js.Object {
  var flashReady: Boolean
  var showOutput: Boolean
  // methods
  def create(src: String): AbstractSoundInstance
  def getVolume(): Double
  def isPreloadStarted(src: String): Boolean
  def preload(src: String, instance: js.Object): Unit
  def register(src: String, instances: Double): js.Object
  def removeAllSounds(): Unit
  def removeSound(src: String): Unit
  def setMute(value: Boolean): Boolean
  def setVolume(value: Double): Boolean
}

object FlashPlugin {
  @scala.inline
  def apply(
    create: String => AbstractSoundInstance,
    flashReady: Boolean,
    getVolume: () => Double,
    isPreloadStarted: String => Boolean,
    preload: (String, js.Object) => Unit,
    register: (String, Double) => js.Object,
    removeAllSounds: () => Unit,
    removeSound: String => Unit,
    setMute: Boolean => Boolean,
    setVolume: Double => Boolean,
    showOutput: Boolean
  ): FlashPlugin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), flashReady = flashReady.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), preload = js.Any.fromFunction2(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction0(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume), showOutput = showOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashPlugin]
  }
}

