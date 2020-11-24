package typings.reduxOptimisticUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Optimistic extends js.Object {
  
  /**
    * Optimistic information
    */
  var optimistic: Id = js.native
}
object Optimistic {
  
  @scala.inline
  def apply(optimistic: Id): Optimistic = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optimistic]
  }
  
  @scala.inline
  implicit class OptimisticOps[Self <: Optimistic] (val x: Self) extends AnyVal {
    
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
    def setOptimistic(value: Id): Self = this.set("optimistic", value.asInstanceOf[js.Any])
  }
}
