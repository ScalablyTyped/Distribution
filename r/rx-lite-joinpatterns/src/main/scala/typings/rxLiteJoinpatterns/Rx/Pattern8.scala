package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern8[T1, T2, T3, T4, T5, T6, T7, T8] extends js.Object {
  
  def and[T9](other: Observable[T9]): Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  
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
  ): Plan[TR] = js.native
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
  
  @scala.inline
  implicit class Pattern8Ops[Self <: Pattern8[_, _, _, _, _, _, _, _], T1, T2, T3, T4, T5, T6, T7, T8] (val x: Self with (Pattern8[T1, T2, T3, T4, T5, T6, T7, T8])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnd(value: Observable[js.Any] => Pattern9[T1, T2, T3, T4, T5, T6, T7, T8, js.Any]): Self = this.set("and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThenDo(
      value: js.Function8[
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
    ): Self = this.set("thenDo", js.Any.fromFunction1(value))
  }
}
