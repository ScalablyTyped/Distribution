package typings.soundjs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.FlashAudioPlugin")
@js.native
class FlashAudioPlugin () extends AbstractPlugin {
  // properties
  var flashReady: Boolean = js.native
  var showOutput: Boolean = js.native
}

/* static members */
@JSGlobal("createjs.FlashAudioPlugin")
@js.native
object FlashAudioPlugin extends js.Object {
  var swfPath: String = js.native
  // methods
  def isSupported(): Boolean = js.native
}

