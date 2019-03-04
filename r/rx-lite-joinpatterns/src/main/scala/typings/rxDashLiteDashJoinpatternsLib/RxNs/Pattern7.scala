package typings
package rxDashLiteDashJoinpatternsLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern7[T1, T2, T3, T4, T5, T6, T7] extends js.Object {
  def and[T8](other: Observable[T8]): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8]
  def thenDo[TR](
    selector: js.Function7[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      TR
    ]
  ): Plan[TR]
}

object Pattern7 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5, T6, T7](
    and: js.Function1[Observable[js.Any], Pattern8[T1, T2, T3, T4, T5, T6, T7, js.Any]],
    thenDo: js.Function1[
      js.Function7[
        /* item1 */ T1, 
        /* item2 */ T2, 
        /* item3 */ T3, 
        /* item4 */ T4, 
        /* item5 */ T5, 
        /* item6 */ T6, 
        /* item7 */ T7, 
        js.Any
      ], 
      Plan[js.Any]
    ]
  ): Pattern7[T1, T2, T3, T4, T5, T6, T7] = {
    val __obj = js.Dynamic.literal(and = and, thenDo = thenDo)
  
    __obj.asInstanceOf[Pattern7[T1, T2, T3, T4, T5, T6, T7]]
  }
}

