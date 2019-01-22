package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, scala.Unit]): scala.Unit
}

