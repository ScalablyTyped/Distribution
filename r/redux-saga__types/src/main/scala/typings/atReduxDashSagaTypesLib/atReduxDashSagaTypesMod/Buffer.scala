package typings
package atReduxDashSagaTypesLib.atReduxDashSagaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer[T] extends js.Object {
  def flush(): js.Array[T]
  /**
    * Returns true if there are no messages on the buffer. A channel calls this
    * method whenever a new taker is registered
    */
  def isEmpty(): scala.Boolean
  /**
    * Used to put new message in the buffer. Note the Buffer can choose to not
    * store the message (e.g. a dropping buffer can drop any new message
    * exceeding a given limit)
    */
  def put(message: T): scala.Unit
  /**
    * used to retrieve any buffered message. Note the behavior of this method has
    * to be consistent with `isEmpty`
    */
  def take(): js.UndefOr[T]
}

object Buffer {
  @scala.inline
  def apply[T](
    flush: js.Function0[js.Array[T]],
    isEmpty: js.Function0[scala.Boolean],
    put: js.Function1[T, scala.Unit],
    take: js.Function0[js.UndefOr[T]]
  ): Buffer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("put")(put)
    __obj.updateDynamic("take")(take)
    __obj.asInstanceOf[Buffer[T]]
  }
}

