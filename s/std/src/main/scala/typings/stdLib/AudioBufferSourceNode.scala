package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioBufferSourceNode extends AudioScheduledSourceNode {
  var buffer: AudioBuffer | scala.Null = js.native
  val detune: AudioParam = js.native
  var loop: scala.Boolean = js.native
  var loopEnd: scala.Double = js.native
  var loopStart: scala.Double = js.native
  val playbackRate: AudioParam = js.native
  def start(when: scala.Double, offset: scala.Double): scala.Unit = js.native
  def start(when: scala.Double, offset: scala.Double, duration: scala.Double): scala.Unit = js.native
}

@JSGlobal("AudioBufferSourceNode")
@js.native
class AudioBufferSourceNodeCls protected () extends AudioBufferSourceNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: AudioBufferSourceOptions) = this()
}

@JSGlobal("AudioBufferSourceNode")
@js.native
object AudioBufferSourceNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, AudioBufferSourceNode]
     with org.scalablytyped.runtime.Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ AudioBufferSourceOptions, 
      AudioBufferSourceNode
    ]

