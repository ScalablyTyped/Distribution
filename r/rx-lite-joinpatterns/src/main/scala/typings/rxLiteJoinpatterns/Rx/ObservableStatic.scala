package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableStatic extends js.Object {
  
  def when[TR](plan: Plan[TR]): Observable[TR] = js.native
}
object ObservableStatic {
  
  @scala.inline
  def apply(when: Plan[js.Any] => Observable[js.Any]): ObservableStatic = {
    val __obj = js.Dynamic.literal(when = js.Any.fromFunction1(when))
    __obj.asInstanceOf[ObservableStatic]
  }
  
  @scala.inline
  implicit class ObservableStaticOps[Self <: ObservableStatic] (val x: Self) extends AnyVal {
    
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
    def setWhen(value: Plan[js.Any] => Observable[js.Any]): Self = this.set("when", js.Any.fromFunction1(value))
  }
}
