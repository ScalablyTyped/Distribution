package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashAudioPlugin extends AbstractPlugin {
  
  // properties
  var flashReady: Boolean = js.native
  
  var showOutput: Boolean = js.native
}
object FlashAudioPlugin {
  
  @scala.inline
  def apply(
    create: (String, Double, Double) => AbstractSoundInstance,
    flashReady: Boolean,
    getVolume: () => Double,
    isPreloadComplete: String => Boolean,
    isPreloadStarted: String => Boolean,
    isSupported: () => Boolean,
    preload: js.Object => Unit,
    register: (String, Double) => js.Object,
    removeAllSounds: String => Unit,
    removeSound: String => Unit,
    setMute: Boolean => Boolean,
    setVolume: Double => Boolean,
    showOutput: Boolean
  ): FlashAudioPlugin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), flashReady = flashReady.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume), showOutput = showOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashAudioPlugin]
  }
  
  @scala.inline
  implicit class FlashAudioPluginOps[Self <: FlashAudioPlugin] (val x: Self) extends AnyVal {
    
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
    def setFlashReady(value: Boolean): Self = this.set("flashReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOutput(value: Boolean): Self = this.set("showOutput", value.asInstanceOf[js.Any])
  }
}
