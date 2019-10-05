package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestChannelFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "deserializeRequestChannelFrame")
@js.native
object deserializeRequestChannelFrame extends js.Object {
  def apply(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): RequestChannelFrame = js.native
}

