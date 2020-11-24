package typings.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canceled extends js.Object {
  
  def canceled(position: Double): String = js.native
  
  def dropped(from: Double, to: Double): String = js.native
  
  def item(position: Double): String = js.native
  
  def lifted(position: Double): String = js.native
  
  def moved(position: Double, up: Boolean): String = js.native
}
object Canceled {
  
  @scala.inline
  def apply(
    canceled: Double => String,
    dropped: (Double, Double) => String,
    item: Double => String,
    lifted: Double => String,
    moved: (Double, Boolean) => String
  ): Canceled = {
    val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction1(canceled), dropped = js.Any.fromFunction2(dropped), item = js.Any.fromFunction1(item), lifted = js.Any.fromFunction1(lifted), moved = js.Any.fromFunction2(moved))
    __obj.asInstanceOf[Canceled]
  }
  
  @scala.inline
  implicit class CanceledOps[Self <: Canceled] (val x: Self) extends AnyVal {
    
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
    def setCanceled(value: Double => String): Self = this.set("canceled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropped(value: (Double, Double) => String): Self = this.set("dropped", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItem(value: Double => String): Self = this.set("item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLifted(value: Double => String): Self = this.set("lifted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoved(value: (Double, Boolean) => String): Self = this.set("moved", js.Any.fromFunction2(value))
  }
}
