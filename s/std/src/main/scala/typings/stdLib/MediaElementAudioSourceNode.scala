package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaElementAudioSourceNode extends AudioNode {
  val mediaElement: HTMLMediaElement = js.native
}

@JSGlobal("MediaElementAudioSourceNode")
@js.native
object MediaElementAudioSourceNode
  extends ScalablyTyped.runtime.Instantiable2[
      /* context */ AudioContext, 
      /* options */ MediaElementAudioSourceOptions, 
      MediaElementAudioSourceNode
    ]

