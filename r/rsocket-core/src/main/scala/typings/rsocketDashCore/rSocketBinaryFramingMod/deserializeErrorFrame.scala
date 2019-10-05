package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.ErrorFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "deserializeErrorFrame")
@js.native
object deserializeErrorFrame extends js.Object {
  def apply(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): ErrorFrame = js.native
}

