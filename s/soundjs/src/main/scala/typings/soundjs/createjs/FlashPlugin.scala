package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashPlugin extends js.Object {
  var flashReady: Boolean = js.native
  var showOutput: Boolean = js.native
  // methods
  def create(src: String): AbstractSoundInstance = js.native
  def getVolume(): Double = js.native
  def isPreloadStarted(src: String): Boolean = js.native
  def preload(src: String, instance: js.Object): Unit = js.native
  def register(src: String, instances: Double): js.Object = js.native
  def removeAllSounds(): Unit = js.native
  def removeSound(src: String): Unit = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Boolean = js.native
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
  @scala.inline
  implicit class FlashPluginOps[Self <: FlashPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: String => AbstractSoundInstance): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setFlashReady(value: Boolean): Self = this.set("flashReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetVolume(value: () => Double): Self = this.set("getVolume", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPreloadStarted(value: String => Boolean): Self = this.set("isPreloadStarted", js.Any.fromFunction1(value))
    @scala.inline
    def setPreload(value: (String, js.Object) => Unit): Self = this.set("preload", js.Any.fromFunction2(value))
    @scala.inline
    def setRegister(value: (String, Double) => js.Object): Self = this.set("register", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveAllSounds(value: () => Unit): Self = this.set("removeAllSounds", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveSound(value: String => Unit): Self = this.set("removeSound", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMute(value: Boolean => Boolean): Self = this.set("setMute", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVolume(value: Double => Boolean): Self = this.set("setVolume", js.Any.fromFunction1(value))
    @scala.inline
    def setShowOutput(value: Boolean): Self = this.set("showOutput", value.asInstanceOf[js.Any])
  }
  
}

