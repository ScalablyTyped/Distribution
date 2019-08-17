package typings.rsocketDashCore.rSocketMachineMod

import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typings.rsocketDashFlowable.rsocketDashFlowableMod.Single
import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import typings.rsocketDashTypes.reactiveSocketTypesMod.Responder
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketMachine", "ResponderWrapper")
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

