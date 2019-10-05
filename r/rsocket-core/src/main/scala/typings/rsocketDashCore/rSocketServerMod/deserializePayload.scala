package typings.rsocketDashCore.rSocketServerMod

import typings.rsocketDashCore.rSocketSerializationMod.PayloadSerializers
import typings.rsocketDashTypes.reactiveSocketTypesMod.FrameWithData
import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketServer", "deserializePayload")
@js.native
object deserializePayload extends js.Object {
  def apply[D, M](serializers: PayloadSerializers[D, M], frame: FrameWithData): Payload[D, M] = js.native
}

