package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.FlashAudioPlugin")
@js.native
class FlashAudioPlugin () extends AbstractPlugin {
  // properties
  var flashReady: scala.Boolean = js.native
  var showOutput: scala.Boolean = js.native
}

@JSGlobal("createjs.FlashAudioPlugin")
@js.native
object FlashAudioPlugin extends js.Object {
  var swfPath: java.lang.String = js.native
  // methods
  def isSupported(): scala.Boolean = js.native
}

