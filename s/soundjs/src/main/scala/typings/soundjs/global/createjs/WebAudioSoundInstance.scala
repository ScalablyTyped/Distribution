package typings.soundjs.global.createjs

import typings.std.AudioContext
import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
class WebAudioSoundInstance protected ()
  extends typings.soundjs.createjs.WebAudioSoundInstance {
  def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
}
/* static members */
@JSGlobal("createjs.WebAudioSoundInstance")
@js.native
object WebAudioSoundInstance extends js.Object {
  
  // properties
  var context: AudioContext = js.native
  
  var destinationNode: AudioNode = js.native
}
