package typings.reduxTestkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToChangeInState extends js.Object {
  
  def toChangeInState(expectedChanges: js.Any): Unit = js.native
  
  def toReturnState(expected: js.Any): Unit = js.native
  
  def toStayTheSame(): Unit = js.native
}
object ToChangeInState {
  
  @scala.inline
  def apply(toChangeInState: js.Any => Unit, toReturnState: js.Any => Unit, toStayTheSame: () => Unit): ToChangeInState = {
    val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1(toChangeInState), toReturnState = js.Any.fromFunction1(toReturnState), toStayTheSame = js.Any.fromFunction0(toStayTheSame))
    __obj.asInstanceOf[ToChangeInState]
  }
  
  @scala.inline
  implicit class ToChangeInStateOps[Self <: ToChangeInState] (val x: Self) extends AnyVal {
    
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
    def setToChangeInState(value: js.Any => Unit): Self = this.set("toChangeInState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToReturnState(value: js.Any => Unit): Self = this.set("toReturnState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToStayTheSame(value: () => Unit): Self = this.set("toStayTheSame", js.Any.fromFunction0(value))
  }
}
