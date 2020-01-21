package typings.relayRuntime.relayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionResolver[TEdge, TState] extends js.Object {
  def initialize(): TState
  def reduce(state: TState, event: ConnectionEvent[TEdge]): TState
}

object ConnectionResolver {
  @scala.inline
  def apply[TEdge, TState](initialize: () => TState, reduce: (TState, ConnectionEvent[TEdge]) => TState): ConnectionResolver[TEdge, TState] = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction0(initialize), reduce = js.Any.fromFunction2(reduce))
  
    __obj.asInstanceOf[ConnectionResolver[TEdge, TState]]
  }
}

