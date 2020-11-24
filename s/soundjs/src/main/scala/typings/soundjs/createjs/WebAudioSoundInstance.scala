package typings.soundjs.createjs

import typings.std.AudioNode
import typings.std.GainNode
import typings.std.PannerNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAudioSoundInstance extends AbstractSoundInstance {
  
  var gainNode: GainNode = js.native
  
  var panNode: PannerNode = js.native
  
  var sourceNode: AudioNode = js.native
}
