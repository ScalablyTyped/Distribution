package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactiveSocket[D, M] extends Responder[D, M] {
  /**
    * Close this `ReactiveSocket` and the underlying transport connection.
    */
  def close(): scala.Unit
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  def connectionStatus(): rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[ConnectionStatus]
}

object ReactiveSocket {
  @scala.inline
  def apply[D, M](
    close: () => scala.Unit,
    connectionStatus: () => rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[ConnectionStatus],
    fireAndForget: Payload[D, M] => scala.Unit,
    metadataPush: Payload[D, M] => rsocketDashFlowableLib.rsocketDashFlowableMod.Single[scala.Unit],
    requestChannel: rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]] => rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]],
    requestResponse: Payload[D, M] => rsocketDashFlowableLib.rsocketDashFlowableMod.Single[Payload[D, M]],
    requestStream: Payload[D, M] => rsocketDashFlowableLib.rsocketDashFlowableMod.Flowable[Payload[D, M]]
  ): ReactiveSocket[D, M] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionStatus = js.Any.fromFunction0(connectionStatus), fireAndForget = js.Any.fromFunction1(fireAndForget), metadataPush = js.Any.fromFunction1(metadataPush), requestChannel = js.Any.fromFunction1(requestChannel), requestResponse = js.Any.fromFunction1(requestResponse), requestStream = js.Any.fromFunction1(requestStream))
  
    __obj.asInstanceOf[ReactiveSocket[D, M]]
  }
}

