package typings
package rxDashLiteDashJoinpatternsLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pattern5[T1, T2, T3, T4, T5] extends js.Object {
  def and[T6](other: Observable[T6]): Pattern6[T1, T2, T3, T4, T5, T6]
  def thenDo[TR](
    selector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TR]
  ): Plan[TR]
}

