package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
class WebAudioSoundInstance protected () extends AbstractSoundInstance {
  def this(src: java.lang.String, startTime: scala.Double, duration: scala.Double, playbackResource: js.Object) = this()
  var gainNode: stdLib.GainNode = js.native
  var panNode: stdLib.PannerNode = js.native
  var sourceNode: stdLib.AudioNode = js.native
}

@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
object WebAudioSoundInstance extends js.Object {
  // properties
  var context: stdLib.AudioContext = js.native
  var destinationNode: stdLib.AudioNode = js.native
}

