package typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer[T] extends js.Object {
  def flush(): js.Array[T]
  /**
    * Returns true if there are no messages on the buffer. A channel calls this
    * method whenever a new taker is registered
    */
  def isEmpty(): Boolean
  /**
    * Used to put new message in the buffer. Note the Buffer can choose to not
    * store the message (e.g. a dropping buffer can drop any new message
    * exceeding a given limit)
    */
  def put(message: T): Unit
  /**
    * used to retrieve any buffered message. Note the behavior of this method has
    * to be consistent with `isEmpty`
    */
  def take(): js.UndefOr[T]
}

object Buffer {
  @scala.inline
  def apply[T](flush: () => js.Array[T], isEmpty: () => Boolean, put: T => Unit, take: () => js.UndefOr[T]): Buffer[T] = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), isEmpty = js.Any.fromFunction0(isEmpty), put = js.Any.fromFunction1(put), take = js.Any.fromFunction0(take))
  
    __obj.asInstanceOf[Buffer[T]]
  }
}

