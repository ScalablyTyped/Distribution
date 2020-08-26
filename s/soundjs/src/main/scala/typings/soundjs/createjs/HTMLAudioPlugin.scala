package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAudioPlugin extends AbstractPlugin {
  // properties
  var defaultNumChannels: Double = js.native
  var enableIOS: Boolean = js.native
}

object HTMLAudioPlugin {
  @scala.inline
  def apply(
    create: (String, Double, Double) => AbstractSoundInstance,
    defaultNumChannels: Double,
    enableIOS: Boolean,
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
  ): HTMLAudioPlugin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), defaultNumChannels = defaultNumChannels.asInstanceOf[js.Any], enableIOS = enableIOS.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume))
    __obj.asInstanceOf[HTMLAudioPlugin]
  }
  @scala.inline
  implicit class HTMLAudioPluginOps[Self <: HTMLAudioPlugin] (val x: Self) extends AnyVal {
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
    def setDefaultNumChannels(value: Double): Self = this.set("defaultNumChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableIOS(value: Boolean): Self = this.set("enableIOS", value.asInstanceOf[js.Any])
  }
  
}

