package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, scala.Unit]): scala.Unit
}

object TakeableChannel {
  @scala.inline
  def apply[T](take: js.Function1[js.Function1[/* message */ T | END, scala.Unit], scala.Unit]): TakeableChannel[T] = {
    val __obj = js.Dynamic.literal(take = take)
  
    __obj.asInstanceOf[TakeableChannel[T]]
  }
}

