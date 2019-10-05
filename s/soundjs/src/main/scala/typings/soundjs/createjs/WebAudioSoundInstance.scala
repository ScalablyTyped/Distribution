package typings.soundjs.createjs

import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.GainNode
import typings.std.PannerNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
class WebAudioSoundInstance protected () extends AbstractSoundInstance {
  def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
  var gainNode: GainNode = js.native
  var panNode: PannerNode = js.native
  var sourceNode: AudioNode = js.native
}

/* static members */
@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
object WebAudioSoundInstance extends js.Object {
  // properties
  var context: AudioContext = js.native
  var destinationNode: AudioNode = js.native
}

