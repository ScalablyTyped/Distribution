package typings.rsocketDashCore.rSocketServerMod

import typings.rsocketDashCore.rSocketSerializationMod.PayloadSerializers
import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import typings.rsocketDashTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketDashTypes.reactiveSocketTypesMod.Responder
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig[D, M] extends js.Object {
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
  var transport: TransportServer
  def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]]
}

object ServerConfig {
  @scala.inline
  def apply[D, M](
    getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]],
    transport: TransportServer,
    serializers: PayloadSerializers[D, M] = null
  ): ServerConfig[D, M] = {
    val __obj = js.Dynamic.literal(getRequestHandler = js.Any.fromFunction2(getRequestHandler), transport = transport)
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    __obj.asInstanceOf[ServerConfig[D, M]]
  }
}

