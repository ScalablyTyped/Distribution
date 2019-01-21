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

