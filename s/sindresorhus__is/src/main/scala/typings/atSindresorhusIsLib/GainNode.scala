package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GainNode extends AudioNode {
  val gain: AudioParam = js.native
}

@JSGlobal("GainNode")
@js.native
object GainNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, GainNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ GainOptions, GainNode]

