package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responder[D, M] extends js.Object {
  /**
    * Fire and Forget interaction model of `ReactiveSocket`. The returned
    * Publisher resolves when the passed `payload` is successfully handled.
    */
  def fireAndForget(payload: Payload[D, M]): scala.Unit
  /**
    * Metadata-Push interaction model of `ReactiveSocket`. The returned Publisher
    * resolves when the passed `payload` is successfully handled.
    */
  def metadataPush(payload: Payload[D, M]): rsocketDashFlowableLib.rsocketDashFlowableMod.Single[scala.Unit]
  /**
    * Request-Channel interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestChannel(payloads: rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]]): rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]]
  /**
    * Request-Response interaction model of `ReactiveSocket`. The returned
    * Publisher resolves with the response.
    */
  def requestResponse(payload: Payload[D, M]): rsocketDashFlowableLib.rsocketDashFlowableMod.Single[Payload[D, M]]
  /**
    * Request-Stream interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestStream(payload: Payload[D, M]): rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]]
}

object Responder {
  @scala.inline
  def apply[D, M](
    fireAndForget: Payload[D, M] => scala.Unit,
    metadataPush: Payload[D, M] => rsocketDashFlowableLib.rsocketDashFlowableMod.Single[scala.Unit],
    requestChannel: rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]] => rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]],
    requestResponse: Payload[D, M] => rsocketDashFlowableLib.rsocketDashFlowableMod.Single[Payload[D, M]],
    requestStream: Payload[D, M] => rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]]
  ): Responder[D, M] = {
    val __obj = js.Dynamic.literal(fireAndForget = js.Any.fromFunction1(fireAndForget), metadataPush = js.Any.fromFunction1(metadataPush), requestChannel = js.Any.fromFunction1(requestChannel), requestResponse = js.Any.fromFunction1(requestResponse), requestStream = js.Any.fromFunction1(requestStream))
  
    __obj.asInstanceOf[Responder[D, M]]
  }
}

