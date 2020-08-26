package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketFlowable.mod.Flowable
import typings.rsocketFlowable.mod.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Responder[D, M] extends js.Object {
  /**
    * Fire and Forget interaction model of `ReactiveSocket`. The returned
    * Publisher resolves when the passed `payload` is successfully handled.
    */
  def fireAndForget(payload: Payload[D, M]): Unit = js.native
  /**
    * Metadata-Push interaction model of `ReactiveSocket`. The returned Publisher
    * resolves when the passed `payload` is successfully handled.
    */
  def metadataPush(payload: Payload[D, M]): Single[Unit] = js.native
  /**
    * Request-Channel interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestChannel(payloads: Flowable[Payload[D, M]]): Flowable[Payload[D, M]] = js.native
  /**
    * Request-Response interaction model of `ReactiveSocket`. The returned
    * Publisher resolves with the response.
    */
  def requestResponse(payload: Payload[D, M]): Single[Payload[D, M]] = js.native
  /**
    * Request-Stream interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestStream(payload: Payload[D, M]): Flowable[Payload[D, M]] = js.native
}

object Responder {
  @scala.inline
  def apply[D, M](
    fireAndForget: Payload[D, M] => Unit,
    metadataPush: Payload[D, M] => Single[Unit],
    requestChannel: Flowable[Payload[D, M]] => Flowable[Payload[D, M]],
    requestResponse: Payload[D, M] => Single[Payload[D, M]],
    requestStream: Payload[D, M] => Flowable[Payload[D, M]]
  ): Responder[D, M] = {
    val __obj = js.Dynamic.literal(fireAndForget = js.Any.fromFunction1(fireAndForget), metadataPush = js.Any.fromFunction1(metadataPush), requestChannel = js.Any.fromFunction1(requestChannel), requestResponse = js.Any.fromFunction1(requestResponse), requestStream = js.Any.fromFunction1(requestStream))
    __obj.asInstanceOf[Responder[D, M]]
  }
  @scala.inline
  implicit class ResponderOps[Self <: Responder[_, _], D, M] (val x: Self with (Responder[D, M])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFireAndForget(value: Payload[D, M] => Unit): Self = this.set("fireAndForget", js.Any.fromFunction1(value))
    @scala.inline
    def setMetadataPush(value: Payload[D, M] => Single[Unit]): Self = this.set("metadataPush", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestChannel(value: Flowable[Payload[D, M]] => Flowable[Payload[D, M]]): Self = this.set("requestChannel", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestResponse(value: Payload[D, M] => Single[Payload[D, M]]): Self = this.set("requestResponse", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestStream(value: Payload[D, M] => Flowable[Payload[D, M]]): Self = this.set("requestStream", js.Any.fromFunction1(value))
  }
  
}

