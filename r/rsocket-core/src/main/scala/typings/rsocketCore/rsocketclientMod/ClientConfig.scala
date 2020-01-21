package typings.rsocketCore.rsocketclientMod

import typings.rsocketCore.AnonDataMimeType
import typings.rsocketCore.rsocketleaseMod.Leases
import typings.rsocketCore.rsocketserializationMod.PayloadSerializers
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Responder
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig[D, M] extends js.Object {
  var errorHandler: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.undefined
  var responder: js.UndefOr[Partial[Responder[D, M]]] = js.undefined
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
  var setup: AnonDataMimeType[D, M]
  var transport: DuplexConnection
}

object ClientConfig {
  @scala.inline
  def apply[D, M](
    setup: AnonDataMimeType[D, M],
    transport: DuplexConnection,
    errorHandler: /* error */ Error => Unit = null,
    leases: () => Leases[_] = null,
    responder: Partial[Responder[D, M]] = null,
    serializers: PayloadSerializers[D, M] = null
  ): ClientConfig[D, M] = {
    val __obj = js.Dynamic.literal(setup = setup.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (leases != null) __obj.updateDynamic("leases")(js.Any.fromFunction0(leases))
    if (responder != null) __obj.updateDynamic("responder")(responder.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig[D, M]]
  }
}

