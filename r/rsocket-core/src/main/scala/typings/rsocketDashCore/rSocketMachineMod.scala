package typings.rsocketDashCore

import typings.rsocketDashCore.rSocketMachineMod.RSocketMachine
import typings.rsocketDashCore.rSocketSerializationMod.PayloadSerializers
import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typings.rsocketDashFlowable.rsocketDashFlowableMod.Single
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import typings.rsocketDashTypes.reactiveSocketTypesMod.FrameWithData
import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import typings.rsocketDashTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketDashTypes.reactiveSocketTypesMod.Responder
import typings.rsocketDashTypes.reactiveStreamTypesMod.ISubscriber
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
  
  @js.native
  class ResponderWrapper[D, M] protected () extends Responder[D, M] {
    def this(responder: Partial[Responder[D, M]]) = this()
    /**
      * Fire and Forget interaction model of `ReactiveSocket`. The returned
      * Publisher resolves when the passed `payload` is successfully handled.
      */
    /* CompleteClass */
    override def fireAndForget(payload: Payload[D, M]): Unit = js.native
    /**
      * Metadata-Push interaction model of `ReactiveSocket`. The returned Publisher
      * resolves when the passed `payload` is successfully handled.
      */
    /* CompleteClass */
    override def metadataPush(payload: Payload[D, M]): Single[Unit] = js.native
    /**
      * Request-Channel interaction model of `ReactiveSocket`. The returned
      * Publisher returns values representing the response(s).
      */
    /* CompleteClass */
    override def requestChannel(payloads: Flowable[Payload[D, M]]): Flowable[Payload[D, M]] = js.native
    /**
      * Request-Response interaction model of `ReactiveSocket`. The returned
      * Publisher resolves with the response.
      */
    /* CompleteClass */
    override def requestResponse(payload: Payload[D, M]): Single[Payload[D, M]] = js.native
    /**
      * Request-Stream interaction model of `ReactiveSocket`. The returned
      * Publisher returns values representing the response(s).
      */
    /* CompleteClass */
    override def requestStream(payload: Payload[D, M]): Flowable[Payload[D, M]] = js.native
    def setResponder(responder: Partial[Responder[D, M]]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rsocketDashCore.rsocketDashCoreStrings.CLIENT
    - typings.rsocketDashCore.rsocketDashCoreStrings.SERVER
  */
  trait Role extends js.Object
  
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

