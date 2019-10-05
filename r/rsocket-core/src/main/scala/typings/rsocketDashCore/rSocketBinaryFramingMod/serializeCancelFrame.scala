package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.CancelFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeCancelFrame")
@js.native
object serializeCancelFrame extends js.Object {
  def apply(frame: CancelFrame, encoders: Encoders[_]): Buffer = js.native
}

