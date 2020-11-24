package typings.reactStackGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appear extends js.Object {
  
  def appear(): Unit = js.native
  
  def appeared(): Unit = js.native
  
  def enter(): Unit = js.native
  
  def entered(): Unit = js.native
  
  def leaved(): Unit = js.native
}
object Appear {
  
  @scala.inline
  def apply(
    appear: () => Unit,
    appeared: () => Unit,
    enter: () => Unit,
    entered: () => Unit,
    leaved: () => Unit
  ): Appear = {
    val __obj = js.Dynamic.literal(appear = js.Any.fromFunction0(appear), appeared = js.Any.fromFunction0(appeared), enter = js.Any.fromFunction0(enter), entered = js.Any.fromFunction0(entered), leaved = js.Any.fromFunction0(leaved))
    __obj.asInstanceOf[Appear]
  }
  
  @scala.inline
  implicit class AppearOps[Self <: Appear] (val x: Self) extends AnyVal {
    
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
    def setAppear(value: () => Unit): Self = this.set("appear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAppeared(value: () => Unit): Self = this.set("appeared", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnter(value: () => Unit): Self = this.set("enter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntered(value: () => Unit): Self = this.set("entered", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeaved(value: () => Unit): Self = this.set("leaved", js.Any.fromFunction0(value))
  }
}
