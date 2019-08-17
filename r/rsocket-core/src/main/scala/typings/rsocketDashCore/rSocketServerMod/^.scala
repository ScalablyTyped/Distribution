package typings.rsocketDashCore.rSocketServerMod

import typings.rsocketDashCore.rSocketSerializationMod.PayloadSerializers
import typings.rsocketDashTypes.reactiveSocketTypesMod.FrameWithData
import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketServer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserializePayload[D, M](serializers: PayloadSerializers[D, M], frame: FrameWithData): Payload[D, M] = js.native
}

