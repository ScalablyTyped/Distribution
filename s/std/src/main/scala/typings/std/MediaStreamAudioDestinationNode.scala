package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamAudioDestinationNode extends AudioNode {
  val stream: MediaStream = js.native
}

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
object MediaStreamAudioDestinationNode
  extends Instantiable1[/* context */ AudioContext, MediaStreamAudioDestinationNode]
     with Instantiable2[
      /* context */ AudioContext, 
      /* options */ AudioNodeOptions, 
      MediaStreamAudioDestinationNode
    ]

