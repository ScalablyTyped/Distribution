package typings.soundjs.createjs

import typings.std.AudioContext
import typings.std.DynamicsCompressorNode
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAudioPlugin extends AbstractPlugin {
  var context: AudioContext = js.native
  var dynamicsCompressorNode: DynamicsCompressorNode = js.native
  var gainNode: GainNode = js.native
}

object WebAudioPlugin {
  @scala.inline
  def apply(
    context: AudioContext,
    create: (String, Double, Double) => AbstractSoundInstance,
    dynamicsCompressorNode: DynamicsCompressorNode,
    gainNode: GainNode,
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
  ): WebAudioPlugin = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], create = js.Any.fromFunction3(create), dynamicsCompressorNode = dynamicsCompressorNode.asInstanceOf[js.Any], gainNode = gainNode.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume))
    __obj.asInstanceOf[WebAudioPlugin]
  }
  @scala.inline
  implicit class WebAudioPluginOps[Self <: WebAudioPlugin] (val x: Self) extends AnyVal {
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
    def setContext(value: AudioContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicsCompressorNode(value: DynamicsCompressorNode): Self = this.set("dynamicsCompressorNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setGainNode(value: GainNode): Self = this.set("gainNode", value.asInstanceOf[js.Any])
  }
  
}

