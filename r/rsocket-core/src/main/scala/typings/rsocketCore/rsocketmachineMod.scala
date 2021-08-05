package typings.rsocketCore

import typings.rsocketCore.anon.PartialISubscriberFrame
import typings.rsocketCore.rsocketleaseMod.RequesterLeaseHandler
import typings.rsocketCore.rsocketleaseMod.ResponderLeaseHandler
import typings.rsocketCore.rsocketserializationMod.PayloadSerializers
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketTypes.reactiveSocketTypesMod.Responder
import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketmachineMod {
  
  @JSImport("rsocket-core/RSocketMachine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]],
    errorHandler: Unit,
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]],
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    requestHandler: Partial[Responder[D, M]],
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: Unit,
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createClientMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    requestHandler: Partial[Responder[D, M]],
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], requestHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: Unit,
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ Error, Unit]
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: js.Function1[/* e */ Error, Unit],
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: Unit,
    requesterLeaseHandler: Unit,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  inline def createServerMachine[D, M](
    connection: DuplexConnection,
    connectionPublisher: js.Function1[/* partialSubscriber */ PartialISubscriberFrame, Unit],
    keepAliveTimeout: Double,
    serializers: PayloadSerializers[D, M],
    errorHandler: Unit,
    requesterLeaseHandler: RequesterLeaseHandler,
    responderLeaseHandler: ResponderLeaseHandler
  ): RSocketMachine[D, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerMachine")(connection.asInstanceOf[js.Any], connectionPublisher.asInstanceOf[js.Any], keepAliveTimeout.asInstanceOf[js.Any], serializers.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any], requesterLeaseHandler.asInstanceOf[js.Any], responderLeaseHandler.asInstanceOf[js.Any])).asInstanceOf[RSocketMachine[D, M]]
  
  @js.native
  trait RSocketMachine[D, M]
    extends StObject
       with ReactiveSocket[D, M] {
    
    def setRequestHandler(): Unit = js.native
    def setRequestHandler(requestHandler: Partial[Responder[D, M]]): Unit = js.native
  }
}
