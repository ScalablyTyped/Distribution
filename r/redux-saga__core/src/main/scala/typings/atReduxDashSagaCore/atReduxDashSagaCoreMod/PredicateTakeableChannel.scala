package typings.atReduxDashSagaCore.atReduxDashSagaCoreMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateTakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
  def take(cb: js.Function1[/* message */ T | END, Unit], matcher: Predicate[T]): Unit = js.native
}

