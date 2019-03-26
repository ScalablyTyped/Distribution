package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIRFilterNode extends AudioNode {
  def getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array): scala.Unit = js.native
}

@JSGlobal("IIRFilterNode")
@js.native
class IIRFilterNodeCls protected () extends IIRFilterNode {
  def this(context: BaseAudioContext, options: IIRFilterOptions) = this()
}

@JSGlobal("IIRFilterNode")
@js.native
object IIRFilterNode
  extends org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ IIRFilterOptions, IIRFilterNode]

