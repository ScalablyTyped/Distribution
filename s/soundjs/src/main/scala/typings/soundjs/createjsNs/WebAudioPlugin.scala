package typings.soundjs.createjsNs

import typings.std.AudioContext
import typings.std.DynamicsCompressorNode
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioPlugin")
@js.native
class WebAudioPlugin () extends AbstractPlugin {
  var context: AudioContext = js.native
  var dynamicsCompressorNode: DynamicsCompressorNode = js.native
  var gainNode: GainNode = js.native
}

/* static members */
@JSGlobal("createjs.WebAudioPlugin")
@js.native
object WebAudioPlugin extends js.Object {
  // properties
  var context: AudioContext = js.native
  // methods
  def isSupported(): Boolean = js.native
  def playEmptySound(): Unit = js.native
}

