package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicsCompressorNode extends AudioNode {
  val attack: AudioParam = js.native
  val knee: AudioParam = js.native
  val ratio: AudioParam = js.native
  val reduction: scala.Double = js.native
  val release: AudioParam = js.native
  val threshold: AudioParam = js.native
}

@JSGlobal("DynamicsCompressorNode")
@js.native
object DynamicsCompressorNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, DynamicsCompressorNode]
     with org.scalablytyped.runtime.Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ DynamicsCompressorOptions, 
      DynamicsCompressorNode
    ]

