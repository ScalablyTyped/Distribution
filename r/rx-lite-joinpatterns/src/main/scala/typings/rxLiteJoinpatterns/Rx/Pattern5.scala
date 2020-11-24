package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern5[T1, T2, T3, T4, T5] extends js.Object {
  
  def and[T6](other: Observable[T6]): Pattern6[T1, T2, T3, T4, T5, T6] = js.native
  
  def thenDo[TR](
    selector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TR]
  ): Plan[TR] = js.native
}
object Pattern5 {
  
  @scala.inline
  def apply[T1, T2, T3, T4, T5](
    and: Observable[js.Any] => Pattern6[T1, T2, T3, T4, T5, js.Any],
    thenDo: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, js.Any] => Plan[js.Any]
  ): Pattern5[T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), thenDo = js.Any.fromFunction1(thenDo))
    __obj.asInstanceOf[Pattern5[T1, T2, T3, T4, T5]]
  }
  
  @scala.inline
  implicit class Pattern5Ops[Self <: Pattern5[_, _, _, _, _], T1, T2, T3, T4, T5] (val x: Self with (Pattern5[T1, T2, T3, T4, T5])) extends AnyVal {
    
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
    def setAnd(value: Observable[js.Any] => Pattern6[T1, T2, T3, T4, T5, js.Any]): Self = this.set("and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThenDo(
      value: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, js.Any] => Plan[js.Any]
    ): Self = this.set("thenDo", js.Any.fromFunction1(value))
  }
}
