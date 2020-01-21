package typings.rsocketCore.rsocketserverMod

import typings.rsocketCore.rsocketleaseMod.Leases
import typings.rsocketCore.rsocketserializationMod.PayloadSerializers
import typings.rsocketTypes.reactiveSocketTypesMod.Payload
import typings.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketTypes.reactiveSocketTypesMod.Responder
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig[D, M] extends js.Object {
  var errorHandler: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.undefined
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
  var transport: TransportServer
  def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]]
}

object ServerConfig {
  @scala.inline
  def apply[D, M](
    getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]],
    transport: TransportServer,
    errorHandler: /* e */ Error => Unit = null,
    leases: () => Leases[_] = null,
    serializers: PayloadSerializers[D, M] = null
  ): ServerConfig[D, M] = {
    val __obj = js.Dynamic.literal(getRequestHandler = js.Any.fromFunction2(getRequestHandler), transport = transport.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (leases != null) __obj.updateDynamic("leases")(js.Any.fromFunction0(leases))
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig[D, M]]
  }
}

