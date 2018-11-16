package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpsCallback extends js.Object {
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def apply(error: js.Any, result: js.Any): scala.Unit = js.native
}

