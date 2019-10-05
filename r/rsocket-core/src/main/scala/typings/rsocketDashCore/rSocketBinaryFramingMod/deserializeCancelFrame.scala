package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.CancelFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "deserializeCancelFrame")
@js.native
object deserializeCancelFrame extends js.Object {
  def apply(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): CancelFrame = js.native
}

