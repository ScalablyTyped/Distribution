package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StereoPannerNode extends AudioNode {
  val pan: AudioParam = js.native
}

@JSGlobal("StereoPannerNode")
@js.native
object StereoPannerNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, StereoPannerNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ StereoPannerOptions, StereoPannerNode]

