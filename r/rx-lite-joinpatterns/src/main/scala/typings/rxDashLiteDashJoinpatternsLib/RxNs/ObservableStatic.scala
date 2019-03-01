package typings
package rxDashLiteDashJoinpatternsLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableStatic extends js.Object {
  def when[TR](plan: Plan[TR]): Observable[TR]
}

object ObservableStatic {
  @scala.inline
  def apply(when: js.Function1[Plan[js.Any], Observable[js.Any]]): ObservableStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("when")(when)
    __obj.asInstanceOf[ObservableStatic]
  }
}

