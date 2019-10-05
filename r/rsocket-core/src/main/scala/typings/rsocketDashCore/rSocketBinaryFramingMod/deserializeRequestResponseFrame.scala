package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestResponseFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "deserializeRequestResponseFrame")
@js.native
object deserializeRequestResponseFrame extends js.Object {
  def apply(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): RequestResponseFrame = js.native
}

