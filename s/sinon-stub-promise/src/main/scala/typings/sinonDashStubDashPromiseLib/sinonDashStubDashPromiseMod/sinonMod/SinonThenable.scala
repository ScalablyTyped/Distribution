package typings
package sinonDashStubDashPromiseLib.sinonDashStubDashPromiseMod.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonThenable extends js.Object {
  var rejectValue: js.Any = js.native
  var rejected: scala.Boolean = js.native
  var resolveValue: js.Any = js.native
  var resolved: scala.Boolean = js.native
  def `catch`(onReject: js.Function1[/* rejectValue */ js.UndefOr[js.Any], scala.Unit]): SinonThenable = js.native
  def `finally`(callback: js.Function0[scala.Unit]): SinonThenable = js.native
  def `then`(onFulfill: js.Function1[/* resolveValue */ js.UndefOr[js.Any], scala.Unit]): SinonThenable = js.native
  def `then`(
    onFulfill: js.Function1[/* resolveValue */ js.UndefOr[js.Any], scala.Unit],
    onReject: js.Function1[/* rejectValue */ js.UndefOr[js.Any], scala.Unit]
  ): SinonThenable = js.native
}

