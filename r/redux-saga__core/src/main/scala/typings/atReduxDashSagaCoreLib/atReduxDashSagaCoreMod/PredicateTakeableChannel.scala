package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateTakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, scala.Unit]): scala.Unit = js.native
  def take(
    cb: js.Function1[/* message */ T | END, scala.Unit],
    matcher: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Predicate[T]
  ): scala.Unit = js.native
}

