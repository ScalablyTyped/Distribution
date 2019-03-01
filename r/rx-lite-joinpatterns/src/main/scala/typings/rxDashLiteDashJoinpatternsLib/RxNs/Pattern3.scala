package typings
package rxDashLiteDashJoinpatternsLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern3[T1, T2, T3] extends js.Object {
  def and[T4](other: Observable[T4]): Pattern4[T1, T2, T3, T4]
  def thenDo[TR](selector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TR]): Plan[TR]
}

object Pattern3 {
  @scala.inline
  def apply[T1, T2, T3](
    and: js.Function1[Observable[js.Any], Pattern4[T1, T2, T3, js.Any]],
    thenDo: js.Function1[js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, js.Any], Plan[js.Any]]
  ): Pattern3[T1, T2, T3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("thenDo")(thenDo)
    __obj.asInstanceOf[Pattern3[T1, T2, T3]]
  }
}

