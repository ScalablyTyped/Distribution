package typings.rsocketDashCore

import typings.rsocketDashCore.rSocketLeaseMod.RequesterLeaseHandler
import typings.rsocketDashCore.rSocketLeaseMod.ResponderLeaseHandler
import typings.rsocketDashCore.rSocketMachineMod.RSocketMachine
import typings.rsocketDashCore.rSocketSerializationMod.PayloadSerializers
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import typings.rsocketDashTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketDashTypes.reactiveSocketTypesMod.Responder
import typings.rsocketDashTypes.reactiveStreamTypesMod.ISubscriber
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketMachine", JSImport.Namespace)
@js.native
object rSocketMachineMod extends js.Object {
  @js.native
  trait RSocketMachine[D, M] extends ReactiveSocket[D, M] {
    def setRequestHandler(): Unit = js.native
    def setRequestHandler(requestHandler: Partial[Responder[D, M]]): Unit = js.native
  }
  
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = js.native
  def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ Partial[ISubscriber[Frame]], Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = js.native
}

