package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "writePayload")
@js.native
object writePayload extends js.Object {
  def apply(frame: FrameWithPayload, buffer: Buffer, encoders: Encoders[_], offset: Double): Unit = js.native
}

