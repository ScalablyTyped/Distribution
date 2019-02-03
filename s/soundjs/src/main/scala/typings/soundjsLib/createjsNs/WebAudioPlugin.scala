package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioPlugin")
@js.native
class WebAudioPlugin () extends AbstractPlugin {
  var context: stdLib.AudioContext = js.native
  var dynamicsCompressorNode: stdLib.DynamicsCompressorNode = js.native
  var gainNode: stdLib.GainNode = js.native
}

/* static members */
@JSGlobal("createjs.WebAudioPlugin")
@js.native
object WebAudioPlugin extends js.Object {
  // properties
  var context: stdLib.AudioContext = js.native
  // methods
  def isSupported(): scala.Boolean = js.native
  def playEmptySound(): scala.Unit = js.native
}

