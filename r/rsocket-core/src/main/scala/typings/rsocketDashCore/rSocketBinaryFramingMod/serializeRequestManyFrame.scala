package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestChannelFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestStreamFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeRequestManyFrame")
@js.native
object serializeRequestManyFrame extends js.Object {
  def apply(frame: RequestChannelFrame, encoders: Encoders[_]): Buffer = js.native
  def apply(frame: RequestStreamFrame, encoders: Encoders[_]): Buffer = js.native
}

