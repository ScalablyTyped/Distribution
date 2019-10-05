package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "readPayload")
@js.native
object readPayload extends js.Object {
  def apply(buffer: Buffer, frame: FrameWithPayload, encoders: Encoders[_], offset: Double): Unit = js.native
}

