package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode extends AudioNode {
  val attack: AudioParam = js.native
  val knee: AudioParam = js.native
  val ratio: AudioParam = js.native
  val reduction: Double = js.native
  val release: AudioParam = js.native
  val threshold: AudioParam = js.native
}

@JSGlobal("DynamicsCompressorNode")
@js.native
class DynamicsCompressorNodeCls protected () extends DynamicsCompressorNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: DynamicsCompressorOptions) = this()
}

@JSGlobal("DynamicsCompressorNode")
@js.native
object DynamicsCompressorNode
  extends Instantiable1[/* context */ BaseAudioContext, DynamicsCompressorNode]
     with Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ DynamicsCompressorOptions, 
      DynamicsCompressorNode
    ]

