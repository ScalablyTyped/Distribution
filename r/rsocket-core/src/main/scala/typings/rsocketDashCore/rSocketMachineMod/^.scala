package typings.rsocketDashCore.rSocketMachineMod

import typings.rsocketDashCore.rSocketSerializationMod.PayloadSerializers
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import typings.rsocketDashTypes.reactiveSocketTypesMod.FrameWithData
import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import typings.rsocketDashTypes.reactiveSocketTypesMod.Responder
import typings.rsocketDashTypes.reactiveStreamTypesMod.ISubscriber
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketMachine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit]
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = js.native
  def deserializePayload[D, M](serializers: PayloadSerializers[D, M], frame: FrameWithData): Payload[D, M] = js.native
}

