package typings.rxDashLiteDashJoinpatterns.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] extends js.Object {
  def and[T9](other: Observable[T9]): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def thenDo[TR](
    selector: js.Function8[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      TR
    ]
  ): Plan[TR]
}

object Pattern8 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5, T6, T7, T8](
    and: Observable[js.Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, js.Any],
    thenDo: js.Function8[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      js.Any
    ] => Plan[js.Any]
  ): Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
  
    __obj.asInstanceOf[Pattern8[T1, T2, T3, T4, T5, T6, T7, T8]]
  }
}

