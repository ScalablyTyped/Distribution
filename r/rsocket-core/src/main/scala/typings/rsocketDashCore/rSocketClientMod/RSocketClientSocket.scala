package typings.rsocketDashCore.rSocketClientMod

import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typings.rsocketDashFlowable.rsocketDashFlowableMod.Single
import typings.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import typings.rsocketDashTypes.reactiveSocketTypesMod.ReactiveSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketClient", "RSocketClientSocket")
@js.native
class RSocketClientSocket[D, M] protected () extends ReactiveSocket[D, M] {
  def this(config: ClientConfig[D, M], connection: DuplexConnection) = this()
  /**
    * Close this `ReactiveSocket` and the underlying transport connection.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  /* CompleteClass */
  override def connectionStatus(): Flowable[ConnectionStatus] = js.native
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
}

