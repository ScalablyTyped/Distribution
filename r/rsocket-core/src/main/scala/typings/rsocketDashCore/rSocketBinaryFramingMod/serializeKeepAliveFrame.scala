package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.KeepAliveFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", "serializeKeepAliveFrame")
@js.native
object serializeKeepAliveFrame extends js.Object {
  def apply(frame: KeepAliveFrame, encoders: Encoders[_]): Buffer = js.native
}

