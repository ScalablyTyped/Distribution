package typings.soundjs.global.createjs

import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioPlugin")
@js.native
class WebAudioPlugin ()
  extends typings.soundjs.createjs.WebAudioPlugin

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

