package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPlugin extends js.Object {
  // methods
  def create(src: String, startTime: Double, duration: Double): AbstractSoundInstance = js.native
  def getVolume(): Double = js.native
  def isPreloadComplete(src: String): Boolean = js.native
  def isPreloadStarted(src: String): Boolean = js.native
  def isSupported(): Boolean = js.native
  def preload(loader: js.Object): Unit = js.native
  def register(loadItem: String, instances: Double): js.Object = js.native
  def removeAllSounds(src: String): Unit = js.native
  def removeSound(src: String): Unit = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Boolean = js.native
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
  @scala.inline
  implicit class AbstractPluginOps[Self <: AbstractPlugin] (val x: Self) extends AnyVal {
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
    def setCreate(value: (String, Double, Double) => AbstractSoundInstance): Self = this.set("create", js.Any.fromFunction3(value))
    @scala.inline
    def setGetVolume(value: () => Double): Self = this.set("getVolume", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPreloadComplete(value: String => Boolean): Self = this.set("isPreloadComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setIsPreloadStarted(value: String => Boolean): Self = this.set("isPreloadStarted", js.Any.fromFunction1(value))
    @scala.inline
    def setIsSupported(value: () => Boolean): Self = this.set("isSupported", js.Any.fromFunction0(value))
    @scala.inline
    def setPreload(value: js.Object => Unit): Self = this.set("preload", js.Any.fromFunction1(value))
    @scala.inline
    def setRegister(value: (String, Double) => js.Object): Self = this.set("register", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveAllSounds(value: String => Unit): Self = this.set("removeAllSounds", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveSound(value: String => Unit): Self = this.set("removeSound", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMute(value: Boolean => Boolean): Self = this.set("setMute", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVolume(value: Double => Boolean): Self = this.set("setVolume", js.Any.fromFunction1(value))
  }
  
}

