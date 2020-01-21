package typings.streamMeter

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-meter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class StreamMeter () extends Transform {
    def this(maxBytes: Double) = this()
    var bytes: Double = js.native
    var maxBytes: Double = js.native
  }
  
  def apply(): StreamMeter = js.native
  def apply(maxBytes: Double): StreamMeter = js.native
}

