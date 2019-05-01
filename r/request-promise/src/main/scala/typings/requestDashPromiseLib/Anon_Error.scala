package typings
package requestDashPromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Error extends js.Object {
  def apply[U](): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def apply[U](onFulfill: js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def apply[U](
    onFulfill: js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]],
    onReject: js.Function1[/* error */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def apply[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
}

