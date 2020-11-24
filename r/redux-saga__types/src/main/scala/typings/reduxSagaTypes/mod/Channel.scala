package typings.reduxSagaTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel[T] extends js.Object {
  
  /**
    * Closes the channel which means no more puts will be allowed. All pending
    * takers will be invoked with `END`.
    */
  def close(): Unit = js.native
  
  /**
    * Used to extract all buffered messages from the channel. The flush is
    * resolved using the following rules
    *
    * - If the channel is closed and there are no buffered messages, then
    *   `callback` is invoked with `END`
    * - Otherwise `callback` is invoked with all buffered messages.
    */
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit = js.native
  
  /**
    * Used to put message on the buffer. The put will be handled using the
    * following rules
    *
    * - If the channel is closed, then the put will have no effect.
    * - If there are pending takers, then invoke the oldest taker with the
    *   message.
    * - Otherwise put the message on the underlying buffer
    */
  def put(message: T): Unit = js.native
  def put(message: END): Unit = js.native
  
  /**
    * Used to register a taker. The take is resolved using the following rules
    *
    * - If the channel has buffered messages, then `callback` will be invoked
    *   with the next message from the underlying buffer (using `buffer.take()`)
    * - If the channel is closed and there are no buffered messages, then
    *   `callback` is invoked with `END`
    * - Otherwise`callback` will be queued until a message is put into the
    *   channel
    */
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
}
