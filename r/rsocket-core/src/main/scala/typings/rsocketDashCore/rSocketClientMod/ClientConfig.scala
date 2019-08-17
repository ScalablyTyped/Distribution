package typings.rsocketDashCore.rSocketClientMod

import typings.rsocketDashCore.Anon_DataMimeType
import typings.rsocketDashCore.rSocketSerializationMod.PayloadSerializers
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.Responder
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig[D, M] extends js.Object {
  var responder: js.UndefOr[Partial[Responder[D, M]]] = js.undefined
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
  var setup: Anon_DataMimeType
  var transport: DuplexConnection
}

object ClientConfig {
  @scala.inline
  def apply[D, M](
    setup: Anon_DataMimeType,
    transport: DuplexConnection,
    responder: Partial[Responder[D, M]] = null,
    serializers: PayloadSerializers[D, M] = null
  ): ClientConfig[D, M] = {
    val __obj = js.Dynamic.literal(setup = setup, transport = transport)
    if (responder != null) __obj.updateDynamic("responder")(responder)
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    __obj.asInstanceOf[ClientConfig[D, M]]
  }
}

