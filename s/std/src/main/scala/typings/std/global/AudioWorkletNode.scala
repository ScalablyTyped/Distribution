package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.AudioWorkletNodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioWorkletNode")
@js.native
class AudioWorkletNode protected ()
  extends typings.std.AudioWorkletNode {
  def this(context: typings.std.BaseAudioContext, name: java.lang.String) = this()
  def this(context: typings.std.BaseAudioContext, name: java.lang.String, options: AudioWorkletNodeOptions) = this()
}

@JSGlobal("AudioWorkletNode")
@js.native
object AudioWorkletNode
  extends Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* name */ java.lang.String, 
      typings.std.AudioWorkletNode
    ]
     with Instantiable3[
      /* context */ typings.std.BaseAudioContext, 
      /* name */ java.lang.String, 
      /* options */ AudioWorkletNodeOptions, 
      typings.std.AudioWorkletNode
    ]

