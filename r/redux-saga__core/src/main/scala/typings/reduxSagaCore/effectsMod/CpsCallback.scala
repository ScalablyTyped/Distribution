package typings.reduxSagaCore.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpsCallback[R] extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  def apply(error: js.Any, result: R): Unit = js.native
}

