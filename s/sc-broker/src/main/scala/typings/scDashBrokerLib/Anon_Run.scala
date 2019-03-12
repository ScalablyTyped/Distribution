package typings
package scDashBrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Run extends js.Object {
  var run: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_Run {
  @scala.inline
  def apply(run: () => scala.Unit = null): Anon_Run = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction0(run))
    __obj.asInstanceOf[Anon_Run]
  }
}

